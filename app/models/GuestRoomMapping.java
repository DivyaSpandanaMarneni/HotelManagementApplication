package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by marne on 7/22/2016.
 */

/****************************************************************************************
 * This is a model class of entity type GuestRoomMapping
 * It indicates the the relation between Guest and the room that the guest books.
 * When an object of this  class is created we can access or update the attributes of Occupancy and Room relations in database using the Ebean
 */
@Entity
public class GuestRoomMapping extends Model {

    private String _roomType;

    public void setRoomType(String roomType){this._roomType = roomType;}
    public String getRoomType(){return this._roomType;}

    private int _noOfRooms;

    public void setNoOfRooms(int noRooms){this._noOfRooms = noRooms;}
    public int getNoOfRooms(){return this. _noOfRooms;}

    private Date _checkInDt;

    public void setCheckInDt(Date date){this._checkInDt = date;}
    public Date getCheckInDt(){return this._checkInDt;}

    private int _noOfDays;
    public void setNoOfDays(int noOfDays){this._noOfDays = noOfDays;}
    public int getNoOfDays(){return this._noOfDays;}


    /************************************************************************************
     * getAllocatedRooms() is  a Model class method that gets a set of rooms that can be allocated as per the user request.
     * @param roomType
     * @param checkInDate
     * @param noOfRooms
     * @return rooms
     */

    public Set<Integer> getAllocatedRooms(String roomType, LocalDate checkInDate, int noOfDays, int noOfRooms) throws SQLException, ClassNotFoundException,IllegalAccessException,InstantiationException{


        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB05_Test?characterEncoding=UTF-8", "root", "Mdsp1891#");
        try {
                    String getRooms = "Select R.RoomNumber " +
                "from Room R " +
                "where R.RoomType = '" +roomType +"'  " +
                " and R.RoomNumber not in (" +
                "Select O.RoomNumber " +
                "from Occupancy O " +
                "where O.CheckIn = '" + checkInDate+ "' and O.Days = " +noOfDays +
                ") limit " +noOfRooms+";";

            //String getRooms = "Select RoomNumber from Room limit 1";
            Statement stmt = conn.createStatement();
            System.out.println(roomType);
            System.out.println(checkInDate);


            Set<Integer> rooms = new HashSet<Integer>();

            System.out.println("****** \n" + getRooms + "\n ******");
            ResultSet rs = stmt.executeQuery(getRooms);

            while (rs.next()) {

                rooms.add(rs.getInt("RoomNumber"));

            }
            return rooms;
        } catch(SQLException e) {
            return null;
        }
        finally {
            conn.close();
        }


    }





}
