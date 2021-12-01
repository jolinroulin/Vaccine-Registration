
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class User {
    private String userId;
    private String password;
    private String name;
    private String gender;
    private String email;
    private String dateOfBirth;
    private String contactNo;
    private String state;

    public User(String userId, String password,String name, String gender, String email,  String dateOfBirth, String contactNo,String state) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.contactNo = contactNo;
        this.state = state;
    }

        public boolean verifypersonnel(String id, String password){
        try{
            FileReader fr = new FileReader("Personnel.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && password.equals(split[1])) {
                    userId = split[0];
//                    password = split[1];
                    name = split[2];
                    return true;
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }
    
        public boolean verifycitizen(String id, String password){
        try{
            FileReader fr = new FileReader("Citizen.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && password.equals(split[1])) {
                    userId = split[0];
                    name = split[2];
                    return true;
                }
            }           
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }
    
    public boolean verifynoncitizen(String id, String password){
        try{
            FileReader fr = new FileReader("NonCitizen.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && password.equals(split[1])) {
                    userId = split[0];
                    name = split[2];
                    return true;
                }
            }         
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }
   
    public User(){
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    

   
}

