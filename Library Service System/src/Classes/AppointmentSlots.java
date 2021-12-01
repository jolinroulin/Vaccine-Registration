/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.toedter.calendar.JDateChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AppointmentSlots {
    public String slot;
    String[] columnsName = {"Date","Time"};  
    
    public void addSlot(JComboBox state, JComboBox centre, JDateChooser date, JComboBox time){
        String newState = state.getSelectedItem().toString();
        String newCentre = centre.getSelectedItem().toString();
        Date newDate = date.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        String strDate = formatter.format(newDate);  
        String newTime = time.getSelectedItem().toString();
        
        String filename = "Slot/" + newState + "/" + newCentre + ".txt";
        
        try{
            FileWriter Writer = new FileWriter(filename, true);
            Writer.write(strDate + " : " + newTime);
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null, "Successfully added.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }     
    }
    
    public void viewSlotTable(JComboBox state, JComboBox centre, JTable t) throws FileNotFoundException, IOException{
            DefaultTableModel model = (DefaultTableModel)t.getModel();
            
        String newState = state.getSelectedItem().toString();
        String newCentre = centre.getSelectedItem().toString();
        
        try{
        String filename = "Slot/" + newState + "/" + newCentre + ".txt";
        File FILEPATH =new File(filename);
        

            BufferedReader br = new BufferedReader (new FileReader(FILEPATH)); 
            model.setColumnIdentifiers(columnsName);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(" : ");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No Record in this Centre!");
        }
            
    }
        public void viewSlotTable(String state, String centre, JTable t) throws FileNotFoundException, IOException{
            DefaultTableModel model = (DefaultTableModel)t.getModel();    
        try{
        String filename = "Slot/" + state + "/" + centre + ".txt";
        File FILEPATH =new File(filename);
        

            BufferedReader br = new BufferedReader (new FileReader(FILEPATH)); 
            model.setColumnIdentifiers(columnsName);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(" : ");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No Record in this Centre!");
        }
            
    }
    

}
