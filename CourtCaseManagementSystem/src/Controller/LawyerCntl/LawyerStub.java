package Controller.LawyerCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import java.time.ZonedDateTime;

public class LawyerStub {

    String userId = null;
    String passwd;
    private String caseNumber;
    private String partyName;
    private ZonedDateTime date;

    /**
     * This is the LawyerStub constructor.
     * @param userId - UserId for user to authenticate.
     * @param passwd - Password for user to authenticate.
     */
    public LawyerStub(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;
    }

    /**
     * This method just simulates checking if the user is authorized.
     * @param userId - UserId for user to authenticate.
     * @param passwd - Password for user to authenticate.
     * @throws CourtCaseMgmtSystemException if user is not authorized.
     */
    public void authorizeUser(String userId, String passwd) throws CourtCaseMgmtSystemException {
        // Simulate successful authorization for test user
        if (!"testUser".equals(userId) || !"testPass".equals(passwd)) {
            throw new CourtCaseMgmtSystemException("User is not authorized to access the database.");
        }
    }


    /**
     * This method simulates searching for a specific case.
     * @return returns true if successful.
     */
    public boolean searchSpecificCase() {
        return true;
    }

    /**
     * This method simulates allowing the user to view case details.
     */
    public void viewCaseDetails() {
        System.out.println("Viewing case details...");
    }

    /**
     * This method simulates uploading documents to the database.
     */
    public void uploadDocuments() {
        System.out.println("Uploading documents...");
    }

    /**
     * This method simulates confirming that the documents have been uploaded.
     */
    public void confirmUploadedDocuments() {
        System.out.println("Documents uploaded successfully.");
    }

    /**
     * This method simulates updating the case document list.
     */
    public void updateCaseDocumentList() {
        System.out.println("Updating case document list...");
    }
}
