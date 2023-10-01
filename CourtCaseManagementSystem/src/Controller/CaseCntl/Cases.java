package Controller.CaseCntl;

import Controller.Statuses.Status;
import java.time.ZonedDateTime;

public class Cases {

    private String caseNumber;
    private String partyName;
    private ZonedDateTime dateFiled;
    private Status.Case_Status status;

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public ZonedDateTime getDateFiled() {
        return dateFiled;
    }

    public Status.Case_Status getStatus() {
        return status;
    }

    public void setDateFiled(ZonedDateTime dateFiled) {
        this.dateFiled = dateFiled;
    }

    public void setStatus(Status.Case_Status status) {
        this.status = status;
    }

    public Cases(String caseNumber, String partyName, ZonedDateTime dateFiled, Status.Case_Status status) {
        this.caseNumber = caseNumber;
        this.partyName = partyName;
        this.dateFiled = dateFiled;
        this.status = status;
    }

}
