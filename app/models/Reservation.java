package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by marne on 7/23/2016.
 */

/****************************************************************************************
 * This is a model class of entity type Reservation
 * When an object of this  class is created we can access or update the attributes of Reservation relation in database using the Ebean
 */

@Entity
@Table(name="Reservation")
public class Reservation extends Model {


    @Id  @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ReservationId",unique = true)
    private Integer _reservationid;
    public int getReservationId(){return _reservationid;}


    @Column(name="GuestId")
    private Integer _guestId;
    public void setGuestId(int guestId){this._guestId = guestId;}
    public int getGuestId(){return _guestId;}
    @Column(name="BillAmount")
    private double _bill;
    public void setBill(double bill){this._bill = bill;}
    public double getBill(){return _bill;}


    public Reservation(Integer guestId, Double bill){
        this._guestId = guestId;
        this._bill = bill;
    }


    public static Finder<Integer,Reservation> find = new Finder<Integer,Reservation> (Integer.class, Reservation.class);

}
