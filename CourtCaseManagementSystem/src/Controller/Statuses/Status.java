package Controller.Statuses;

public class Status {

    public enum Calendar_Status {
        SUCCESS,
        FAILURE,
        UNKNOWN
    }

    public enum Case_Status {
        Active,
        Resolved,
        Cancelled,
        Intake,
        Needs_Assessment,
        Planning,
        Monitoring,
        Evaluation
    }
}
