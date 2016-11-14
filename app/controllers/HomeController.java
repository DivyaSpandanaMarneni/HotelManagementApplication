package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;
import models.Guest;
import models.Room;
import models.RoomType;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import play.twirl.api.Html;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {

        return ok(views.html.index.render());

    }

    /************************************************************************************
     * guestPage() is  an action method that redirects the user to the a view for choosing between guest and admin
     * @param none
     * @return HomePage.scala.html or AdminValidation.scala.html view depending on the user request
     */

    public Result guestPage() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        if(dynamicForm.get("guest") != null) {
            return ok(views.html.HomePage.render());
        }
        else if(dynamicForm.get("admin") != null) {
            return ok(views.html.AdminValidation.render());
        }
        else {
            return ok("Bad Request. Please check the URL.");
        }
    }


    /************************************************************************************
     * formData() is  an action method that redirects the user to the a view for entering guest details
     * @param none
     * @return ConfirmGuest.scala.html or GuestPreference.scala.html if the guest knows his id and enters the id. i.e., he can book the room directly.
     */

    public Result formData() throws SQLException,ClassNotFoundException, IllegalAccessException, InstantiationException{
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        Random random = new Random();
        int randId = random.nextInt((100000-20000) + 1) + 20000;

        if(dynamicForm.get("actionEvent") != null) {
        System.out.println(dynamicForm.get("Name")); //Retreiev the parameters based on the names given in the HTML page and pass those parameters to the model class.

        System.out.println(dynamicForm.get("gender"));
        System.out.println(dynamicForm.get("age"));
        System.out.println(dynamicForm.get("address"));
        Integer guestId = randId;
        String firstName = dynamicForm.get("Name");

        char gender = dynamicForm.get("gender").charAt(0);
        int age = Integer.parseInt(dynamicForm.get("age"));
        String address = dynamicForm.get("address");
        String state = dynamicForm.get("state");

        Guest gm = new Guest(guestId,firstName,gender,age,address,state);
        Ebean.save(gm);
        session("guest",guestId.toString());

        return ok(views.html.ConfirmGuest.render("Id", Html.apply(Integer.toString(guestId))));
        }

        else if(dynamicForm.get("guestIdSubmit") != null){
            int guestId = Integer.parseInt(dynamicForm.get("txtGuestId"));
            session("guest", Integer.toString(guestId));
            String sql =   "select GuestId from Guest where GuestId = " +guestId;
            SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
            List<SqlRow> list = sqlQuery.findList();

            if(list.get(0).toString().equals(Integer.toString(guestId))){

                session("guest",Integer.toString(guestId));


                RoomType roomType = new RoomType();

                Set<String> roomTypeList = roomType.getRoomTypes();

                return ok(views.html.GuestPreference.render(roomTypeList));

            }


        }


            return ok("Bad Request. Please check the URL.");

        }

}
