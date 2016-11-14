package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by marne on 7/26/2016.
 */

/****************************************************************************************
 * The RedirectionController class extends Controller class and the methods in the class are related to
 * the menu options of Home, Guest, Admin and the options that appear based on the user selection like Book room, check status
 * and for admin menu options of Assign waiter, Rooms and RoomTypes
 */
public class RedirectionController extends Controller{

    /************************************************************************************
     * redirectHome() is  an action method that redirects the user to the homepage
     * @param none
     * @return index.scala.html
     */

    public Result redirectHome(){
        return ok(views.html.index.render());
    }


    /************************************************************************************
     * redirectGuest() is  an action method that redirects the user to the homepage
     * @param none
     * @return HomePage.scala.html where guest can enter his/her details
     */

    public Result redirectGuest(){
        return ok(views.html.HomePage.render());
    }

    /************************************************************************************
     * redirectAdmin() is  an action method that redirects the user to the Admin Page
     * @param none
     * @return AdminValidation.scala.html where the admin can chose the options of his/her choice
     */
    public Result redirectAdmin(){
        //Admin  HOme page
        return ok(views.html.AdminValidation.render());
    }


    /************************************************************************************
     * redirectBookRoom() is  an action method that redirects the user to the Page where the guest can book a room
     * @param none
     * @return GuestPreference.scala.html which displays the fields for entering guest preferences
     */
    public  Result redirectBookRoom() throws SQLException,ClassNotFoundException, IllegalAccessException, InstantiationException{

        int guestId = Integer.parseInt(session("guest"));
        String sql = "select GuestId from Guest where GuestId = ?" ;

        SqlRow listSql = Ebean.createSqlQuery(sql).setParameter(1,guestId).findUnique();



        if (listSql.getInteger("GuestId") == guestId) {

            //session("guest", Integer.toString(guestId));


            RoomType roomType = new RoomType();

            Set<String> roomTypeList = roomType.getRoomTypes();

            return ok(views.html.GuestPreference.render(roomTypeList));
        }

        else
            return ok("Not a valid session");
    }

    /************************************************************************************
     * redirectAdminWaiter() is  an action method that redirects the admin to the Page where
     * the admin can assign a waiter for room service to the room.
     * @param none
     * @return AssignWaiter.scala.html
     */
    public Result redirectAdminWaiter() throws SQLException, ClassNotFoundException,IllegalAccessException,InstantiationException{
        Room room = new Room();
        List<Integer> rooms = room.getAllRoomNumbers();

        Employee emp = new Employee();
        List<Employee> emps = emp.getAllEmpIds();




        return ok(views.html.AssignWaiter.render(rooms,emps));
    }


    /************************************************************************************
     * redirectAdminAddRoom() is  an action method that redirects the admin to the Page where
     * the admin can view the list of all rooms and add a room if he/she desires.
     * @param none
     * @return RoomDetails.scala.html
     */
    public Result redirectAdminAddRoom() {
        ReturnRoomView returnRoomView;



        String sqlSelect = "Select R.RoomNumber, R.RoomType, R.RPhoneNumber, E.EName from Room R left outer join Employee E on R.WaiterId = E.Eid";

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

    /************************************************************************************
     * redirectAdminAddRoomType() is  an action method that redirects the admin to the Page where
     * the admin can view the list of all rooms types and add a new room type if he/she desires.
     * @param none
     * @return RoomTypesList.scala.html
     */
    public Result redirectAdminAddRoomType(){
        List<RoomType> roomTypeList = Ebean.find(RoomType.class).findList();

        return ok(views.html.RoomTypesList.render(roomTypeList));
    }

    /************************************************************************************
     * redirectBookingStatus() is  an action method that redirects the guest to the Page where
     * the guest can view the details of all the rooms that are reserverd by the guest.
     * @param none
     * @return CheckBookingsStatus.scala.html
     */
    public Result redirectBookingStatus(){

        //select O.RoomNumber, O.CheckIn, O.Days from occupancy O join Reservation R
        //on O.ReservationId = R.ReservationId and R.GuestId = 78746;



        int guestId = Integer.parseInt(session("guest"));
        ArrayList<BookingStatus> listBStatus = new ArrayList<BookingStatus>();
        BookingStatus bstatus ;
        String sql = "select distinct O.RoomNumber, O.CheckIn, O.Days, R.GuestId from occupancy O, Reservation R" +
                " where O.ReservationId = R.ReservationId and R.GuestId = " +guestId;
        System.out.println("The guest id is" +guestId);
        List<SqlRow> listSqlRows = Ebean.createSqlQuery(sql).findList();
        //System.out.println("Sql" +sql);
        //System.out.println("The number of rows returned" + listSqlRows.size());
        for (SqlRow srow :
                listSqlRows) {

            bstatus = new BookingStatus();
            System.out.println("The current room number " + srow.getInteger("RoomNumber"));
            bstatus.roomNumber = srow.getInteger("RoomNumber");
            bstatus.checkInDt = srow.getDate("CheckIn");
            bstatus.Days = srow.getInteger("Days");

            listBStatus.add(bstatus);

        }

    return ok(views.html.CheckBookingsStatus.render(listBStatus));
    }
}
