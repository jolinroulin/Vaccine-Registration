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
public class LibrarianDetails {
    
    File FILEPATHLibrarian =new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\LibrarianData.txt");    
    
    public boolean addLibrarianToTextFile(Librarian librarian){
        
        try {
            
            PrintWriter out = null;
            
        BufferedReader br = new BufferedReader(new FileReader(FILEPATHLibrarian));
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
            
            String LibrarianData = id2 + " : " + librarian.getLibrarianName() + " : " + librarian.getLibrarianGender() + " : " + librarian.getLibrarianUsername() + " : " + librarian.getLibrarianPassword() + " : " + librarian.getLibrarianDOB() + " : " + librarian.getLibrarianEmail() + " : " + librarian.getLibrarianMobileNo();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHLibrarian,true)));
            out.println(LibrarianData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your librarian id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(LibrarianDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public Librarian findLibrarianFromTextFile(String librarianId) throws IOException{
            Librarian librarian= null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHLibrarian);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailLibrarian = readLine.split(" : ");
                if(librarianId.equals(detailLibrarian[0])){
                    librarian = new Librarian();
                    librarian.setLibrarianId(detailLibrarian[0]);
                    librarian.setLibrarianName(detailLibrarian[1]);
                    librarian.setLibrarianGender(detailLibrarian[2]);
                    librarian.setLibrarianUsername(detailLibrarian[3]);
                    librarian.setLibrarianPassword(detailLibrarian[4]);
                    librarian.setLibrarianDOB(detailLibrarian[5]);
                    librarian.setLibrarianEmail(detailLibrarian[6]);
                    librarian.setLibrarianMobileNo(detailLibrarian[7]);
                    JOptionPane.showMessageDialog(null, "Record exists");   
                }
            }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LibrarianDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return librarian;
    }
    

        public boolean verifyUser(String librarianUsername, String librarianPassword) throws IOException{
        try {
            
            String FILEPATH = "C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\LibrarianData.txt";
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailLibrarian = readLine.split(" : ");
                if(librarianUsername.equals(detailLibrarian[3]) && librarianPassword.equals(detailLibrarian[4])){
                    return true;
                }
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LibrarianDetails.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(LibrarianDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
    }


}
