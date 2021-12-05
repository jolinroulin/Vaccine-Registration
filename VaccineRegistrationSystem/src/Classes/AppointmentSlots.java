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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AppointmentSlots {
    public String slotId;
    public String Date;
    public String Time;
    
    public String slot ;
    String[] columnsName = {"Slot Id","Date","Time"}; 
    public void addSlot(JComboBox state, JComboBox centre, JDateChooser date, JComboBox time) {
        String newState = state.getSelectedItem().toString();
        String newCentre = centre.getSelectedItem().toString();
        Date newDate = date.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = formatter.format(newDate);
        String newTime = time.getSelectedItem().toString();

        String filename = "Slot/" + newState + "/" + newCentre + ".txt";

        try{
            File file = new File(filename);
            InputStreamReader streamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader br = new BufferedReader(streamReader);
            String line = new String();
            while (br.ready()) {
                line = br.readLine();
            }
            int addid;
            if(file.length() == 0){
                addid = 1;
                FileWriter Writer = new FileWriter(filename, true);
                Writer.write(addid + " : " + strDate + " : " + newTime);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                JOptionPane.showMessageDialog(null, "Successfully added.");
            }else{
                String[] split = line.split(" : ");
                String id = split[0];
                int theid = Integer.parseInt(id);
                addid = theid + 1;
                FileWriter Writer = new FileWriter(filename, true);
                Writer.write(addid + " : " + strDate + " : " + newTime);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                JOptionPane.showMessageDialog(null, "Successfully added.");
            }
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
        
    public void deleteSlot(JLabel Id, String state, String centre, JDateChooser date, JComboBox time){
        if (JOptionPane.showConfirmDialog(null, "Are you sure to remove this slot?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
            String filePath = "Slot/" + state + "/" + centre + ".txt";
            File newFile = new File(filePath);
            String currentLine;
            String slot[];
            String id = Id.getText();
//            String removeTerm2 = time.getSelectedItem().toString();

            try{
                FileWriter fw = new FileWriter (filePath,true);
                BufferedWriter bw = new BufferedWriter (fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(newFile);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine())!=null ){
                    slot = currentLine.split(" : ");
                    if(!slot[0].equalsIgnoreCase(id.toString())){
                        new FileOutputStream(filePath).close();
                        pw.println(currentLine);
                    }
                }
                pw.flush();
                pw.close();

                File dslot = new File(filePath);
                newFile.renameTo(dslot);

                JOptionPane.showMessageDialog(null,"Record is deleted");
                date.setDate(new Date());
                time.setSelectedItem("");
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }  
        }  
    }
    
public void viewAvailableSlot(JLabel state, JComboBox centre, JComboBox cmbas) throws FileNotFoundException, IOException{
//        cmbas.getSelectedItem();
        String newState = state.getText();
        String newCentre = centre.getSelectedItem().toString();
        String filename = "Slot/" + newState + "/" + newCentre + ".txt";
        File FILEPATH =new File(filename);
        try {
            Scanner scanner = new Scanner(FILEPATH);
        while(scanner.hasNext()){
            String[] lines = scanner.nextLine().split("/n");
//            String[] lines = scanner.nextLine().split(" : ");
            for(int i = 0; i < lines.length; i++){
            String line = lines[i].toString();
            String[] split = line.split(" : ");
                    String item1 = split[1];
                    String item2 = split[2];
                    String additem = item1 + " : " + item2;
            cmbas.addItem(additem);
            }
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No Record in this centre!");
        }
}

public void viewPenangSlots(String centre, JComboBox slot){
        String filePath = "Slot/Penang/"+centre+".txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String[] lines = scanner.nextLine().split("\n");
                for(int i = 0; i < lines.length; i++){
                    String line = lines[i].toString();
                    String[] split = line.split(" : ");
                    String item1 = split[1];
                    String item2 = split[2];
                    String additem = item1 + " : " + item2;
                    slot.addItem(additem);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No Record.");
        }
    }

    public void viewKLSlots(String centre, JComboBox slot){
        String filePath = "Slot/Kuala Lumpur/"+centre+".txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String[] lines = scanner.nextLine().split("\n");
                for(int i = 0; i < lines.length; i++){
                    String line = lines[i].toString();
                    String[] split = line.split(" : ");
                    String item1 = split[1];
                    String item2 = split[2];
                    String additem = item1 + " : " + item2;
                    slot.addItem(additem);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No Record.");
        }
    }

    public void viewJohorSlots(String centre, JComboBox slot){
        String filePath = "Slot/Johor/"+centre+".txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String[] lines = scanner.nextLine().split("\n");
                for(int i = 0; i < lines.length; i++){
                    String line = lines[i].toString();
                    String[] split = line.split(" : ");
                    String item1 = split[1];
                    String item2 = split[2];
                    String additem = item1 + " : " + item2;
                    slot.addItem(additem);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No Record.");
        }
    }
    
public void modifyAddedApp(JLabel id, JComboBox centre, JComboBox slot){
        String theid = id.getText();
        String thecentre = centre.getSelectedItem().toString();
        String theslot = slot.getSelectedItem().toString();

        ArrayList<String> tempArray = new ArrayList<>();

        try{
            try (FileReader fr = new FileReader("Appointment/vaccineappadded.txt")){
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;

                while((line=reader.nextLine())!=null){
                    lineArr = line.split(" : ");
                    if(lineArr[0].equals(theid)){
                        tempArray.add(lineArr[0] + " : " + lineArr[1] + " : " + lineArr[2] + " : " + lineArr[3] + " : " + lineArr[4] + " : " + lineArr[5] + " : " + thecentre + " : " + theslot);
                        JOptionPane.showMessageDialog(null, "Appointment Updated!");
                    }else{
                        tempArray.add(line);
                    }
                }

                fr.close();
            }catch(Exception e){

            }
        }catch(Exception e){

        }

        try{
            try(PrintWriter pr = new PrintWriter("Appointment/vaccineappadded.txt")){
                for(String str : tempArray){
                    pr.println(str);
                }
                pr.close();
            }catch(Exception e){

            }
        }catch(Exception e){

        }
    }
}
