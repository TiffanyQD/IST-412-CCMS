package Controller.Calendar;

import Controller.CaseCntl.Cases;
import Controller.Statuses.Status;
import java.time.ZonedDateTime;

public class Calendar {

    private String eventID;
    private  ZonedDateTime dateTime;
    private String courtRoom;
    private Cases associatedCase;

    public Status.Calendar_Status addEvent(){
        return Status.Calendar_Status.SUCCESS;
    }
    public Status.Calendar_Status editEvent(){
        return Status.Calendar_Status.SUCCESS;
    }
}
