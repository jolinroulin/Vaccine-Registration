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
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
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
    
    public void addVacSupply(String state, String centre, String VacName, String VacCode, JDateChooser ExpDate, String Quantity){

        
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

    
    public void viewJohorVaccine(String centre, JComboBox vaccine){
        String filePath = "Vaccine/Johor/"+centre+".txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String[] lines = scanner.nextLine().split("\n");
                for(int i = 0; i < lines.length; i++){
                    String line = lines[i].toString();
                    vaccine.addItem(line);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No Record.");
        }
    }
    
    public void viewKLVaccine(String centre, JComboBox vaccine){
        String filePath = "Vaccine/Kuala Lumpur/"+centre+".txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String[] lines = scanner.nextLine().split("\n");
                for(int i = 0; i < lines.length; i++){
                    String line = lines[i].toString();
                    vaccine.addItem(line);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No Record.");
        }
    }
    
    public void viewPenangVaccine(String centre, JComboBox vaccine){
        String filePath = "Vaccine/Penang/"+centre+".txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String[] lines = scanner.nextLine().split("\n");
                for(int i = 0; i < lines.length; i++){
                    String line = lines[i].toString();
                    vaccine.addItem(line);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No Record.");
        }
    }

    
    public void modifyVaccineSupply(JTextField vacname, JTextField vaccode, JDateChooser expdate, JTextField quantity, JLabel state, JLabel centre){
        String vn = vacname.getText();
        String vc = vaccode.getText();
        Date ed = expdate.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = formatter.format(ed);
        String qtt = quantity.getText();
        String st = state.getText();
        String ct = centre.getText();

        ArrayList<String> tempArray = new ArrayList<>();

        try{
            try (FileReader fr = new FileReader("Vaccine/" + st + "/" + ct + ".txt")){
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;

                while((line=reader.nextLine())!=null){
                    lineArr = line.split(" : ");
                    if(lineArr[0].equals(vn) && lineArr[1].equals(vc)){
                        tempArray.add(vn + " : " + vc + " : " + strDate + " : " + qtt);
                        JOptionPane.showMessageDialog(null, "Modify Vaccine Supply Successful!");
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
            try(PrintWriter pr = new PrintWriter("Vaccine/" + st + "/" + ct + ".txt")){
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
