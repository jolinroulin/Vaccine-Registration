/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import VaccineRegistrationSystem.manageAppointment;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author shengkhaiooi
 */
public class DateAppointmentDetails {
    File FILEPATHAppointmentDate =new File("AppointmentDate.txt");

   
    public void addDateAppointmentToTextFile(String date){
        
        try {
            
        PrintWriter out = null;
            
        out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHAppointmentDate,true)));
        out.println(date);
            
        out.close();
            
            JOptionPane.showMessageDialog(null, "Set Date Appointment Sucessfully! ");
        } catch (IOException ex) {
            Logger.getLogger(PersonnelDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /*
    public Object extractAppointmentDates() throws IOException{
        // Object[] Lines = br.lines().toArray();
         //  DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>( yourStringArray );
         //   cmbCentre1.setModel( model );

        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATHAppointmentDate);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            Object[] Lines = bufferedReader.lines().toArray();
            DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>( Lines );
            return model;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PeopleDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
*/}
    
    