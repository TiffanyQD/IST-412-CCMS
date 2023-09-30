package Controller.JudgeCntl;

import Controller.DatabaseCntl.CCMSDatabase;
import Controller.Exception.CourtCaseMgmtSystemException;
import java.time.ZonedDateTime;

/**
 * Tiffany Dove
 * IST-412
 * 09/17/2023
 *
 * <p>This class contains information related to Judges.</p>
 *
 * <p>
 * <b>Description</b><br>
 * Search for specific cases using various filters and criteria.<br>
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
 * User needs to find a specific case or list of cases.<br>
 * Need to set a new court date or view existing schedules.
 * </p>
 *
 * <p>
 * <b>Normal Flow</b><br>
 * User selects Case Search function. User inputs search criteria (case number, party name, date, etc.)<br>
 * System displays matching cases. <br>
 * User selects a specific case to views details.<br>
 * User selected Calendar Management function.<br>
 * User chooses to add a new event or view existing events.<br>
 * User inputs the event details or selects a date to view.<br>
 * System confirms the addition or displays the schedule.
 * </p>
 *
 * <p>
 * <b>Post Conditions</b><br>
 * User has obtained the information they sought.<br>
 * Court's calendar is updated or displayed.
 * </p>
 *
 * <p>
 * <b>Exceptions</b><br>
 * No cases match the search criteria - Message displayed.<br>
 * System fails to fetch data - Error message displayed.<br>
 * System files to save event - Error message displayed.
 * </p>
 *
 */
public class Judge {
    String userId = null;
    String passwd;
    CCMSDatabase ccmsDatabase = null;
    private String caseNumber;
    private String partyName;
    private ZonedDateTime date;

    /**
     * This is the Judge class
     * @param userId - UserId for user to authenticate
     * @param passwd - Password for user to authenticate
     * @throws CourtCaseMgmtSystemException - Throws an exception
     */
    public Judge(String userId, String passwd) throws CourtCaseMgmtSystemException {

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
        ccmsDatabase.searchDatabase(caseNumber, partyName, date);
        return true;
    }

    /**
     * This method will allow the user to view case details
     */
    public void viewCaseDetails() {
        String displayCaseDetails = ccmsDatabase.displayCaseDetails();
    }

}

