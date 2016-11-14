package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.SqlUpdate;
import models.Employee;
import models.Room;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by marne on 7/24/2016.
 */

/****************************************************************************************
 * The AssignWaiterController class extends Controller class and the methods in the class are related to
 * the admin functionality of adding waiters who perform room service to the related rooms in our
 * Hotel Management Application. This is as part of Admin module.
 */
public class AssignWaiterController extends Controller {

    /************************************************************************************
     * updateRoomWaiter is  an action method that reads the values of room number and waiter name from the form
     * and saves the relation between room and the waiter in the database.
     * It assigns the selected waiter to the selected room in the form.
     * @param none
     * @return WaiterUpdateSuccess.scala.html view that has the success message if the waiter is assigned successfully.
     * @return (alternative) It shows an error message that something is wrong in case assigning the waiter fails.
     */

    public Result updateRoomWaiter(){

        DynamicForm dynamicForm = Form.form().bindFromRequest();

        Integer roomNumber = Integer.parseInt(dynamicForm.get("room").toString());
        System.out.println("room number is " +roomNumber);
        int waiterId = Integer.parseInt(dynamicForm.get("employee"));
        System.out.println("waiter id is " +waiterId);

        String getWaiterName = "Select EName from Employee where Eid =  ?";
        SqlRow sqlRow = Ebean.createSqlQuery(getWaiterName).setParameter(1,waiterId).findUnique();

        String waiterName = sqlRow.getString("EName");



        if(dynamicForm.get("action") != null){

            Room room = new Room(roomNumber,null,-1,-1);

            String sql = "UPDATE Room SET WaiterId = " +waiterId + " WHERE RoomNumber = " +roomNumber +";"; // Simple SQL query with expired as variable, table_name and price_field need to be replaced
            SqlUpdate update = Ebean.createSqlUpdate(sql);

            int updateCounter = update.execute();

            if(updateCounter > 0) {
                return ok(views.html.WaiterUpdateSuccess.render(roomNumber,waiterName));
            }

        }

        return ok("Something went ");

    }

}
