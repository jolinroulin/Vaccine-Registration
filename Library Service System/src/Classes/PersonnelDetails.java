/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Color;
import java.awt.event.KeyEvent;
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
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class PersonnelDetails {
    File FILEPATHMember =new File("Personnel.txt");
    String[] columnsName = {"User ID","Password","Name","Gender","Email","DOB","Contact Number","IC","Vaccination Centre"};    
    
    
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
        
    public void validateCharacter(JTextField a, KeyEvent evt){   
    char c = evt.getKeyChar();
        
        if (Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            a.setEditable(true);
        }
        else{
             a.setEditable(false);
        }
    }

    public void validateDigit(JTextField a, KeyEvent evt){
         char c = evt.getKeyChar();

            if (Character.isDigit(c)||Character.isISOControl(c)){
                a.setEditable(true);
            }
            else{
                 a.setEditable(false);             
            }
    }

    public void validateDigitnCharacter(JTextField a, KeyEvent evt){
         char c = evt.getKeyChar();

            if (Character.isDigit(c)||Character.isLetter(c)||Character.isISOControl(c)||Character.isWhitespace(c)){
                a.setEditable(true);
            }
            else{
                 a.setEditable(false);             
            }
    }
    private static final String EMAIL_PATTERN = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public boolean validateEmailAdd(JTextField Email, JLabel invalid){
        boolean isValidEmail = false;
        if (!(Email.getText()).matches(EMAIL_PATTERN)) 
        {
            invalid.setForeground(Color.RED);
            invalid.setText("!");
        }
        else{
            invalid.setForeground(Color.GREEN);
            invalid.setText("!");
            isValidEmail = true;
        }
            return isValidEmail;
    }

    public boolean validateContactNumber(JTextField contactNumber, JLabel invalid, KeyEvent evt){  
       boolean isValidContact = false;
       String phnum = contactNumber.getText();
       int length = phnum.length();
       char c = evt.getKeyChar();
       if (evt.getKeyChar()>='0' && evt.getKeyChar() <='9' ){
           if (length>=10&length<12){
               invalid.setForeground(Color.GREEN);
               invalid.setText("!");
               isValidContact = true;
           }
           else{
               invalid.setForeground(Color.RED);
                invalid.setText("!");
           }
       }
       else{
           if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE){
               contactNumber.setEditable(true);
           }
           else{
               contactNumber.setEditable(false);
           }
           }
        return isValidContact;
    }

    public void viewPersonnelTable(JTable Personnel ){
        DefaultTableModel model = (DefaultTableModel)Personnel.getModel();
    //         while (model.getRowCount() > 0){
    //                model.removeRow(0);
    //            }

           
           try{
               BufferedReader br = new BufferedReader (new FileReader(FILEPATHMember)); 
               model.setColumnIdentifiers(columnsName);
               String view;
               while((view = br.readLine())!= null){
               String[] usr = view.split (" : ");
    //           String role = usr[4];
                 model.addRow(usr);
    //           if(role.equals("Customer")){
    //               
    //           }          
               }
           }
           catch(Exception ex){
               Logger.getLogger(PersonnelDetails.class.getName()).log(Level.SEVERE, null, ex);
           }       
    }        
      
    
    public void searchPersonnel(JTable Customer, JTextField UserName){
    DefaultTableModel model = (DefaultTableModel)Customer.getModel();
    while (model.getRowCount() > 0){
        model.removeRow(0);
    }
       try{
           BufferedReader br = new BufferedReader (new FileReader(FILEPATHMember));         
           model.setColumnIdentifiers(columnsName);
           String search;
           while ((search = br.readLine())!= null){
               String [] usr = search.split(" : ");
//               String role = usr [4];
               String name = usr[2];
            if (name.equals(UserName.getText()) ){
                   model.addRow(usr);
               }
//               if (id.equals(UserID.getText()) && role.equals("Customer")){
//                   model.addRow(usr);
//               }
           }
       }
       catch(Exception ex){

       }     
    }
    
    String filePath = "Personnel.txt";

public void deletePersonnel(JTextField UserID){
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
                if(!usr[2].equalsIgnoreCase(removeTerm)){
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

public void updateProfiles(JTextField ID,JTextField Password,JTextField Name,JComboBox Gender,JTextField Email,JTextField DOB,JTextField ContactNo ,JTextField IC,JComboBox  VaccineCentre){
    ArrayList<String> tempArray = new ArrayList<>();                        
    try (FileReader fr = new FileReader(filePath)){
       BufferedReader br = new BufferedReader(fr);
       String line;
       String [] lineArr;
    while ((line = br.readLine())!=null ){
       lineArr = line.split(" : ");
       String userid = lineArr[0];
       if (ID.getText().equals(userid)){
           tempArray.add (lineArr[0]+" : "+Password.getText()+" : " 
                   +  Name.getText()+" : " 
                   + Gender.getSelectedItem().toString()+" : "+ Email.getText()+" : "+DOB.getText()+" : "+ContactNo.getText()+" : "
                   +IC.getText()+" : "+VaccineCentre.getSelectedItem().toString());     
       }
       else{
           tempArray.add(line);
       }
       try(PrintWriter pr = new PrintWriter(filePath)){
            for (String str: tempArray){
                        pr.println(str);
                    }
                    pr.close();
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"File is not found!");
                } 
   }JOptionPane.showMessageDialog(null,"Your profile is updated!");
    fr.close();
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null,"File is not found!");
   }          
}
//
//public void selectRow(JTable TableSearch,JTextField ,JTextField ln,JTextField cn,JTextField email,JTextField street,JTextField city,JTextField state,JTextField postcode,JTextField country){
//    DefaultTableModel model = (DefaultTableModel)TableSearch.getModel();
//    int selectedRowIndex = TableSearch.getSelectedRow();
//
//    ln.setText(model.getValueAt(selectedRowIndex,1).toString());
//    fn.setText(model.getValueAt(selectedRowIndex,2).toString());
//    cn.setText(model.getValueAt(selectedRowIndex,5).toString());
//    email.setText(model.getValueAt(selectedRowIndex,6).toString());
//    street.setText(model.getValueAt(selectedRowIndex,7).toString());
//    city.setText(model.getValueAt(selectedRowIndex,8).toString());
//    postcode.setText(model.getValueAt(selectedRowIndex,9).toString());
//    state.setText(model.getValueAt(selectedRowIndex,10).toString());
//    country.setText(model.getValueAt(selectedRowIndex,11).toString());
//}

}
