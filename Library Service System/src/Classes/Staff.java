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
public class Staff {
    String memberId;
    String memberName;
    String memberGender;
    String memberUsername;
    String memberPassword;
    String memberDOB;
    String memberEmail;
    String memberMobileNumber;
    String memberSchoolOf;

    public Staff(String memberId, String memberName, String memberGender, String memberUsername, String memberPassword, String memberDOB, String memberEmail, String memberMobileNumber, String memberSchoolOf, String memberRole) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberGender = memberGender;
        this.memberUsername = memberUsername;
        this.memberPassword = memberPassword;
        this.memberDOB = memberDOB;
        this.memberEmail = memberEmail;
        this.memberMobileNumber = memberMobileNumber;
        this.memberSchoolOf = memberSchoolOf;
    }

    public Staff(){
        
    }
        
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberDOB() {
        return memberDOB;
    }

    public void setMemberDOB(String memberDOB) {
        this.memberDOB = memberDOB;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberMobileNumber() {
        return memberMobileNumber;
    }

    public void setMemberMobileNumber(String memberMobileNumber) {
        this.memberMobileNumber = memberMobileNumber;
    }

    public String getMemberSchoolOf() {
        return memberSchoolOf;
    }

    public void setMemberSchoolOf(String memberSchoolOf) {
        this.memberSchoolOf = memberSchoolOf;
    }
    
}


