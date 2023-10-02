package Controller.JudgeCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JudgeStubTest {

    private JudgeStub judgeStub;

    @BeforeEach
    public void setup() {
        try {
            judgeStub = new JudgeStub("testUserId", "testPassword");
        } catch (CourtCaseMgmtSystemException e) {
            fail("Initialization of JudgeStub failed.");
        }
    }

    @Test
    public void testAuthorizeUser() {
        // Assuming that the user with userId "testUserId" and password "testPassword" is authorized
        try {
            judgeStub.authorizeUser("testUserId", "testPassword");
        } catch (CourtCaseMgmtSystemException e) {
            fail("Authorization failed.");
        }
    }

    @Test
    public void testSearchSpecificCase() {
        assertTrue(judgeStub.searchSpecificCase(), "Search for specific case failed.");
    }

    @Test
    public void testViewCaseDetails() {
        // As this method doesn't return anything and just prints, it's a bit tricky to assert anything.
        // However, you can run it to see the print statement, ensuring that it runs without exception.
        judgeStub.viewCaseDetails();
    }
}

