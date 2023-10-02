package Controller.Exception;

public class CourtCaseMgmtSystemException extends Exception{
    public CourtCaseMgmtSystemException() {
    }

    public CourtCaseMgmtSystemException(String message) {
        super(message);
    }

    public CourtCaseMgmtSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public CourtCaseMgmtSystemException(Throwable cause) {
        super(cause);
    }

    public CourtCaseMgmtSystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
