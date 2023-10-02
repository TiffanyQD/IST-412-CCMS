package Controller.DatabaseCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import java.time.ZonedDateTime;

public class CCMSDatabaseStub extends CCMSDatabase {

    public CCMSDatabaseStub(String userId, String passwd) {
        super(userId, passwd);
    }

    @Override
    public boolean connectToCCMSDatabase() {
        return true; // Always succeed for the stub.
    }

    @Override
    public boolean isUserAuthorized(String userId, String passwd) {
        // For the stub, let's always authorize for simplicity.
        return true;
    }

    @Override
    public boolean databaseManagementSchedule() {
        return true;
    }

    @Override
    public boolean manuallyTriggerByTheCourtAdministrator() {
        return true;
    }

    @Override
    public boolean restoreDatabase() {
        return true;
    }

    @Override
    public boolean backupDatabase() {
        return true;
    }

    @Override
    public boolean optimizeDatabase() {
        return true;
    }

    @Override
    public boolean updateDatabase() {
        return true;
    }

    @Override
    public boolean searchDatabase(String caseNumber, String partyName, ZonedDateTime zonedDateTime) {
        return true;
    }

    @Override
    public String displayMatchingCases() {
        return "Stub Matching Cases";
    }

    @Override
    public String displayCaseDetails() {
        return "Stub Case Details";
    }
}
