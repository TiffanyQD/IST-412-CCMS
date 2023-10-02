package Controller.JudgeCntl;

import Controller.DatabaseCntl.CCMSDatabaseStub;
import Controller.Exception.CourtCaseMgmtSystemException;
import java.time.ZonedDateTime;

public class JudgeStub {
    String userId = "testUserId";
    String passwd = "testPassword";
    CCMSDatabaseStub ccmsDatabaseStub = null;
    private String caseNumber = "testCaseNumber";
    private String partyName = "testPartyName";
    private ZonedDateTime date = ZonedDateTime.now();

    public JudgeStub(String userId, String passwd) throws CourtCaseMgmtSystemException {
        authorizeUser(userId, passwd);
    }

    public void authorizeUser(String userId, String passwd) throws CourtCaseMgmtSystemException {
        ccmsDatabaseStub = new CCMSDatabaseStub(userId, passwd);
        boolean userAuthorized = ccmsDatabaseStub.isUserAuthorized(userId, passwd);
        if (!userAuthorized) {
            throw new CourtCaseMgmtSystemException("User is not authorized to access the database.");
        }
    }

    public boolean searchSpecificCase() {
        ccmsDatabaseStub.searchDatabase(caseNumber, partyName, date);
        return true;
    }

    public void viewCaseDetails() {
        String displayCaseDetails = ccmsDatabaseStub.displayCaseDetails();
        System.out.println(displayCaseDetails);
    }
}
