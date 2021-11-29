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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PersonnelDetails {
    File FILEPATHMember =new File("Personnel.txt");
    
    public boolean addPersonnelToTextFile(Personnel personnel){
        
        try {
            
        PrintWriter out = null;
            
        BufferedReader br = new BufferedReader(new FileReader(FILEPATHMember));
        Object[] Lines = br.lines().toArray();
        int i =0;
        int id =0;
        String MemberId = null;
        for(i=0; i<Lines.length;i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split(" : ");
            id = Integer.parseInt(Row[0]) ;
            
        }
        int id2 = id + 1 ;
            
            String MemberData = id2 + " : " + personnel.getPassword() + " : " + personnel.getName() + " : " + personnel.getGender() + " : " + personnel.getEmail() + " : " + personnel.getDateOfBirth() + " : " + personnel.getContactNo() + " : " + personnel.getIC() + " : " + personnel.getCentre() ;
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHMember,true)));
            out.println(MemberData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your staff id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(PersonnelDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
        public Personnel findPersonnelFromTextFile(String memberId) throws IOException{
            Personnel personnel= null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHMember);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailPersonnel = readLine.split(" : ");
                if(memberId.equals(detailPersonnel[0])){
                    //personnel = new Personnel();
                    personnel.setUserId(detailPersonnel[0]);
                    personnel.setPassword(detailPersonnel[1]);
                    personnel.setName(detailPersonnel[2]);
                    personnel.setGender(detailPersonnel[3]);
                    personnel.setEmail(detailPersonnel[4]);
                    personnel.setDateOfBirth(detailPersonnel[5]);
                    personnel.setContactNo(detailPersonnel[6]);
                    personnel.setIC(detailPersonnel[7]);
                    personnel.setCentre(detailPersonnel[8]);
                    JOptionPane.showMessageDialog(null, "Record is found");
                }
            }
            
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Record is not found");     
            }
        return personnel;
    }

        public boolean findPersonnelFromTextFile(String personnelId, String personnelPassword) throws IOException{
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHMember);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailPersonnel = readLine.split(" : ");
                if(personnelId.equals(detailPersonnel[4]) && personnelPassword.equals(detailPersonnel[1])){
                    return true;
                }
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PersonnelDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }
}
