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
public class Librarian {
    String librarianId;
    String librarianName;
    String librarianGender;
    String librarianUsername;
    String librarianPassword;
    String librarianDOB;
    String librarianEmail;
    String librarianMobileNo;

    public Librarian(String librarianId, String librarianName, String librarianGender, String librarianUsername, String librarianPassword, String librarianDOB, String librarianEmail, String librarianMobileNo) {
        this.librarianId = librarianId;
        this.librarianName = librarianName;
        this.librarianGender = librarianGender;
        this.librarianUsername = librarianUsername;
        this.librarianPassword = librarianPassword;
        this.librarianDOB = librarianDOB;
        this.librarianEmail = librarianEmail;
        this.librarianMobileNo = librarianMobileNo;
    }

    public Librarian(){
        
    }
    
    public String getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getLibrarianGender() {
        return librarianGender;
    }

    public void setLibrarianGender(String librarianGender) {
        this.librarianGender = librarianGender;
    }

    public String getLibrarianUsername() {
        return librarianUsername;
    }

    public void setLibrarianUsername(String librarianUsername) {
        this.librarianUsername = librarianUsername;
    }

    public String getLibrarianPassword() {
        return librarianPassword;
    }

    public void setLibrarianPassword(String librarianPassword) {
        this.librarianPassword = librarianPassword;
    }

    public String getLibrarianDOB() {
        return librarianDOB;
    }

    public void setLibrarianDOB(String librarianDOB) {
        this.librarianDOB = librarianDOB;
    }

    public String getLibrarianEmail() {
        return librarianEmail;
    }

    public void setLibrarianEmail(String librarianEmail) {
        this.librarianEmail = librarianEmail;
    }

    public String getLibrarianMobileNo() {
        return librarianMobileNo;
    }

    public void setLibrarianMobileNo(String librarianMobileNo) {
        this.librarianMobileNo = librarianMobileNo;
    }
    
}
