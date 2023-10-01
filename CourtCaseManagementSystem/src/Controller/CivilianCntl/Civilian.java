package Controller.CivilianCntl;

import Controller.CaseCntl.Cases;
import Controller.DatabaseCntl.CCMSDatabase;
import Controller.Exception.CourtCaseMgmtSystemException;
import Controller.UserCntl.User;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Tiffany Dove
 * IST-412
 * 09/17/2023
 *
 * <p>This class contains information related to Civilians.</p>
 *
 * <p>
 * <b>Description</b><br>
 * Managing court schedules, including hearing dates, trail dates, and other events.
 * </p>
 *
 * <p>
 * <b>Pre Conditions</b><br>
 * User has logged into the Court Case Management System.
 * </p>
 *
 * <p>
 * <b>Triggers</b><br>
 * Need to set a new court date or view existing schedules.
 * </p>
 *
 * <p>
 * <b>Normal Flow</b><br>
 * User selected Calendar Management function.<br>
 * User chooses to add a new event or view existing events.<br>
 * User inputs the event details or selects a date to view.<br>
 * System confirms the addition or displays the schedule.
 * </p>
 *
 * <p>
 * <b>Post Conditions</b><br>
 * Court's calendar is updated or displayed.
 * </p>
 *
 * <p>
 * <b>Exceptions</b><br>
 * Date/time conflict a courtroom - Conflict alert displayed.
 * System files to save event - Error message displayed.
 * </p>
 *
 */
public class Civilian extends User {
    String userId = null;
    String passwd;
    CCMSDatabase ccmsDatabase = null;
    private String caseNumber;
    private String partyName;
    private ZonedDateTime date;
    List<Cases> casesList;

    /**
     * This is the Judge class
     * @param userId - UserId for user to authenticate
     * @param passwd - Password for user to authenticate
     * @throws CourtCaseMgmtSystemException - Throws an exception
     */
    public Civilian(String userId, String passwd) throws CourtCaseMgmtSystemException {

        authorizeUser(userId, passwd);
    }

    /**
     * This method checks to see whether the user is authorized.
     * @param userId - UserId for user to authenticate
     * @param passwd - Password for user to authenticate
     * @throws CourtCaseMgmtSystemException - Throws an exception
     */
    private void authorizeUser(String userId, String passwd) throws CourtCaseMgmtSystemException {
        ccmsDatabase = new CCMSDatabase(userId, passwd);
        boolean userAuthorized = ccmsDatabase.isUserAuthorized(userId, passwd);
        if (!userAuthorized) {
            throw new CourtCaseMgmtSystemException("User is not authorized to access the database.");
        }
    }

    /**
     * This method will be used to call the database and search for a specific case.
     *
     * @return returns true if successful
     */
    public boolean searchSpecificCase() {
        return ccmsDatabase.searchDatabase(casesList, caseNumber);
    }

    /**
     * This method will allow the user to view case details
     */
    public void viewCaseDetails() throws CourtCaseMgmtSystemException {
        List<Cases> cases = ccmsDatabase.displayCaseDetails(casesList, caseNumber);
    }

    /**
     * This method will allow the user to select the various calendar management functions.
     */
    public void selectCalendarManagementFunction(){}

    /**
     * This method will add a new event.
     */
    public void addNewEvent(){}

    /**
     * This method will view existing events.
     */
    public void viewExistingEvents(){}

    /**
     * This method is used to input event details.
     */
    public void  inputEventDetails(){}

    /**
     * This method is used to input event details.
     */
    public void selectADateToView(){}

    /**
     * This method confirms the additions to the schedules
     */
    public void confirmAdditionToSchedule(){}

    /**
     * This method is used to display the schedule.
     */
    public void displaySchedule(){}

}

