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
    File FILEPATHCitizen =new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\StudentData.txt");
    File FILEPATHNonCitizen = null;
    
    public boolean addStudentToTextFile(Student student){
        
        try {
            
            PrintWriter out = null;
            
        BufferedReader br = new BufferedReader(new FileReader(FILEPATHStudent));
        Object[] Lines = br.lines().toArray();
        int i =0;
        int id =0;
        for(i=0; i<Lines.length;i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split(" : ");
            id = Integer.parseInt(Row[0]) ;
            
        }
        int id2 = id + 1 ;
            
            String StudentData = id2 + " : " + student.getStudentName() + " : " + student.getStudentGender() + " : " + student.getStudentUsername() + " : " + student.getStudentPassword() + " : " + student.getStudentDOB() + " : " + student.getStudentEmail() + " : " + student.getStudentMobileNumber() + " : " + student.getStudentSchoolOf();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHStudent,true)));
            out.println(StudentData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your student member id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
        public Student findStudentFromTextFile(String studentId) throws IOException{
            Student student= null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHStudent);
            
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
