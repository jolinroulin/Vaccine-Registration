/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
}
