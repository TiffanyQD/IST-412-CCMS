package Controller.CourtAdminCntl;


import Controller.Exception.CourtCaseMgmtSystemException;

public class CourtAdminStub {

    private String userId = "authorizedUser";
    private String passwd = "authorizedPassword";

    public CourtAdminStub() {
    }

    /**
     * Simulates connecting to the CCMS database.
     *
     * @return Always true for stub purposes.
     */
    public boolean connectToCCMSDatabase() {
        return true; // Always succeed in stub
    }

    /**
     * Simulates checking if a user is authorized.
     *
     * @param userId   The userId to check.
     * @param passwd   The password to check.
     * @return Always true for stub purposes.
     * @throws CourtCaseMgmtSystemException if the user is not authorized.
     */
    public boolean isUserAuthorized(String userId, String passwd) throws CourtCaseMgmtSystemException {
        if (!"testUser".equals(userId) || !"testPass".equals(passwd)) {
            throw new CourtCaseMgmtSystemException("Unauthorized access");
        }
        return true; // assuming this method returns a boolean
    }

}


