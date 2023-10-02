package testharness;

import Controller.Exception.CourtCaseMgmtSystemException;

public class TestHarnessApp {

    public static void main(String[] args) throws CourtCaseMgmtSystemException {
        // Start the tests
        runTests();
    }

    public static void runTests() throws CourtCaseMgmtSystemException {
        testCivilianController();
        testClerkStub();
        testCourtAdminStub();
        testJudgeStub();
        testLawyerStub();
    }

    private static void testCivilianController() throws CourtCaseMgmtSystemException {
        Controller.CivilianCntl.CivilianStub civilianController = new Controller.CivilianCntl.CivilianStub("testUser", "testPass");

        // Call methods and potentially check their results
        civilianController.authorizeUser("testUser", "testPass");
        civilianController.searchSpecificCase();
        civilianController.viewCaseDetails();

        System.out.println("Test for Civilian Controller: PASSED");
    }

    private static void testClerkStub() throws CourtCaseMgmtSystemException {
        Controller.ClerkCntl.ClerkStub clerkStub = new Controller.ClerkCntl.ClerkStub("testUser", "testPass");

        // Test methods from ClerkStub
        clerkStub.authorizeUser("testUser", "testPass");
        clerkStub.searchSpecificCase();
        clerkStub.viewCaseDetails();
        clerkStub.uploadDocuments();
        clerkStub.confirmUploadedDocuments();
        clerkStub.updateCaseDocumentList();

        System.out.println("Test for ClerkStub: PASSED");
    }

    private static void testCourtAdminStub() throws CourtCaseMgmtSystemException {
        Controller.CourtAdminCntl.CourtAdminStub courtAdminStub = new Controller.CourtAdminCntl.CourtAdminStub();

        // Test methods from CourtAdminStub
        courtAdminStub.connectToCCMSDatabase();
        courtAdminStub.isUserAuthorized("testUser", "testPass");

        System.out.println("Test for CourtAdminStub: PASSED");
    }

    private static void testJudgeStub() throws CourtCaseMgmtSystemException {
        Controller.JudgeCntl.JudgeStub judgeStub = new Controller.JudgeCntl.JudgeStub("testUser", "testPass");

        // Test methods from JudgeStub
        judgeStub.authorizeUser("testUser", "testPass");
        judgeStub.searchSpecificCase();
        judgeStub.viewCaseDetails();

        System.out.println("Test for JudgeStub: PASSED");
    }

    private static void testLawyerStub() {
        try {
            Controller.LawyerCntl.LawyerStub lawyerStub = new Controller.LawyerCntl.LawyerStub("testUser", "testPass");

            // Test methods from LawyerStub
            lawyerStub.authorizeUser("testUser", "testPass");
            lawyerStub.searchSpecificCase();
            lawyerStub.viewCaseDetails();
            lawyerStub.uploadDocuments();
            lawyerStub.confirmUploadedDocuments();
            lawyerStub.updateCaseDocumentList();

            System.out.println("Test for LawyerStub: PASSED");
        } catch (CourtCaseMgmtSystemException e) {
            System.out.println("Test for LawyerStub: FAILED - " + e.getMessage());
        }
    }
}
