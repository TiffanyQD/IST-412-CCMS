package Controller.CivilianCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import java.time.ZonedDateTime;

public class CivilianStub {
    String userId = null;
    String passwd;
    String caseNumber;
    String partyName;
    ZonedDateTime date;

    public CivilianStub(String userId, String passwd) {
        // stubbed method
    }

    public void authorizeUser(String userId, String passwd) {
        // stubbed method
    }

    public boolean searchSpecificCase() {
        return true; // stubbed return value
    }

    public void viewCaseDetails() {
        // stubbed method
    }

    public void selectCalendarManagementFunction() {
        // stubbed method
    }

    public void addNewEvent() {
        // stubbed method
    }

    public void viewExistingEvents() {
        // stubbed method
    }

    public void inputEventDetails() {
        // stubbed method
    }

    public void selectADateToView() {
        // stubbed method
    }

    public void confirmAdditionToSchedule() {
        // stubbed method
    }

    public void displaySchedule() {
        // stubbed method
    }
}
