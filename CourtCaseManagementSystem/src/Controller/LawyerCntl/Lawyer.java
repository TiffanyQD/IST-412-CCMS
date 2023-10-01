package Controller.LawyerCntl;

import Controller.CaseCntl.Cases;
import Controller.DatabaseCntl.CCMSDatabase;
import Controller.Exception.CourtCaseMgmtSystemException;
import Controller.UserCntl.User;
import java.io.File;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Tiffany Dove
 * IST-412
 * 09/17/2023
 *
 * <p>This class contains information related to Lawyers.</p>
 *
 * <p>
 * <b>Description</b><br>
 * Search for specific cases using various filters and criteria.<br>
 * Entering new documents related to specific cases into the system.
 * </p>
 *
 * <p>
 * <b>Pre Conditions</b><br>
 * User has logged into the Court Case Management System.
 * </p>
 *
 * <p>
 * <b>Triggers</b><br>
 * User needs to find a specific case or list of cases.
 * A new document is received related to a case.
 * </p>
 *
 * <p>
 * <b>Normal Flow</b><br>
 * User selects Case Search function. User inputs search criteria (case number, party name, date, etc.)<br>
 * System displays matching cases. <br>
 * User selects a specific case to views details.
 * </p>
 *
 * <p>
 * <b>Post Conditions</b><br>
 * User has obtained the information they sought.<br>
 * The Document is stored in the system and linked to the appropriate case.
 * </p>
 *
 * <p>
 * <b>Exceptions</b><br>
 * No cases match the search criteria - Message displayed.<br>
 * System fails to fetch data - Error message displayed.<br>
 * Uploads fails - Error message displayed.<br>
 * Unauthorized document type - Alert displayed.
 * </p>
 *
 */
public class Lawyer extends User {
    String userId = null;
    String passwd;
    CCMSDatabase ccmsDatabase = null;
    private String caseNumber;
    private String partyName;
    private ZonedDateTime date;
    List<Cases> casesList;


    /**
     * This is the lawyer class
     * @param userId - UserId for user to authenticate
     * @param passwd - Password for user to authenticate
     * @throws CourtCaseMgmtSystemException - Throws an exception
     */
    public Lawyer(String userId, String passwd) throws CourtCaseMgmtSystemException {

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
     * This method uploads documents to the database.
     */
    public void uploadDocuments(String caseNumber, File file){

    }

    /**
     * This method confirms that the documents have been uploaded.
     */
    public void confirmUploadedDocuments(){}

    /**
     * This method updates the case document list
     */
    public void updateCaseDocumentList(){}


}
