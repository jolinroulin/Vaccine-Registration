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
public class Student {
    String studentId;
    String studentName;
    String studentGender;
    String studentUsername;
    String studentPassword;
    String studentDOB;
    String studentEmail;
    String studentMobileNumber;
    String studentSchoolOf;

    public Student(String studentId, String studentName, String studentGender, String studentUsername, String studentPassword, String studentDOB, String studentEmail, String studentMobileNumber, String studentSchoolOf) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentUsername = studentUsername;
        this.studentPassword = studentPassword;
        this.studentDOB = studentDOB;
        this.studentEmail = studentEmail;
        this.studentMobileNumber = studentMobileNumber;
        this.studentSchoolOf = studentSchoolOf;
    }
    
    public Student(){
        
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentUsername() {
        return studentUsername;
    }

    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentMobileNumber() {
        return studentMobileNumber;
    }

    public void setStudentMobileNumber(String studentMobileNumber) {
        this.studentMobileNumber = studentMobileNumber;
    }

    public String getStudentSchoolOf() {
        return studentSchoolOf;
    }

    public void setStudentSchoolOf(String studentSchoolOf) {
        this.studentSchoolOf = studentSchoolOf;
    }
    
    
}
