/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Centre {
    File cjohor = new File("JohorCentres.txt");
    File ckualalumpur = new File("KLCentres.txt");
    File cpenang = new File("PenangCentres.txt");
    String[] columnsName1 = {"Johor"};
    String[] columnsName2 = {"Kuala Lumpur"};
    String[] columnsName3 = {"Penang"};
    
    public void viewJohorCentres(JTable johor){
        DefaultTableModel model = (DefaultTableModel)johor.getModel();
        try{
            BufferedReader br = new BufferedReader (new FileReader(cjohor)); 
            model.setColumnIdentifiers(columnsName1);
            String view;
            while((view = br.readLine())!= null){
            String[] cj = view.split(",");
            model.addRow(cj);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }
    
    public void viewKualaLumpurCentres(JTable kl){
        DefaultTableModel model = (DefaultTableModel)kl.getModel();
        try{
            BufferedReader br = new BufferedReader (new FileReader(ckualalumpur)); 
            model.setColumnIdentifiers(columnsName2);
            String view;
            while((view = br.readLine())!= null){
            String[] ckl = view.split(",");
            model.addRow(ckl);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public void viewPenangCentres(JTable penang){
        DefaultTableModel model = (DefaultTableModel)penang.getModel();
        try{
            BufferedReader br = new BufferedReader (new FileReader(cpenang)); 
            model.setColumnIdentifiers(columnsName3);
            String view;
            while((view = br.readLine())!= null){
            String[] cp = view.split(",");
            model.addRow(cp);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    String filePath1 = "JohorCentres.txt";
    String filePath2 = "KLCentres.txt";
    String filePath3 = "PenangCentres.txt";
    
    public void deleteJohorCentre(JTextField JohorCentre){
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete the centre?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
            File newFile = new File(filePath1);
            String currentLine;
            String jhr[];
            String removeTerm = JohorCentre.getText();

            try{
                FileWriter fw = new FileWriter (filePath1,true);
                BufferedWriter bw = new BufferedWriter (fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(newFile);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine())!=null ){
                    jhr = currentLine.split(",");
                    if(!jhr [0].equalsIgnoreCase(removeTerm)){
                        new FileOutputStream(filePath1).close();
                        pw.println(currentLine);
                    }
                }
                pw.flush();
                pw.close();

                File JH = new File(filePath1);
                newFile.renameTo(JH);

                JOptionPane.showMessageDialog(null,"Record is deleted");
                JohorCentre.setText(null);
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }
    
        public void deleteKLCentre(JTextField KLCentre){
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete the centre?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
            File newFile = new File(filePath2);
            String currentLine;
            String kl[];
            String removeTerm = KLCentre.getText();

            try{
                FileWriter fw = new FileWriter (filePath2,true);
                BufferedWriter bw = new BufferedWriter (fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(newFile);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine())!=null ){
                    kl = currentLine.split(",");
                    if(!kl[0].equalsIgnoreCase(removeTerm)){
                        new FileOutputStream(filePath2).close();
                        pw.println(currentLine);
                    }
                }
                pw.flush();
                pw.close();

                File JH = new File(filePath2);
                newFile.renameTo(JH);

                JOptionPane.showMessageDialog(null,"Record is deleted");
                KLCentre.setText(null);
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }
        
    public void deletePenangCentre(JTextField PenangCentre){
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete the centre?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
            File newFile = new File(filePath3);
            String currentLine;
            String pn[];
            String removeTerm = PenangCentre.getText();

            try{
                FileWriter fw = new FileWriter (filePath3,true);
                BufferedWriter bw = new BufferedWriter (fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(newFile);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine())!=null ){
                    pn = currentLine.split(",");
                    if(!pn[0].equalsIgnoreCase(removeTerm)){
                        new FileOutputStream(filePath3).close();
                        pw.println(currentLine);
                    }
                }
                pw.flush();
                pw.close();

                File PN = new File(filePath3);
                newFile.renameTo(PN);

                JOptionPane.showMessageDialog(null,"Record is deleted");
                PenangCentre.setText(null);
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }
    
    public void fillComboBoxJohor(JComboBox cmbj){
        
        File file = new File(filePath1);
        
        try {
            Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String[] lines = scanner.nextLine().split(",");
            for(int i = 0; i < lines.length; i++){
            String line = lines[i].toString();
            cmbj.addItem(line);
            }
        }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
    
      public void fillComboBoxKL(JComboBox cmbkl){
        
        File file = new File(filePath2);
        
        try {
            Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String[] lines = scanner.nextLine().split(",");
            for(int i = 0; i < lines.length; i++){
            String line = lines[i].toString();
            cmbkl.addItem(line);
            }
        }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
      
    public void fillComboBoxPenang(JComboBox cmbpn){
        
        File file = new File(filePath3);
        
        try {
            Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String[] lines = scanner.nextLine().split(",");
            for(int i = 0; i < lines.length; i++){
            String line = lines[i].toString();
            cmbpn.addItem(line);
            }
        }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }

}
