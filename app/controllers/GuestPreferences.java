package controllers;

import com.avaje.ebean.Ebean;
import javafx.scene.input.DataFormat;
import models.*;
import models.GuestPreferenceViewRender;
import models.view.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.format.Formats;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by marne on 7/22/2016.
 */

/****************************************************************************************
 * The GuestPreferences class extends Controller class and the methods in the class are related to
 * the guest activity of booking a room as per his/her preference.
 */
public class GuestPreferences extends Controller{

    /************************************************************************************
     * GuestPreferenceRedirect is  a button click event method that redirects the guest to the a view for booking a room.
     * The guest is given with the option of chosing a room type from the available ones.
     * @param none
     * @return GuestPreference.scala.html view that has the options to enter details of the guest preferences.
     */

    public Result GuestPreferenceRedirect() throws SQLException,ClassNotFoundException,IllegalAccessException, InstantiationException{

        RoomType roomType = new RoomType(null,0,0,null,null);

        Set<String>   roomTypeList = roomType.getRoomTypes();
        return ok(views.html.GuestPreference.render(roomTypeList));
    }


    /************************************************************************************
     * GuestRoomAllocation is  a button click event method that calls the reads the values from the GuestPreference view
     * and calls the Model class method from GuestRoomMapping model class for
     * determining which room to be allocated and the price of the related room.
     * @param none
     * @return BookingDetails.scala.html view  or NoBooking.scala.html depending the success or failure to book a room respectively.
     */

    public Result GuestRoomAllocation() throws SQLException, ClassNotFoundException,IllegalAccessException,InstantiationException {

        Integer guest = Integer.parseInt(session("guest"));
        GuestRoomMapping guestRoom = new GuestRoomMapping();
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        double roomPrice;
        String _roomType = dynamicForm.get("roomType").toString();
        System.out.println(_roomType);
        int _noOfDays = Integer.parseInt(dynamicForm.get("noofdays"));
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
        //DateTimeFormatter newDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate _checkInDate = LocalDate.parse(dynamicForm.get("startdate").toString(), dateFormatter);
        //Date date = _checkInDate.t;
        //String _reqCheckInDate = _checkInDate.format(newDateFormat);
        System.out.println(_checkInDate);
        int _noOfRooms = Integer.parseInt(dynamicForm.get("noofrooms"));

        Set<Integer> rooms = new HashSet<Integer>();

        rooms = guestRoom.getAllocatedRooms(_roomType, _checkInDate, _noOfDays, _noOfRooms);

        if(rooms.size() > 0 && rooms.size() == _noOfRooms){

            RoomType roomType = new RoomType();
            roomType.setRoomType(_roomType);
            Double price = 0.00;

            price = roomType.getPriceForRoom(_roomType);

            Double bill = _noOfRooms * price * _noOfDays; // calculate the bill for the particular room type.

            Reservation reservation = new Reservation(guest, bill);


            //save in occupancy table also
            Ebean.save(reservation); // for inserting data into reservation table with guestid and bill
            Integer reservationId = reservation.getReservationId();

            //code for inserting data into occupancy table
            Occupancy occupancy = null;
            java.sql.Date date = java.sql.Date.valueOf(_checkInDate);
            StringBuilder sbRooms = new StringBuilder();

            for (int room :
                    rooms) {
                occupancy = new Occupancy(reservationId, room, date, _noOfDays);
                Ebean.save(occupancy);
                sbRooms = sbRooms.append(Integer.toString(room));
                sbRooms.append(" ");
            }
            models.view.GuestPreferenceViewRender gpView = new models.view.GuestPreferenceViewRender();
            //below four should be returned to the view


            gpView.rooms = sbRooms; //integer list of room numbers
            gpView.checkInDt = date;
            gpView.noOfDays = _noOfDays;
            gpView.noOfRooms = _noOfRooms;
            gpView.bill = bill;


            return ok(views.html.BookingDetails.render(gpView));
        }

        else
        {
            return ok(views.html.NoBooking.render());
        }

    }

}
