package controllers;

import com.avaje.ebean.Ebean;
import models.RoomType;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by marne on 7/25/2016.
 */

/****************************************************************************************
 * The AdminRoomTypeController class extends Controller class and the methods in the class are related to
 * Room Type functionality of Hotel Management Application. This is as part of Admin module.
 */
public class AdminRoomTypeController extends Controller {

    /************************************************************************************
     * addNewRoomType action method redirects the admin to the new view for adding a room type.
     * @param none
     * @return AddRoomType.scala.html view that has the options to enter details of a new Room type.
     */

    public Result addNewRoomType() {

        DynamicForm dynamicform = Form.form().bindFromRequest();
        if (dynamicform.get("AdminAddRoom") != null) {

            return ok(views.html.AddRoomType.render());
        }


        return ok("Something went wrong");
    }

    /************************************************************************************
     * createRoom is an action method that is called when details are entered in the AddRoomType.scala.html view.
     * This method creates a new Room type in the database.
     * @param none
     * @return RoomTypeUpdateSuccess.scala.html  or an error message in the view depending on whether adding room type is successfull or not.
     */
    public Result createRoom() {

        DynamicForm dynamicForm = Form.form().bindFromRequest();
        String roomType = dynamicForm.get("roomType");
        Double price = Double.parseDouble(dynamicForm.get("price"));
        int bedCount = Integer.parseInt(dynamicForm.get("beds"));
        String wifi = dynamicForm.get("wifi");
        String smoking = dynamicForm.get("smoking");

        RoomType roomTypeObj = new RoomType(roomType, price, bedCount, wifi, smoking);

        if (dynamicForm.get("AddRoomType") != null) {

            Ebean.save(roomTypeObj);
            String message = "New Room type is created Successfully";

            return ok(views.html.RoomTypeUpdateSuccess.render(message));
        } else{

            String message = "Failed to create a new Room type";

            return ok(views.html.RoomTypeUpdateSuccess.render(message));

        }



    }
}