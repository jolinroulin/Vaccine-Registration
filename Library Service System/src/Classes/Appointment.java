/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Appointment {
    
    public String status;   
    public String IC;
    public String gender;
    public String contactNo;
    public String email;
    public String dob;
    public String state;
    public String username;
    public String peopleType;
    
    public boolean verifyNotRegistered(String id, String name){
        try{
            FileReader fr = new FileReader("Appointment/vaccineregistered.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && name.equals(split[1])) {
                    return true;
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
        return false;
    }
    
    public boolean verifyAddedApp(String id, String name){
        try{
            FileReader fr = new FileReader("Appointment/vaccineappadded.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && name.equals(split[1])) {
                    return true;
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }
    
    public boolean verifyCancelledApp(String id, String name){
        try{
            FileReader fr = new FileReader("Appointment/vaccineappcancelled.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && name.equals(split[1])) {
                    return true;
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }
    
    public boolean verifyCompletedApp(String id, String name){
        try{
            FileReader fr = new FileReader("Appointment/vaccineappcompleted.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && name.equals(split[1])) {
                    return true;
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }
    
    
        public boolean findCitizen(String id, String name) {
        try {
            FileReader fr = new FileReader("Citizen.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[7]) && name.equals(split[2])) {
                    IC = split[7];
                     username= split[2];
                    gender = split[3];
                    contactNo= split[6];
                    email = split[4];
                    dob = split[5];
                    state = split[8];
                    peopleType = "Citizen";
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }
    
    public boolean findNonCitizen(String id, String name) {
        try {
            FileReader fr = new FileReader("NonCitizen.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[7]) && name.equals(split[2])) {
                    IC = split[7];
                     username= split[2];
                    gender = split[3];
                    contactNo= split[6];
                    email = split[4];
                    dob = split[5];
                    state = split[8];
                    peopleType = "Non Citizen";
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }

    String[] columnsName = {"IC","Name","Contact No","Email","State","People Type"};   
    public void viewRegisteredPeopleTable(JTable t) throws FileNotFoundException, IOException{
        DefaultTableModel model = (DefaultTableModel)t.getModel();

        try{
        String filename = "Appointment/vaccineregistered.txt";
        File FILEPATH =new File(filename);
 
            BufferedReader br = new BufferedReader (new FileReader(FILEPATH)); 
            model.setColumnIdentifiers(columnsName);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(" : ");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No Record in this Centre!");
        }            
    }
    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(String peopleType) {
        this.peopleType = peopleType;
    }

    public String[] getColumnsName() {
        return columnsName;
    }

    public void setColumnsName(String[] columnsName) {
        this.columnsName = columnsName;
    }

    
    public void modify(){
        
    }
    public void search(){
        
    }
    public void cancel(){
        
    }
}
