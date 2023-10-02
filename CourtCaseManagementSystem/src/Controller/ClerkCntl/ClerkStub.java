package Controller.ClerkCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import java.time.ZonedDateTime;

public class ClerkStub {
    String userId = null;
    String passwd;
    private String caseNumber;
    private String partyName;
    private ZonedDateTime date;

    public ClerkStub(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;
    }

    public void authorizeUser(String userId, String passwd) throws CourtCaseMgmtSystemException {
        if (!"testUser".equals(userId) || !"testPass".equals(passwd)) {
            throw new CourtCaseMgmtSystemException("User is not authorized to access the database.");
        }
    }


    public boolean searchSpecificCase() {
        // Simulate a successful search
        return true;
    }

    public void viewCaseDetails() {
        // Simulate viewing case details
    }

    public void uploadDocuments() {
        // Simulate uploading documents
    }

    public void confirmUploadedDocuments() {
        // Simulate confirming uploaded documents
    }

    public void updateCaseDocumentList() {
        // Simulate updating the case document list
    }
}
