package Controller.CourtAdminCntl;

import Controller.DatabaseCntl.CCMSDatabase;
import Controller.Exception.CourtCaseMgmtSystemException;

/**
 * Description: Ensure the Court Case Management System's database is running smoothly, updated,
 * backed up, and optimized for performance.
 */
public class CourtAdmin {
    String userId;
    String passwd;

    /**
     * 1. This constructor calls the CCMS databases
     * 2. Checks to make sure you are connected to the database.
     * 3. Makes sure that the user is authorized.
     */
    public CourtAdmin() throws CourtCaseMgmtSystemException {
        CCMSDatabase ccmsDatabase = new CCMSDatabase(userId, passwd);
        boolean isConnectedToDatabase = ccmsDatabase.connectToCCMSDatabase();
        boolean isUserAuthorized = ccmsDatabase.isUserAuthorized(userId, passwd);
    }
}
