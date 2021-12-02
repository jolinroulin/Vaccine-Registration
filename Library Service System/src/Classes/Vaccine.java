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
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Vaccine {
    private String vaccineName;
    private String vaccineCode;
    private int amount;
    private String expiryDate;
    

    String[] columnsName = {"Vaccine Name", "Vaccine Code", "Expiry Date", "Quantity"};

    public void viewVaccineTable(JLabel state, JLabel centre, JTable t)throws FileNotFoundException, IOException {
    DefaultTableModel model = (DefaultTableModel)t.getModel();
        String newState = state.getText();
        String newCentre = centre.getText();

        try{
            String filename = "Vaccine/" + newState + "/" + newCentre + ".txt";
            File FILEPATH =new File(filename);

            BufferedReader br = new BufferedReader (new FileReader(FILEPATH)); 
            model.setColumnIdentifiers(columnsName);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(" : ");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No Record in the selected Centre!");
        }
    }
    
    public void addVacSupply(String state, String centre, String VacName, String VacCode, JDateChooser ExpDate, int Quantity){

        
        Date expdate = ExpDate.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        String strDate = formatter.format(expdate);  
        
        String filename = "Vaccine/" + state + "/" + centre + ".txt";
        
        try{
            FileWriter Writer = new FileWriter(filename, true);
            Writer.write(VacName + " : " + VacCode + " : " + strDate + " : " + Quantity);
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null, "Successfully added.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
      public void deleteVacSupply(String state, String centre, JTextField vacname, JTextField vaccode, JDateChooser expdate, JTextField quantity){
        if (JOptionPane.showConfirmDialog(null, "Are you sure to remove the Vaccine?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
            String filePath = "Vaccine/" + state + "/" + centre + ".txt";
            File newFile = new File(filePath);
            String currentLine;
            String slot[];
            String removeTerm = vacname.getText();
            String removeTerm2 = vaccode.getText();

            try{
                FileWriter fw = new FileWriter (filePath,true);
                BufferedWriter bw = new BufferedWriter (fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(newFile);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine())!=null ){
                    slot = currentLine.split(" : ");
                    if(!slot[0].equalsIgnoreCase(removeTerm) && !slot[1].equalsIgnoreCase(removeTerm2)){
                        new FileOutputStream(filePath).close();
                        pw.println(currentLine);
                    }
                }
                pw.flush();
                pw.close();

                File ct = new File(filePath);
                newFile.renameTo(ct);
//&& !slot[1].equalsIgnoreCase(removeTerm2)
System.out.println(filePath);
                JOptionPane.showMessageDialog(null,"Record is deleted");
                vacname.setText("");
                vaccode.setText("");
                expdate.setDate(new Date());
                quantity.setText("");
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }  
        }  
    }
//    public void deleteVacSupply(String state, String centre, JTextField vacname, JTextField vaccode, JDateChooser expdate, JTextField quantity){
//        if (JOptionPane.showConfirmDialog(null, "Are you sure to remove the Vaccine?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
//            String filePath = "Vaccine/" + state + "/" + centre + ".txt";
//            File newFile = new File(filePath);
//            String currentLine;
//            String slot[];
//            String removeTerm = vacname.getText();
//            String removeTerm2 = vaccode.getText();
//
//            try{
//                FileWriter fw = new FileWriter (filePath,true);
//                BufferedWriter bw = new BufferedWriter (fw);
//                PrintWriter pw = new PrintWriter(bw);
//
//                FileReader fr = new FileReader(newFile);
//                BufferedReader br = new BufferedReader(fr);
//
//                while ((currentLine = br.readLine())!=null ){
//                    slot = currentLine.split(" : ");
//                    if(!slot[0].equalsIgnoreCase(removeTerm) && !slot[1].equalsIgnoreCase(removeTerm2)){
//                        new FileOutputStream(filePath).close();
//                        pw.println(currentLine);
//                    }
//                }
//                pw.flush();
//                pw.close();
//
//                File ct = new File(filePath);
//                newFile.renameTo(ct);
//
//                JOptionPane.showMessageDialog(null,"Record is deleted");
//                vacname.setText("");
//                vaccode.setText("");
//                expdate.setDate(new Date());
//                quantity.setText("");
//            }
//            catch(Exception ex) {
//                JOptionPane.showMessageDialog(null, "Error");
//            }  
//        }  
//    }


}
