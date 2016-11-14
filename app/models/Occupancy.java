package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by marne on 7/23/2016.
 */

/****************************************************************************************
 * This is a model class of entity type Occupancy
 * When an object of this  class is created we can access or update the attributes of Occupancy relation in database using the Ebean
 */

@Entity
@Table(name="Occupancy")
public class Occupancy extends Model {

    @Column(name="ReservationId")
    private int _reservationId;
    public void setReservationId(int reservationId){this._reservationId = reservationId;}
    public int getReservationId(){return _reservationId;}
    @Column(name="RoomNumber")
    private int _roomNumber;
    public void setRoomNumber(int roomNumber){this._roomNumber = roomNumber;}
    public int getRoomNumber(){return _roomNumber;}
    @Column(name="CheckIn")
    private Date _checkInDt;
    public void setCheckInDate(Date checkInDate){this._checkInDt = checkInDate;}
    public Date getCheckInDate(){return _checkInDt;}
    @Column(name="Days")
    private int _noOfDays;
    public void setNoOfDays(int noOfDays){this._noOfDays = noOfDays;}
    public int getNoOfDays(){return this._noOfDays;}


    public Occupancy(int reservationId, int roomNumber, Date checkInDt, int noOfDays){

        this._reservationId = reservationId;
        this._noOfDays = noOfDays;
        this._roomNumber = roomNumber;
        this._checkInDt = checkInDt;

    }



}
