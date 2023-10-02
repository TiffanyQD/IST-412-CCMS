package Controller.ClerkCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClerkStubTest {

    private ClerkStub clerkStub;

    @BeforeEach
    void setUp() {
        clerkStub = new ClerkStub("authorizedUser", "authorizedPassword");
    }

    @Test
    void testAuthorizeUser_validCredentials() {
        assertDoesNotThrow(() -> clerkStub.authorizeUser("authorizedUser", "authorizedPassword"));
    }

    @Test
    void testAuthorizeUser_invalidCredentials() {
        assertThrows(CourtCaseMgmtSystemException.class, () -> clerkStub.authorizeUser("invalidUser", "invalidPassword"));
    }

    @Test
    void testSearchSpecificCase() {
        assertTrue(clerkStub.searchSpecificCase());
    }

    @Test
    void testViewCaseDetails() {
        assertDoesNotThrow(() -> clerkStub.viewCaseDetails());
    }

    @Test
    void testUploadDocuments() {
        assertDoesNotThrow(() -> clerkStub.uploadDocuments());
    }

    @Test
    void testConfirmUploadedDocuments() {
        assertDoesNotThrow(() -> clerkStub.confirmUploadedDocuments());
    }

    @Test
    void testUpdateCaseDocumentList() {
        assertDoesNotThrow(() -> clerkStub.updateCaseDocumentList());
    }
}
