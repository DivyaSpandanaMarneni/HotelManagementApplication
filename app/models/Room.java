package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marne on 7/24/2016.
 */

/****************************************************************************************
 * This is a model class of entity type Room
 * When an object of this  class is created we can access or update the attributes of Room relation in database using the Ebean
 */

@Entity
@Table(name="Room")
public class Room extends Model {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="RoomNumber")
    private Integer _roomNumber;
   // public void setRoomNumber(int roomNumber){this._roomNumber = roomNumber;}
    public int getRoomNumber(){return this._roomNumber;}

    @Column(name="RoomType")
    private String _roomType;
    public void setRoomType(String roomType){this._roomType = roomType;}
    public String getRoomType(){return this._roomType;}

    @Column(name="RPhoneNumber")
    private long _rPhoneNumber;
    public void setPhoneNumber(long phoneNumber){this._rPhoneNumber = phoneNumber;}
    public long getPhoneNumber(){return this._rPhoneNumber;}

    @Column(name="WaiterId",nullable = true)
    private Integer _waiterId;
    public void setWaiterId(Integer waiterId){this._waiterId = waiterId;}
    public Integer getWaiterId(){return this._waiterId;}




    public Room(){
       // this._roomNumber = -1;
        this._waiterId = -1;
        this._rPhoneNumber =  -1;
        this._roomType = null;

    }

    public Room(int roomNumber, String roomType, long phoneNumber, int waiterId ){
   //     this._roomNumber = roomNumber;
        this._roomType = roomType;
        this._rPhoneNumber = phoneNumber;
        this._waiterId = waiterId;
    }

    /************************************************************************************
     * getAllRoomNumbers() is  a Model class method that gets a List of all rooms in the hotel.
     * @param none
     * @return rooms
     */
    public List<Integer> getAllRoomNumbers() throws SQLException, ClassNotFoundException,IllegalAccessException,InstantiationException{

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB05_Test","root","Mdsp1891#");
        Statement stmt = conn.createStatement();

        String getAllRooms = "Select RoomNumber from Room;";
        ResultSet rs = stmt.executeQuery(getAllRooms);
        List<Integer> rooms = new ArrayList<Integer>();
        while(rs.next()) {

            rooms.add(rs.getInt("RoomNumber"));


        }
        return rooms;


    }

    public static Finder<Integer,Room> find = new Finder<Integer,Room> (Integer.class, Room.class);


}
