package Controller.DatabaseCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import java.time.ZonedDateTime;

/**
 * <p>This class will be used to house the CCMSDatabase information.</p>
 *
 * <p>
 * <b>Description</b><br>
 * Ensure the Court Case Management System's database is running smoothly, updated, backed up, and
 * optimized for performance.
 * </p>
 *
 * <p>
 * <b>Pre Conditions</b><br>
 * System Administrator/Clerk has logged into the Court Case Management System with appropriate credentials.
 * </p>
 *
 * <p>
 * <b>Triggers</b><br>
 * Database maintenance schedule, database update, or a manual trigger by System Administrator.
 *
 * <p>
 * <b>Normal Flow</b><br>
 * System Administrator/Clerk selects the Database Management function.<br>
 * The system display database health statistics.<br>
 * System Administrator/Clerk performs the required action: Update, Backup, Restore, or Optimized.<br>
 * The system confirms the action taken.
 * </p>
 *
 * <p>
 * <b>Post Conditions</b><br>
 * Database is updated, backed-up, optimized state.
 * </p>
 *
 * <p>
 * <b>Exceptions</b><br>
 * Database fails to respond - Error message displayed.<br>
 * Unauthorized access attempt - Error message displayed.
 * </p>
 *
 */
public class CCMSDatabase {
    public String userId;
    public String passwd;
    boolean isUserAuthorized;

    /**
     * This class is designated for the Database Management
     * @param userId - pass userId to constructor
     * @param passwd - pass password to constructor
     */
    public CCMSDatabase(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;
    }

    /**
     * This method is used to connect to the Case Management System.
     */
    public boolean connectToCCMSDatabase() throws CourtCaseMgmtSystemException {
        try {
            return true;
        } catch (Exception exception){
            throw new CourtCaseMgmtSystemException("Error Connecting to the CCMS Database.", exception);
        }
    }

    /**
     * This method checks to see if the user is authorized.
     * @param userId - the userid to check
     * @param passwd - the password to check
     * @return return true if authorized; return false if not authorized.
     */
    public boolean isUserAuthorized(String userId, String passwd){
        return true;
    }

    /**
     * This method is used to schedule database management from the court administrator.
     * @return returns true if the database management was successfully scheduled.
     */
    public boolean databaseManagementSchedule(){
        return true;
    }

    /**
     * This method is triggered by the CourtAdministrator to perform maintenance on the database.
     * @return returns true if successfully and manually triggered by the Court Administrator.
     */
    public boolean manuallyTriggerByTheCourtAdministrator(){
        return true;
    }

    /**
     * This method will be used in selecting the Database Management functions.
     */
    public void selectDatabaseManagementFunctions(){}

    /**
     * This method will display database health statistics
     */
    public void displayDatabaseHealthStatistics(){}


    /**
     * This method will be used to restore the database.
     * @return return true if administrator was able to restore the database.
     */
    public boolean restoreDatabase(){
        return true;
    }

    /**
     * This method will be used to back up the database.
     * @return return true if the administrator was able to back up the database.
     */
    public boolean backupDatabase(){
        return true;
    }

    /**
     * This method will be used to optimize the database.
     * @return return true if the database was optimized successfully by the administrator
     */
    public boolean optimizeDatabase(){
        return true;
    }

    /**
     * This method will be used to udpate the database
     * @return return true if the database was updated up success
     */
    public boolean updateDatabase(){
        return true;
    }

    /**
     * This method will be used to search the database for a specific case.
     * @param caseNumber - Case Number to search for.
     * @param partyName - Party name to search for.
     * @param zonedDateTime - Thread proof date to search for
     * @return - returns true if successful
     */
    public boolean searchDatabase(String caseNumber, String partyName, ZonedDateTime zonedDateTime) {
        return true;
    }

    /**
     * This method will display matching court cases.
     * @return - returns a string of matching court cases.
     * @throws CourtCaseMgmtSystemException
     */
    public String displayMatchingCases() throws CourtCaseMgmtSystemException {
        return "Display Matching Cases";
    }

    public String displayCaseDetails() {
        return "Display Case Details";
    }
}
