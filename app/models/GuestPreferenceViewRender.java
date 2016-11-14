package models;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by marne on 7/23/2016.
 */
/****************************************************************************************
 * This is a model class which indicates the view details that are to be rendered when an  object of GuestPreferenceViewRender class is created
 */
public class GuestPreferenceViewRender {

        public ArrayList<Integer> rooms = new ArrayList<>();
        public Date checkInDt ;
        public int noOfDays;
        public int noOfRooms;
}
