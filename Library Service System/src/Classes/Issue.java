/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author User
 */
public class Issue {
    String issueId;
    String issueUserId;
    String issueUserName;
    String issueBookId;
    String issueBookName;
    String issueBorrowingDate;
    String issueDueDate;
    String issueStatus;
    String issueFine;

    public Issue(String issueId, String issueUserId, String issueUserName, String issueBookId, String issueBookName, String issueBorrowingDate, String issueDueDate, String issueStatus, String issueFine) {
        this.issueId = issueId;
        this.issueUserId = issueUserId;
        this.issueUserName = issueUserName;
        this.issueBookId = issueBookId;
        this.issueBookName = issueBookName;
        this.issueBorrowingDate = issueBorrowingDate;
        this.issueDueDate = issueDueDate;
        this.issueStatus = issueStatus;
        this.issueFine = issueFine;
    }

    public Issue(){
        
    }
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueUserId() {
        return issueUserId;
    }

    public void setIssueUserId(String issueUserId) {
        this.issueUserId = issueUserId;
    }

    public String getIssueUserName() {
        return issueUserName;
    }

    public void setIssueUserName(String issueUserName) {
        this.issueUserName = issueUserName;
    }

    public String getIssueBookId() {
        return issueBookId;
    }

    public void setIssueBookId(String issueBookId) {
        this.issueBookId = issueBookId;
    }

    public String getIssueBookName() {
        return issueBookName;
    }

    public void setIssueBookName(String issueBookName) {
        this.issueBookName = issueBookName;
    }

    public String getIssueBorrowingDate() {
        return issueBorrowingDate;
    }

    public void setIssueBorrowingDate(String issueBorrowingDate) {
        this.issueBorrowingDate = issueBorrowingDate;
    }

    public String getIssueDueDate() {
        return issueDueDate;
    }

    public void setIssueDueDate(String issueDueDate) {
        this.issueDueDate = issueDueDate;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public String getIssueFine() {
        return issueFine;
    }

    public void setIssueFine(String issueFine) {
        this.issueFine = issueFine;
    }

   
}
