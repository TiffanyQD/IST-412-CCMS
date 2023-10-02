package Controller.LawyerCntl;

import Controller.Exception.CourtCaseMgmtSystemException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LawyerStubTest {

    private LawyerStub lawyerStub;

    @BeforeEach
    public void setUp() {
        lawyerStub = new LawyerStub("testUserId", "testPassword");
    }

    @Test
    public void testAuthorizeUser() {
        assertDoesNotThrow(() -> lawyerStub.authorizeUser("testUserId", "testPassword"));
        assertThrows(CourtCaseMgmtSystemException.class, () -> lawyerStub.authorizeUser("wrongUserId", "testPassword"));
    }

    @Test
    public void testSearchSpecificCase() {
        assertTrue(lawyerStub.searchSpecificCase());
    }

    @Test
    public void testViewCaseDetails() {
        // Since the method just prints a message, there's not much to test.
        // Just calling it to ensure no exceptions are thrown.
        lawyerStub.viewCaseDetails();
    }

    @Test
    public void testUploadDocuments() {
        // Similarly, this method just prints a message, so we're just ensuring it doesn't throw exceptions.
        lawyerStub.uploadDocuments();
    }

    @Test
    public void testConfirmUploadedDocuments() {
        // Just a print statement in the method, so just calling it for completeness.
        lawyerStub.confirmUploadedDocuments();
    }

    @Test
    public void testUpdateCaseDocumentList() {
        // Again, just calling the method to ensure no exceptions are thrown.
        lawyerStub.updateCaseDocumentList();
    }
}
