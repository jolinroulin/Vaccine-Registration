/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PeopleDetails {
    File FILEPATHCitizen =new File("Citizen.txt");
    File FILEPATHNonCitizen = new File("NonCitizen.txt");
    
    
    public boolean addCitizenToTextFile(Citizen citizen){
        
        try {
            
            PrintWriter out = null;
            
        BufferedReader br = new BufferedReader(new FileReader(FILEPATHCitizen));
        Object[] Lines = br.lines().toArray();
        int i =0;
        int id =0;
        for(i=0; i<Lines.length;i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split(" : ");
            id = Integer.parseInt(Row[0]) ;
            
        }
        int id2 = id + 1 ;
            
            String StudentData = id2 + " : " + citizen.getPassword() + " : " + citizen.getName() + " : " + citizen.getGender() + " : " 
                    + citizen.getEmail() + " : " + citizen.getDateOfBirth() + " : " + citizen.getContactNo() + " : " + citizen.getIC()+" : " + citizen.getState();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHCitizen,true)));
            out.println(StudentData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your user id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    public boolean addNonCitizenToTextFile(NonCitizen nonCitizen){
        
        try {
            
        PrintWriter out = null;
            
        BufferedReader br = new BufferedReader(new FileReader(FILEPATHNonCitizen));
        Object[] Lines = br.lines().toArray();
        int i =0;
        int id =0;
        for(i=0; i<Lines.length;i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split(" : ");
            id = Integer.parseInt(Row[0]) ;
            
        }
        int id2 = id + 1 ;
            
            String StudentData = id2 + " : " + nonCitizen.getPassword() + " : " + nonCitizen.getName() + " : " + nonCitizen.getGender() 
                    + " : " + nonCitizen.getEmail() + " : " + nonCitizen.getDateOfBirth() + " : " + nonCitizen.getContactNo() + " : " + nonCitizen.getIC()+" : " + nonCitizen.getState();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHNonCitizen,true)));
            out.println(StudentData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your user id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

//
//        public boolean verifyCitizenUser(String studentUsername, String studentPassword) throws IOException{
//        try {
//            
//            FileInputStream fileInputStream = new FileInputStream(FILEPATHCitizen);
//            
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
//            
//            String readLine;
//            
//            while((readLine = bufferedReader.readLine()) != null){
//                String[] detailStudent = readLine.split(" : ");
//                if(studentUsername.equals(detailStudent[4]) && studentPassword.equals(detailStudent[1])){
//                    return true;
//                }
//            }
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        return false;
//    }   
//        
//        public boolean verifyNonCitizenUser(String studentUsername, String studentPassword) throws IOException{
//        try {
//            
//            FileInputStream fileInputStream = new FileInputStream(FILEPATHNonCitizen);
//            
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
//            
//            String readLine;
//            
//            while((readLine = bufferedReader.readLine()) != null){
//                String[] detailStudent = readLine.split(" : ");
//                if(studentUsername.equals(detailStudent[4]) && studentPassword.equals(detailStudent[1])){
//                    return true;
//                }
//            }
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        return false;
//    }
        String[] columnsName = {"User ID","Password","Name","Gender","Email","DOB","Contact Number","IC","State"}; 
        
public void viewPeopleTable(JTable Personnel ){
        DefaultTableModel model = (DefaultTableModel)Personnel.getModel();

           try{
               BufferedReader br = new BufferedReader (new FileReader("Citizen.txt")); 
               model.setColumnIdentifiers(columnsName);
               String view;
               while((view = br.readLine())!= null){
               String[] usr = view.split (" : ");

                 model.addRow(usr);
     
               }
           }
           catch(Exception ex){
               Logger.getLogger(PersonnelDetails.class.getName()).log(Level.SEVERE, null, ex);
           }       
    }        
public void viewNonTable(JTable Personnel ){
        DefaultTableModel model = (DefaultTableModel)Personnel.getModel();

           try{
               BufferedReader br = new BufferedReader (new FileReader("NonCitizen.txt")); 
               model.setColumnIdentifiers(columnsName);
               String view;
               while((view = br.readLine())!= null){
               String[] usr = view.split (" : ");

                 model.addRow(usr);
     
               }
           }
           catch(Exception ex){
               Logger.getLogger(PersonnelDetails.class.getName()).log(Level.SEVERE, null, ex);
           }       
    }   

    public void modifyCitizenDetails(JTextField ID, JTextField Password, JTextField Name, JComboBox Gender, JTextField Email, JTextField DOB, JTextField ContactNo, JTextField IC,  JComboBox state) {
        String theid = ID.getText();
        ArrayList<String> tempArray = new ArrayList<>();

        try {
            try (FileReader fr = new FileReader(FILEPATHCitizen)) {
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;

                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split(" : ");
                    if (lineArr[0].equals(theid)) {
                        tempArray.add(lineArr[0] + " : "+Password.getText()+" : " 
                   +  Name.getText()+" : " 
                   + Gender.getSelectedItem().toString()+" : "+ Email.getText()+" : "+DOB.getText()+" : "+ContactNo.getText()+" : "
                   +IC.getText()+" : "+ state.getSelectedItem().toString());  
                        JOptionPane.showMessageDialog(null, "Citizen Details Updated!");
                    } else {
                        tempArray.add(line);
                    }
                }

                fr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }

        try {
            try (PrintWriter pr = new PrintWriter(FILEPATHCitizen)) {
                for (String str : tempArray) {
                    pr.println(str);
                }
                pr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
    }
    
    public void modifyNonCitizenDetails(JTextField ID, JTextField Password, JTextField Name, JComboBox Gender, JTextField Email, JTextField DOB, JTextField ContactNo, JTextField IC, JComboBox state) {
        String theid = ID.getText();
        ArrayList<String> tempArray = new ArrayList<>();

        try {
            try (FileReader fr = new FileReader(FILEPATHNonCitizen)) {
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;

                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split(" : ");
                    if (lineArr[0].equals(theid)) {
                        tempArray.add(lineArr[0] + " : "+Password.getText()+" : " 
                   +  Name.getText()+" : " 
                   + Gender.getSelectedItem().toString()+" : "+ Email.getText()+" : "+DOB.getText()+" : "+ContactNo.getText()+" : "
                   +IC.getText()+" : "+ state.getSelectedItem().toString());  
                        JOptionPane.showMessageDialog(null, "Non Citizen Details Updated!");
                    } else {
                        tempArray.add(line);
                    }
                }

                fr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }

        try {
            try (PrintWriter pr = new PrintWriter(FILEPATHNonCitizen)) {
                for (String str : tempArray) {
                    pr.println(str);
                }
                pr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
    }


String filePath = "Citizen.txt";
public void deleteCitizen(JTextField UserID){
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
        File newFile = new File(filePath);
        String currentLine;
        String usr[];
        String removeTerm = UserID.getText();

        try{
            FileWriter fw = new FileWriter (filePath,true);
            BufferedWriter bw = new BufferedWriter (fw);
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
            
            JOptionPane.showMessageDialog(null,"Record is deleted");
            UserID.setText(null);
        }
        catch(Exception ex) {

        }  
    }  
}

String filePath1 = "NonCitizen.txt";
public void deleteNonCitizen(JTextField UserID){
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
        File newFile = new File(filePath1);
        String currentLine;
        String usr[];
        String removeTerm = UserID.getText();

        try{
            FileWriter fw = new FileWriter (filePath1,true);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter pw = new PrintWriter(bw);
            
            FileReader fr = new FileReader(newFile);
            BufferedReader br = new BufferedReader(fr);
       
            while ((currentLine = br.readLine())!=null ){
                usr = currentLine.split(" : ");
                if(!usr[0].equalsIgnoreCase(removeTerm)){
                    new FileOutputStream(filePath1).close();
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            
            File User = new File(filePath1);
            newFile.renameTo(User);
            
            JOptionPane.showMessageDialog(null,"Record is deleted");
            UserID.setText(null);
        }
        catch(Exception ex) {

        }  
    }  
}
}
