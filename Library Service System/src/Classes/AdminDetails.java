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
public class AdminDetails {
    
    File FILEPATHAdmin =new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\LibrarianData.txt");    
    
    public boolean addAdminToTextFile(Admin admin){
        
        try {
            
            PrintWriter out = null;
            
        BufferedReader br = new BufferedReader(new FileReader(FILEPATHAdmin));
        Object[] Lines = br.lines().toArray();
        int i =0;
        int id =0;
        String LibrarianId = null;
        for(i=0; i<Lines.length;i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split(" : ");
            id = Integer.parseInt(Row[0]) ;
            
        }
        int id2 = id + 1 ;
            
            String LibrarianData = id2 + " : " + admin.getName() + " : " + admin.getGender() + " : " + admin.getEmail() + " : " + admin.getPassword() + " : " + admin.getDateOfBirth() + " : " + admin.getContactNo() + " : " + admin.getIC();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHAdmin,true)));
            out.println(LibrarianData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your librarian id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public Admin findLibrarianFromTextFile(Admin adminId) throws IOException{
            Admin admin= null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHAdmin);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailAdmin = readLine.split(" : ");
                if(adminId.equals(detailAdmin[0])){
                    //admin = new Admin();
                    admin.setUserId(detailAdmin[0]);
                    admin.setName(detailAdmin[1]);
                    admin.setGender(detailAdmin[2]);
                    admin.setEmail(detailAdmin[3]);
                    admin.setPassword(detailAdmin[4]);
                    admin.setDateOfBirth(detailAdmin[5]);
                    admin.setContactNo(detailAdmin[6]);
                    admin.setIC(detailAdmin[7]);
                    JOptionPane.showMessageDialog(null, "Record exists");   
                }
            }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return admin;
    }
    

        public boolean verifyUser(String adminUserId, String adminPassword) throws IOException{
        try {
            
            String FILEPATH = "C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\LibrarianData.txt";
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] adminInfo = readLine.split(" : ");
                if(adminUserId.equals(adminInfo[3]) && adminPassword.equals(adminInfo[4])){
                    return true;
                }
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }
    public void UpdateLibrarianDetails(Librarian librarian) throws IOException{
        String FILEPATHLibrarian = "C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\LibrarianData.txt";
        String librarianId = null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHLibrarian);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            PrintWriter out = null;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailLibrarian = readLine.split(" : ");
                if(librarianId.equals(detailLibrarian[0])){
                    String LibrarianData = librarian.getLibrarianId() + " : " + librarian.getLibrarianName() + " : " + librarian.getLibrarianGender() + " : " + librarian.getLibrarianUsername() + " : " + librarian.getLibrarianPassword() + " : " + librarian.getLibrarianDOB() + " : " + librarian.getLibrarianEmail() + " : " + librarian.getLibrarianMobileNo();
                    out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHLibrarian,true)));
                    out.println(LibrarianData);
                }
                
            }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
    }


}
