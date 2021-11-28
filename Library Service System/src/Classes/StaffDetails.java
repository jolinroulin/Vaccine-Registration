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
public class StaffDetails {
    File FILEPATHMember =new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\StaffData.txt");
    
    public boolean addMemberToTextFile(Staff member){
        
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
            
            String MemberData = id2 + " : " + member.getMemberName() + " : " + member.getMemberGender() + " : " + member.getMemberUsername() + " : " + member.getMemberPassword() + " : " + member.getMemberDOB() + " : " + member.getMemberEmail() + " : " + member.getMemberMobileNumber() + " : " + member.getMemberSchoolOf() ;
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHMember,true)));
            out.println(MemberData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your staff id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(StaffDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
        public Staff findMemberFromTextFile(String memberId) throws IOException{
            Staff member= null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHMember);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailMember = readLine.split(" : ");
                if(memberId.equals(detailMember[0])){
                    member = new Staff();
                    member.setMemberId(detailMember[0]);
                    member.setMemberName(detailMember[1]);
                    member.setMemberGender(detailMember[2]);
                    member.setMemberUsername(detailMember[3]);
                    member.setMemberPassword(detailMember[4]);
                    member.setMemberDOB(detailMember[5]);
                    member.setMemberEmail(detailMember[6]);
                    member.setMemberMobileNumber(detailMember[7]);
                    member.setMemberSchoolOf(detailMember[8]);
                    JOptionPane.showMessageDialog(null, "Record is found");
                }
            }
            
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Record is not found");     
            }
        return member;
    }

        public boolean verifyUser(String memberUsername, String memberPassword) throws IOException{
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHMember);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailMember = readLine.split(" : ");
                if(memberUsername.equals(detailMember[3]) && memberPassword.equals(detailMember[4])){
                    return true;
                }
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StaffDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }
}
