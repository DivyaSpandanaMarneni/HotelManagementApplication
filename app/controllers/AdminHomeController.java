package controllers;

import com.avaje.ebean.*;
import models.Employee;
import models.ReturnRoomView;
import models.Room;
import models.RoomType;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marne on 7/24/2016.
 */

/****************************************************************************************
 * The AdminHomeController class extends Controller class and the methods in the class are related to
 * menu that the admin can use and the menu options call different activities that the admin can do.
 */
public class AdminHomeController extends Controller {

    /************************************************************************************
     * checkAdmin() action method validates whether the user is an admin or not.
     * If the user is an admin it redirects the admin to the page where the menu for admin operations is present.
     * @param none
     * @return AdminHome.scala.html view or NotAdmin.scala.html view depending on the success or failure to validate the admin respectively.
     */
    public Result checkAdmin() {

        DynamicForm dynamicForm = Form.form().bindFromRequest();
        if(dynamicForm.get("adminIdSubmit") != null){
            int adminId = Integer.parseInt(dynamicForm.get("txtAdminId"));


            if(adminId == 1001){
                return ok(views.html.AdminHome.render());
            }
            else
                return ok(views.html.NotAdmin.render());

        }
        else
            return ok("Something went wrong.");

    }

    /************************************************************************************
     * adminRedirect() action method redirects to one of the pages of 'Assign Waiter', 'Rooms' or 'Room Types' depending on the button click on the Admin page.
     * @param none
     * @return AssignWaiter.scala.html view or RoomDetails.scala.html or RoomTypesList view depending on the admin's button click.
     */

    public Result adminRedirect() throws SQLException, ClassNotFoundException,IllegalAccessException,InstantiationException{
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        if(dynamicForm.get("waiter") != null) { //load assign watiers form

            Room room = new Room();
            List<Integer> rooms = room.getAllRoomNumbers();

            Employee emp = new Employee();
            List<Employee> emps = emp.getAllEmpIds();

            return ok(views.html.AssignWaiter.render(rooms,emps));
        }
        else if(dynamicForm.get("room") != null) {

            ReturnRoomView returnRoomView;


            String sqlSelect = "Select R.RoomNumber, R.RoomType, R.RPhoneNumber, E.EName from Room R left outer join Employee E on R.WaiterId = E.Eid order by R.RoomNumber";

            SqlQuery sqlQuery = Ebean.createSqlQuery(sqlSelect);
            List<SqlRow> sqlList = sqlQuery.findList();
            System.out.println("The number of rows is " +sqlList.size());
            List<ReturnRoomView> roomsView = new ArrayList<ReturnRoomView>();
            for (SqlRow row :
                    sqlList) {

                returnRoomView = new ReturnRoomView();
                returnRoomView.roomNumber = row.getInteger("RoomNumber");
                returnRoomView.roomType = row.getString("RoomType");
                returnRoomView.roomPhoneNumber = row.getLong("RPhoneNumber");
                returnRoomView.roomWaiter = row.getString("EName");

                roomsView.add(returnRoomView);
            }

            System.out.println("The count of rooms is " +roomsView.size());



            return ok(views.html.RoomDetails.render(roomsView));
        }

        else if(dynamicForm.get("roomType") != null){

            List<RoomType> roomTypeList = Ebean.find(RoomType.class).findList();

            return ok(views.html.RoomTypesList.render(roomTypeList));
        }

        else {
            return ok("Bad Request. Please check the URL.");
        }


    }


}
