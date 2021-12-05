/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.toedter.calendar.JDateChooser;
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
import java.util.Scanner;
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

    File FILEPATHMember = new File("Personnel.txt");
    String[] columnsName = {"User ID", "Password", "Name", "Gender", "Email", "DOB", "Contact Number", "IC", "Vaccination Centre", "State"};

    public boolean addPersonnelToTextFile(Personnel personnel) {

        try {

            PrintWriter out = null;

            BufferedReader br = new BufferedReader(new FileReader(FILEPATHMember));
            Object[] Lines = br.lines().toArray();
            int i = 0;
            int id = 0;
            String MemberId = null;
            for (i = 0; i < Lines.length; i++) {
                String Line = Lines[i].toString().trim();
                String[] Row = Line.split(" : ");
                id = Integer.parseInt(Row[0]);

            }
            int id2 = id + 1;

            String MemberData = id2 + " : " + personnel.getPassword() + " : " + personnel.getName() + " : " + personnel.getGender() + " : " + personnel.getEmail() + " : " + personnel.getDateOfBirth() + " : " + personnel.getContactNo() + " : " + personnel.getIC() + " : " + personnel.getCentre() + " : " + personnel.getState();

            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATHMember, true)));
            out.println(MemberData);

            out.close();

            JOptionPane.showMessageDialog(null, "Details are added. Your personnel id is " + id2 + ".");
        } catch (IOException ex) {
            Logger.getLogger(PersonnelDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public void validateCharacter(JTextField a, KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            a.setEditable(true);
        } else {
            a.setEditable(false);
        }
    }

    public void validateDigit(JTextField a, KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            a.setEditable(true);
        } else {
            a.setEditable(false);
        }
    }

    public void validateDigitnCharacter(JTextField a, KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isLetter(c) || Character.isISOControl(c) || Character.isWhitespace(c)) {
            a.setEditable(true);
        } else {
            a.setEditable(false);
        }
    }
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public boolean validateEmailAdd(JTextField Email, JLabel invalid) {
        boolean isValidEmail = false;
        if (!(Email.getText()).matches(EMAIL_PATTERN)) {
            invalid.setForeground(Color.RED);
            invalid.setText("!");
        } else {
            invalid.setForeground(Color.GREEN);
            invalid.setText("!");
            isValidEmail = true;
        }
        return isValidEmail;
    }

    public boolean validateContactNumber(JTextField contactNumber, JLabel invalid, KeyEvent evt) {
        boolean isValidContact = false;
        String phnum = contactNumber.getText();
        int length = phnum.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length >= 10 & length < 12) {
                invalid.setForeground(Color.GREEN);
                invalid.setText("!");
                isValidContact = true;
            } else {
                invalid.setForeground(Color.RED);
                invalid.setText("!");
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                contactNumber.setEditable(true);
            } else {
                contactNumber.setEditable(false);
            }
        }
        return isValidContact;
    }

    public void viewPersonnelTable(JTable Personnel) {
        DefaultTableModel model = (DefaultTableModel) Personnel.getModel();
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILEPATHMember));
            model.setColumnIdentifiers(columnsName);
            String view;
            while ((view = br.readLine()) != null) {
                String[] usr = view.split(" : ");
                model.addRow(usr);
            }
        } catch (Exception ex) {
            Logger.getLogger(PersonnelDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void searchPersonnel(JTable Customer, JTextField UserName) {
        DefaultTableModel model = (DefaultTableModel) Customer.getModel();
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILEPATHMember));
            model.setColumnIdentifiers(columnsName);
            String search;
            while ((search = br.readLine()) != null) {
                String[] usr = search.split(" : ");
                String name = usr[2];
                if (name.equals(UserName.getText())) {
                    model.addRow(usr);
                }
            }
        } catch (Exception ex) {

        }
    }

    String filePath = "Personnel.txt";

    public void deletePersonnel(JTextField UserID) {
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            File newFile = new File(filePath);
            String currentLine;
            String usr[];
            String removeTerm = UserID.getText();

            try {
                FileWriter fw = new FileWriter(filePath, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(newFile);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine()) != null) {
                    usr = currentLine.split(" : ");
                    if (!usr[2].equalsIgnoreCase(removeTerm)) {
                        new FileOutputStream(filePath).close();
                        pw.println(currentLine);
                    }
                }
                pw.flush();
                pw.close();

                File User = new File(filePath);
                newFile.renameTo(User);

                JOptionPane.showMessageDialog(null, "Record is deleted");
                UserID.setText(null);
            } catch (Exception ex) {

            }
        }
    }

    public void modifyPersonnelDetails(JTextField ID, JTextField Password, JTextField Name, JComboBox Gender, JTextField Email, JTextField DOB, JTextField ContactNo, JTextField IC, JComboBox VaccineCentre, JComboBox state) {
        String theid = ID.getText();
        ArrayList<String> tempArray = new ArrayList<>();

        try {
            try (FileReader fr = new FileReader("Personnel.txt")) {
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;

                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split(" : ");
                    if (lineArr[0].equals(theid)) {
                        tempArray.add(lineArr[0] + " : " + Password.getText() + " : "
                                + Name.getText() + " : "
                                + Gender.getSelectedItem().toString() + " : " + Email.getText() + " : " + DOB.getText() + " : " + ContactNo.getText() + " : "
                                + IC.getText() + " : " + VaccineCentre.getSelectedItem().toString() + " : " + state.getSelectedItem().toString());
                        JOptionPane.showMessageDialog(null, "Personnel Details Updated!");

                        fr.close();
                    } else {
                        tempArray.add(line);
                    }
                }

            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
        ID.setText("");
        Password.setText("");
        Name.setText("");
        Gender.setSelectedIndex(0);
        Email.setText("");
        DOB.setText("");
        ContactNo.setText("");
        IC.setText("");
        VaccineCentre.setSelectedIndex(0);
        state.setSelectedItem(0);
        try {
            try (PrintWriter pr = new PrintWriter("Personnel.txt")) {
                for (String str : tempArray) {
                    pr.println(str);
                }
                pr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
    }
}
