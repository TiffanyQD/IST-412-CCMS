package Controller.CourtAdminCntl;

import Controller.DatabaseCntl.CCMSDatabase;
import Controller.Exception.CourtCaseMgmtSystemException;

/**
 * Tiffany Dove
 * IST-412
 * 09/17/2023
 *
 * <p>This class contains information related to Clerks.</p>
 *
 * <p>
 * <b>Description</b><br>
 * Ensure the Court Case Management System's database is running smoothly, updated, backed up,
 * and optimized for performance.
 * </p>
 *
 * <p>
 * <b>Pre Conditions</b><br>
 * System Administrator/Clerk has logged into the Court Case Management System with the appropriate credentials.
 * </p>
 *
 * <p>
 * <b>Triggers</b><br>
 * Database maintenance schedule, database update, or a manual trigger by System Administrator.
 * </p>
 *
 * <p>
 * <b>Normal Flow</b><br>
 * System Administrator/Clerk selects the Database Management function.<br>
 * The system displays database health statistics.<br>
 * System Administrator/Clerk performs the required action: Update, Backup, Restore, or Optimized.<br>
 * The system confirms the action taken.
 * </p>
 *
 * <p>
 * <b>Post Conditions</b><br>
 * Database is an updated, backed-up, optimized state.
 * </p>
 *
 * <p>
 * <b>Exceptions</b><br>
 * Database fails to respond - Message displayed.<br>
 * Unauthorized access attempt - Security alert triggered.
 * </p>
 *
 */
public class CourtAdmin {
    private String userId;
    private String passwd;

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
