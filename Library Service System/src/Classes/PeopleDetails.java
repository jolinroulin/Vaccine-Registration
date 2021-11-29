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
            
            String StudentData = id2 + " : " + citizen.getPassword() + " : " + citizen.getName() + " : " + citizen.getGender() + " : " + citizen.getEmail() + " : " + citizen.getDateOfBirth() + " : " + citizen.getContactNo() + " : " + citizen.getIC();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHCitizen,true)));
            out.println(StudentData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your student member id is " + id2 + ".");
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
            
            String StudentData = id2 + " : " + nonCitizen.getPassword() + " : " + nonCitizen.getName() + " : " + nonCitizen.getGender() + " : " + nonCitizen.getEmail() + " : " + nonCitizen.getDateOfBirth() + " : " + nonCitizen.getContactNo() + " : " + nonCitizen.getPassport();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHNonCitizen,true)));
            out.println(StudentData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your student member id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
        public Student findCitizenFromTextFile(String studentId) throws IOException{
            Student student= null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHCitizen);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailStudent = readLine.split(" : ");
                if(studentId.equals(detailStudent[0])){
                    student = new Student();
                    student.setStudentId(detailStudent[0]);
                    student.setStudentName(detailStudent[1]);
                    student.setStudentGender(detailStudent[2]);
                    student.setStudentUsername(detailStudent[3]);
                    student.setStudentPassword(detailStudent[4]);
                    student.setStudentDOB(detailStudent[5]);
                    student.setStudentEmail(detailStudent[6]);
                    student.setStudentMobileNumber(detailStudent[7]);
                    student.setStudentSchoolOf(detailStudent[8]);
                    JOptionPane.showMessageDialog(null, "Record is found");
                }  
            }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return student;
    }
        public Student findNonCitizenFromTextFile(String studentId) throws IOException{
            Student student= null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHNonCitizen);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailStudent = readLine.split(" : ");
                if(studentId.equals(detailStudent[0])){
                    student = new Student();
                    student.setStudentId(detailStudent[0]);
                    student.setStudentName(detailStudent[1]);
                    student.setStudentGender(detailStudent[2]);
                    student.setStudentUsername(detailStudent[3]);
                    student.setStudentPassword(detailStudent[4]);
                    student.setStudentDOB(detailStudent[5]);
                    student.setStudentEmail(detailStudent[6]);
                    student.setStudentMobileNumber(detailStudent[7]);
                    student.setStudentSchoolOf(detailStudent[8]);
                    JOptionPane.showMessageDialog(null, "Record is found");
                }  
            }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return student;
    }

        public boolean verifyCitizenUser(String studentUsername, String studentPassword) throws IOException{
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHCitizen);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailStudent = readLine.split(" : ");
                if(studentUsername.equals(detailStudent[3]) && studentPassword.equals(detailStudent[4])){
                    return true;
                }
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }   
        public boolean verifyNonCitizenUser(String studentUsername, String studentPassword) throws IOException{
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHNonCitizen);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailStudent = readLine.split(" : ");
                if(studentUsername.equals(detailStudent[3]) && studentPassword.equals(detailStudent[4])){
                    return true;
                }
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }
}
