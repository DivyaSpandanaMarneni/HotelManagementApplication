package controllers;

import com.avaje.ebean.Ebean;
import models.Room;
import models.RoomType;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Int;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by marne on 7/24/2016.
 */

/****************************************************************************************
 * The AdminRoomController class extends Controller class and the methods in the class are related to
 * Room functionality of Hotel Management Application. This is as part of Admin module.
 */

public class AdminRoomController extends Controller {

    /************************************************************************************
     * addRoomButton action  method creates a list of rooms that are there in the hotel at present
     * @param none
     * @return AdminAddRoom.scala.html view with the list of all rooms and a button that provies the option to create a new Room.
     */

    public Result addRoomButton() throws SQLException, ClassNotFoundException,IllegalAccessException,InstantiationException{

        DynamicForm dynamicForm = Form.form().bindFromRequest();
        System.out.println("add room" +dynamicForm.get("AdminAddRoom"));
        if(dynamicForm.get("AdminAddRoom") != null){


            Set<String> roomTypeVals = new HashSet<String>();

            RoomType roomType = new RoomType();

            roomTypeVals = roomType.getRoomTypes();


            return ok(views.html.AdminAddRoom.render(roomTypeVals));

        }



        return ok("Bad request. Please check again");
    }

    /************************************************************************************
     * createRoom() action method creates a room of room type of admin choice
     * @param none
     * @return AddRoomSuccess.scala.html view that displays a message whether the creation of new room is successfull or not.
     */

    public Result createRoom(){
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        if(dynamicForm.get("CreateRoom") != null){

            //Integer roomNumber = Integer.parseInt(dynamicForm.get("roomNumber"));
            String roomType = dynamicForm.get("roomType").toString();
            Long roomPhoneNumber = Long.parseLong(dynamicForm.get("roomPhoneNumber"));

            Room room = new Room();

            room.setRoomType(roomType);
            room.setPhoneNumber(roomPhoneNumber);
            room.setWaiterId(null);

            Ebean.save(room);

            int roomNumber = room.getRoomNumber();  //get the inserted id
            return ok(views.html.AddRoomSuccess.render(roomNumber));

        }

        return ok("Failed to save details");

    }
}
