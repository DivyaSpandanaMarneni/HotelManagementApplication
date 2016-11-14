package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by marne on 7/21/2016.
 */

/****************************************************************************************
 * This is a model class of entity type Guest
 * When an object of this  class is created we can access or update the attributes of Guest relation in database using the Ebean
 */
@Entity
@Table(name="Guest")
public class Guest extends Model{

    @Id
    @Column(name="GuestId",unique = true,nullable = false)
    private int _guestId;
    public int getGuestId(){
        return _guestId;
    }

    @Column(name="age")
    private int _age;
    public int getSSN(){return _age;}
    public void setSSN(int age){this._age = age;}

    @Column(name="GName",nullable=false)
    private String _gname;
    public String getFname(){return _gname;}
    public void setFname(String fname){this._gname = fname;}

   @Column(name="Gender",nullable=false)
    private char _gender;
    public char getGender(){return _gender;}
    public void setGender(char gender){this._gender = gender;}

    @Column(name="address",nullable=false)
    private String _address;
    public String getAddress(){return _address;}
    public void setAddress(String address){this._address = address;}

    @Column(name="State")
    private String _state;
    public String getState(){return this._state;}
    public void setState(String state){this._state = state;}

    public Guest(int guestId, String gname, char gender,int age, String address, String state){
        this._guestId = guestId;
        this._age = age;
        this._gname = gname;
        this._gender = gender;
        this._address = address;
        this._state = state;
    }

    public static Finder<Integer,Guest> find = new Finder<Integer,Guest> (Integer.class, Guest.class);

}
