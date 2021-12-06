 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.toedter.calendar.JDateChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Appointment {
    
    public String Status;
    public String IC;
    public String Gender;
    public String ContactNo;
    public String Email;
    public String Dob;
    public String State;
    public String Centre;
    public String Date;
    public String Time;
    public String Slot;
    public String Name;
    public String PeopleType;
    public String Vaccine;
    
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
    
    public boolean verifyAddedAppointment(String id, String name){
        try{
            FileReader fr = new FileReader("Appointment/vaccineappadded.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && name.equals(split[1])) {
                    Centre = split[6];
                    Slot = split[7] + " : " + split[8];
                    return true;
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }
    
    public boolean verifyCompletedAppointment(String id, String name){
        try{
            FileReader fr = new FileReader("Appointment/vaccineappcompleted.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[0]) && name.equals(split[1])) {
                    Centre = split[6];
                    Slot = split[7] + " : " + split[8];
                    Vaccine = split[9];
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
                    Name= split[2];
                    Gender = split[3];
                    ContactNo= split[6];
                    Email = split[4];
                    Dob = split[5];
                    State = split[8];
                    PeopleType = "Citizen";
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
                    Name= split[2];
                    Gender = split[3];
                    ContactNo= split[6];
                    Email = split[4];
                    Dob = split[5];
                    State = split[8];
                    PeopleType = "Non Citizen";
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }

    String[] columnsName = {"IC/Passport No.","Name","Contact No","Email","State","People Type"};   
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
    
    
    String[] columnsNameAdd = {"IC/Passport No.","Name","Contact No","Email","State","People Type","Centre","Date","Time"};   
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

    public String getVaccine() {
        return Vaccine;
    }

    public void setVaccine(String Vaccine) {
        this.Vaccine = Vaccine;
    }
    

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCentre() {
        return Centre;
    }

    public void setCentre(String Centre) {
        this.Centre = Centre;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getSlot() {
        return Slot;
    }

    public void setSlot(String Slot) {
        this.Slot = Slot;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPeopleType() {
        return PeopleType;
    }

    public void setPeopleType(String PeopleType) {
        this.PeopleType = PeopleType;
    }
   
    public String[] getColumnsName() {
        return columnsNameAdd;
    }

    public void setColumnsName(String[] columnsName) {
        this.columnsNameAdd = columnsName;
    }

     String[] columnsName1 = {"IC/Passport No.","Name","Phone No.", "Email", "State", "People Type"};
    public void viewSlotTable(JTable t) throws FileNotFoundException, IOException{DefaultTableModel model = (DefaultTableModel)t.getModel();

        try{
            String filename = "Appointment/vaccineregistered.txt";
            File FILEPATH = new File(filename);

            BufferedReader br = new BufferedReader (new FileReader(FILEPATH)); 
            model.setColumnIdentifiers(columnsName1);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(" : ");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error.");
        }

    }
    
    String[] columnsName2 = {"IC/Passport No.","Name","Phone No.", "Email", "State", "People Type", "Venue", "Date", "Time"};
    public void viewAddedAppTable(JTable t) throws FileNotFoundException, IOException{
        DefaultTableModel model = (DefaultTableModel)t.getModel();

        try{
            String filename = "Appointment/vaccineappadded.txt";
            File FILEPATH = new File(filename);

            BufferedReader br = new BufferedReader (new FileReader(FILEPATH)); 
            model.setColumnIdentifiers(columnsName2);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(" : ");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error.");
        }

    }
    
    String[] columnsName3 = {"IC/Passport No.","Name","Phone No.", "Email", "State", "People Type", "Venue", "Date", "Slot", "Vaccine", "Vaccine Code", "Expiry Date"};
    public void viewCompletedAppTable(JTable t) throws FileNotFoundException, IOException{DefaultTableModel model = (DefaultTableModel)t.getModel();

        try{
            String filename = "Appointment/vaccineappcompleted.txt";
            File FILEPATH = new File(filename);

            BufferedReader br = new BufferedReader (new FileReader(FILEPATH)); 
            model.setColumnIdentifiers(columnsName3);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(" : ");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error.");
        }

    }
   
    
    public void modifyFile(JLabel id, JComboBox centre, JComboBox slot){
        String theid = id.getText();
        String thecentre = centre.getSelectedItem().toString();
        String theslot = slot.getSelectedItem().toString();
        
        ArrayList<String> tempArray = new ArrayList<>();
        
        try{
            try (FileReader fr = new FileReader("Appointment/vaccineappadded.txt")){
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;
                
                while((line=reader.nextLine())!=null){
                    lineArr = line.split(" : ");
                    if(lineArr[0].equals(theid)){
                        tempArray.add(lineArr[0] + " : " + lineArr[1] + " : " + lineArr[2] + " : " + lineArr[3] + " : " 
                                + lineArr[4] + " : " + lineArr[5] + " : " + thecentre + " : " + theslot);
                        JOptionPane.showMessageDialog(null, "Appointment Updated!");
                    }else{
                        tempArray.add(line);
                    }
                }
                
                fr.close();
            }catch(Exception e){
                
            }
        }catch(Exception e){
            
        }
        
        try{
            try(PrintWriter pr = new PrintWriter("Appointment/vaccineappadded.txt")){
                for(String str : tempArray){
                    pr.println(str);
                }
                pr.close();
            }catch(Exception e){
                
            }
        }catch(Exception e){
            
        }
    }
    
    public void removeFromAdded(JLabel UserID){
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
    public void modify(){
        
    }
    public void search(){
        
    }
    public void cancel(){
        
    }
}
