package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by marne on 7/22/2016.
 */

/****************************************************************************************
 * This is a model class of entity type RoomType
 * When an object of this  class is created we can access or update the attributes of RoomType relation in database using the Ebean
 */

@Entity
@Table(name="RoomType")
public class RoomType extends Model {

    public static Set<String> roomTypeList= new HashSet<String>();
    public static String roomTypeValue;
    @Id
    @Column(name="RoomType",unique = true,nullable = false)
    private String _roomType;
    public String getRoomType(){return _roomType;}
    public void setRoomType(String roomType){this._roomType = roomType;}

    @Column(name="Price")
    private double _price;
    public double getPrice(){return _price; }
    public void setPrice(double price){this._price = price;}


    @Column(name="BedsCount")
    private int _bedsCount;
    public int getBedsCount(){return this._bedsCount;}
    public void setBedsCount(int bedsCount){this._bedsCount = bedsCount;}

    @Column(name="WiFi")
    private String _wiFi;
    public String getWiFi(){return this._wiFi;}
    public void setWiFi(String wiFi){this._wiFi = wiFi;}

    @Column(name="Smoking")
    private String _smoking;
    public String getSmoking(){return this._smoking;}
    public void setSmoking(String smoking){this._smoking = smoking;}



    public RoomType(){
        this._roomType = null;
        this._bedsCount = 0;
        this._smoking = null;
        this._wiFi = null;
        this._price = 0;
    }

    public RoomType(String roomType, double price, int bedCount, String wiFi, String smoking){

        this._roomType = roomType;
        this._price = price;
        this._bedsCount = bedCount;
        this._wiFi = wiFi;
        this._smoking = smoking;

    }

    /************************************************************************************
     * getRoomTypes() is  a Model class method that gets a List of all RoomTypes in the hotel.
     * @param none
     * @return roomTypeList
     */
    public Set<String> getRoomTypes() throws SQLException,ClassNotFoundException, IllegalAccessException, InstantiationException{

        //Ebean.filter()
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB05_Test","root","Mdsp1891#");
        Statement stmt = conn.createStatement();

        String getAllSql = "Select RoomType from RoomType;";
        ResultSet rs = stmt.executeQuery(getAllSql);

        while(rs.next()) {

            roomTypeValue = rs.getString("RoomType").toString();
            roomTypeList.add(roomTypeValue);

        }
        return roomTypeList;
    }

    /************************************************************************************
     * getPriceForRoom() is  a Model class method that gets the price for a given room type.
     * @param roomType
     * @return roomPrice
     */
    public double getPriceForRoom(String roomType) throws SQLException,ClassNotFoundException, IllegalAccessException, InstantiationException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB05_Test","root","Mdsp1891#");
        Statement stmt = conn.createStatement();

        String getAllSql = "Select Price from RoomType where RoomTYpe = '" +roomType + "';";
        ResultSet rs = stmt.executeQuery(getAllSql);
        double roomPrice = 0;
        while(rs.next()) {

            roomPrice = rs.getDouble("Price");


        }
        return roomPrice;
    }


    public static Finder<String,RoomType> find = new Finder<String,RoomType> (String.class, RoomType.class);


}
