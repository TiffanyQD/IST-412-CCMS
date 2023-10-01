package Controller.CaseCntl;

import Controller.Statuses.Status;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CasesTest {

    List<Cases> casesList = new ArrayList<>();
    @BeforeEach
    void setUp() {
        ZoneId zoneId = ZoneId.of("UTC");
        Cases cases1 = new Cases("CaseNumber1", "PartyName 1",
                ZonedDateTime.of(2023, 10, 1, 13, 35, 57, 0, zoneId),
                Status.Case_Status.Evaluation);
        Cases cases2 = new Cases("CaseNumber2", "PartyName 1",
                ZonedDateTime.of(2023, 9, 30, 12, 12, 34, 0, zoneId),
                Status.Case_Status.Cancelled);
        Cases cases3 = new Cases("CaseNumber3", "PartyName 1",
                ZonedDateTime.of(2023, 7, 26, 23, 34, 35, 0, zoneId),
                Status.Case_Status.Intake);
        Cases cases4 = new Cases("CaseNumber4", "PartyName 1",
                ZonedDateTime.of(2023, 11, 22, 4, 56, 57, 0, zoneId),
                Status.Case_Status.Resolved);
        Cases cases5 = new Cases("CaseNumber5", "PartyName 1",
                ZonedDateTime.of(2023, 4, 9, 4, 9, 57, 0, zoneId),
                Status.Case_Status.Monitoring);
        casesList.addAll(Arrays.asList(cases1, cases2, cases3, cases4, cases5));
    }

    @Test
    public void testCase(){
        Assertions.assertEquals("CaseNumber1", casesList.get(0).getCaseNumber());
        Assertions.assertEquals("PartyName 1", casesList.get(0).getPartyName());
        Assertions.assertEquals("2023-10-01T13:35:57Z[UTC]", casesList.get(0).getDateFiled().toString());
        Assertions.assertEquals("Evaluation", casesList.get(0).getStatus().toString());
    }
}