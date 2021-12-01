/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.toedter.calendar.JDateChooser;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class AppointmentSlots {
    public String slot;
    
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
}
