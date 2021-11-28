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
public class IssueDetails {
    File FILEPATHIssue =new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\IssueData.txt");    
    
    public boolean addIssueToTextFile(Issue issue){
        
        try {
            
            PrintWriter out = null;
            
        BufferedReader br = new BufferedReader(new FileReader(FILEPATHIssue));
        Object[] Lines = br.lines().toArray();
        int i =0;
        int id =0;
        String IssueId = null;
        for(i=0; i<Lines.length;i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split(" : ");
            id = Integer.parseInt(Row[0]) ;
            
        }
        int id2 = id + 1 ;
            
            String IssueData = id2 + " : " + issue.getIssueUserId() + " : " + issue.getIssueUserName() + " : " + issue.getIssueBookId() + " : " + issue.getIssueBookName() + " : " + issue.getIssueBorrowingDate()+ " : " + issue.getIssueDueDate()+ " : " + issue.getIssueStatus()+ " : " + issue.getIssueFine();
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHIssue,true)));
            out.println(IssueData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added. Your borrow id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(IssueDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public Issue findIssueFromTextFile(String issueId) throws IOException{
            Issue issue= null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHIssue);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailIssue = readLine.split(" : ");
                if(issueId.equals(detailIssue[0])){
                    issue = new Issue();
                    issue.setIssueId(detailIssue[0]);
                    issue.setIssueUserId(detailIssue[1]);
                    issue.setIssueUserName(detailIssue[2]);
                    issue.setIssueBookId(detailIssue[3]);
                    issue.setIssueBookName(detailIssue[4]);
                    issue.setIssueBorrowingDate(detailIssue[5]);
                    issue.setIssueDueDate(detailIssue[6]);
                    issue.setIssueStatus(detailIssue[7]);
                    issue.setIssueFine(detailIssue[8]);
                    JOptionPane.showMessageDialog(null, "Record exists");   
                }
            }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(IssueDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return issue;
    }
    

    public void UpdateIssueDetails(Issue issue) throws IOException{
        String FILEPATHIssue = "C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\IssueData.txt";
        String issueId = null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHIssue);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            PrintWriter out = null;
            
            while((readLine = bufferedReader.readLine()) != null){
                String[] detailIssue = readLine.split(" : ");
                if(issueId.equals(detailIssue[0])){
                    String IssueData = issue.getIssueId() + " : " + issue.getIssueUserId() + " : " + issue.getIssueUserName() + " : " + issue.getIssueBookId() + " : " + issue.getIssueBookName() + " : " + issue.getIssueBorrowingDate() + " : " + issue.getIssueDueDate() + " : " + issue.getIssueStatus() + " : " + issue.getIssueFine();
                    out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHIssue,true)));
                    out.println(IssueData);
                }
                
            }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(IssueDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
