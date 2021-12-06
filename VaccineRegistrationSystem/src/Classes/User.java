package Classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static jdk.nashorn.internal.runtime.Debug.id;

public class User {

    private String userId;
    private String password;
    private String name;
    private String gender;
    private String email;
    private String dateOfBirth;
    private String contactNo;
    private String IC;
    private String state;

    public User(String userId, String password, String name, String gender, String email, String dateOfBirth, String contactNo, String IC, String state) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.contactNo = contactNo;
        this.IC = IC;
        this.state = state;

    }

    public boolean verifypersonnel(String id) {
        try {
            FileReader fr = new FileReader("Personnel.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[7])) {
                    IC = split[7];
//                    password = split[1];
                    name = split[2];
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }

    public boolean verifycitizen(String id, String Password) {
        try {
            FileReader fr = new FileReader("Citizen.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[7])) {
                    userId = split[0];
                    password = split[1];
                    name = split[2];
                    gender = split[3];
                    email = split[4];
                    dateOfBirth = split[5];
                    contactNo = split[6];
                    IC = split[7];
                    state = split[8];
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }

    public boolean verifynoncitizen(String id) {
        try {
            FileReader fr = new FileReader("NonCitizen.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[7])) {
                    userId = split[0];
                    password = split[1];
                    name = split[2];
                    gender = split[3];
                    email = split[4];
                    dateOfBirth = split[5];
                    contactNo = split[6];
                    IC = split[7];
                    state = split[8];
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }

    public boolean findCitizen(String id) {
        try {
            FileReader fr = new FileReader("Citizen.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[7])) {
                    userId = split[0];
                    password = split[1];
                    name = split[2];
                    gender = split[3];
                    email = split[4];
                    dateOfBirth = split[5];
                    contactNo = split[6];
                    IC = split[7];
                    state = split[8];
                    return true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }

    public boolean findNonCitizen(String id) {
        try {
            FileReader fr = new FileReader("NonCitizen.txt");
            BufferedReader br = new BufferedReader(fr);
            String record;
            while ((record = br.readLine()) != null) {
                String[] split = record.split(" : ");
                if (id.equals(split[7])) {
                    userId = split[0];
                    password = split[1];
                    name = split[2];
                    gender = split[3];
                    email = split[4];
                    dateOfBirth = split[5];
                    contactNo = split[6];
                    IC = split[7];
                    state = split[8];
                    return true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false;
    }

    public void maskPassword(JCheckBox View, JPasswordField Password) {
        if (View.isSelected()) {
            Password.setEchoChar((char) 0);
        } else {
            Password.setEchoChar('*');
        }
    }

    public void maskPassword(JCheckBox View, JPasswordField NewPass, JPasswordField ConfirmPass) {
        if (View.isSelected()) {
            NewPass.setEchoChar((char) 0);
            ConfirmPass.setEchoChar((char) 0);
        } else {
            NewPass.setEchoChar('*');
            ConfirmPass.setEchoChar('*');
        }
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void modifyCitizen(JTextField userId, JTextField password, JTextField name, JComboBox gender,
            JTextField email, JTextField dateOfBirth, JTextField contactNo, JTextField IC, JComboBox state) {
        String id = userId.getText();
        String p = password.getText();
        String na = name.getText();
        String ge = gender.getSelectedItem().toString();
        String em = email.getText();
        String dob = dateOfBirth.getText();
        String cn = contactNo.getText();
        String ic = IC.getText();
        String st = state.getSelectedItem().toString();

        ArrayList<String> tempArray = new ArrayList<>();

        try {
            try (FileReader fr = new FileReader("Citizen.txt")) {
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;

                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split(" : ");
                    if (lineArr[7].equals(ic)) {
                        tempArray.add(id + " : " + p + " : " + na + " : " + ge + " : " + em + " : " + dob + " : " + cn + " : " + ic + " : " + st);
                        JOptionPane.showMessageDialog(null, "Modify Successful!");
                    } else {
                        tempArray.add(line);
                    }
                }

                fr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }

        try {
            try (PrintWriter pr = new PrintWriter("Citizen.txt")) {
                for (String str : tempArray) {
                    pr.println(str);
                }
                pr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
    }

    public void modifyNonCitizen(JTextField userId, JTextField password, JTextField name, JComboBox gender,
            JTextField email, JTextField dateOfBirth, JTextField contactNo, JTextField IC, JComboBox state) {
        String id = userId.getText();
        String p = password.getText();
        String na = name.getText();
        String ge = gender.getSelectedItem().toString();
        String em = email.getText();
        String dob = dateOfBirth.getText();
        String cn = contactNo.getText();
        String ic = IC.getText();
        String st = state.getSelectedItem().toString();

        ArrayList<String> tempArray = new ArrayList<>();

        try {
            try (FileReader fr = new FileReader("NonCitizen.txt")) {
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;

                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split(" : ");
                    if (lineArr[7].equals(ic)) {
                        tempArray.add(id + " : " + p + " : " + na + " : " + ge + " : " + em + " : " + dob + " : " + cn + " : " + ic + " : " + st);
                        JOptionPane.showMessageDialog(null, "Modify Successful!");
                    } else {
                        tempArray.add(line);
                    }
                }

                fr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }

        try {
            try (PrintWriter pr = new PrintWriter("NonCitizen.txt")) {
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
