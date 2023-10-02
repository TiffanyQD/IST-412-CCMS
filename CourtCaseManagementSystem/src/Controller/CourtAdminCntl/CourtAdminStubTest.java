package Controller.CourtAdminCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourtAdminStubTest {

    private CourtAdminStub courtAdminStub;

    @BeforeEach
    public void setUp() {
        courtAdminStub = new CourtAdminStub();
    }

    @Test
    public void testConnectToCCMSDatabase() {
        assertTrue(courtAdminStub.connectToCCMSDatabase(), "Connection should always succeed in stub.");
    }

    @Test
    public void testIsUserAuthorized() throws CourtCaseMgmtSystemException {
        assertTrue(courtAdminStub.isUserAuthorized("authorizedUser", "authorizedPassword"), "Should be authorized for these credentials in stub.");
    }

    @Test
    public void testIsUserNotAuthorized() {
        assertThrows(CourtCaseMgmtSystemException.class, () -> courtAdminStub.isUserAuthorized("unauthorizedUser", "wrongPassword"), "Should throw exception for unauthorized credentials.");
    }
}
