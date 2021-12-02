/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JLabel;
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
    
  String filePath = "Appointment/vaccineregistered.txt";
    public void removefromRegistered(JLabel UserID){
        File newFile = new File(filePath);
        String currentLine;
        String usr[];
        String removeTerm = UserID.getText();

        try{
            FileWriter fw = new FileWriter (filePath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(newFile);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine())!=null ){
                usr = currentLine.split(" : ");
                if(!usr[0].equalsIgnoreCase(removeTerm)){
                    new FileOutputStream(filePath).close();
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();

            File User = new File(filePath);
            newFile.renameTo(User);

            UserID.setText(null);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }

    }
    
    
    String[] columnsNameAdd = {"IC","Name","Contact No","Email","State","People Type","Centre","Date","Time"};   
    public void viewAddedPeopleTable(JTable t) throws FileNotFoundException, IOException{
        DefaultTableModel model = (DefaultTableModel)t.getModel();

        try{
        String filename = "Appointment/vaccineappadded.txt";
        File FILEPATH =new File(filename);
 
            BufferedReader br = new BufferedReader (new FileReader(FILEPATH)); 
            model.setColumnIdentifiers(columnsNameAdd);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(" : ");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No Record in this Centre!");
        }            
    }
    
    
    String filePath2 = "Appointment/vaccineappadded.txt";
    public void removefromAddedApp(JLabel UserID){
        File newFile = new File(filePath2);
        String currentLine;
        String usr[];
        String removeTerm = UserID.getText();

        try{
            FileWriter fw = new FileWriter (filePath2,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(newFile);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine())!=null ){
                usr = currentLine.split(" : ");
                if(!usr[0].equalsIgnoreCase(removeTerm)){
                    new FileOutputStream(filePath2).close();
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();

            File User = new File(filePath2);
            newFile.renameTo(User);

            UserID.setText(null);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error");
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
        return columnsNameAdd;
    }

    public void setColumnsName(String[] columnsName) {
        this.columnsNameAdd = columnsName;
    }

    
    public void modify(){
        
    }
    public void search(){
        
    }
    public void cancel(){
        
    }
}
