
package Classes;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Personnel extends User{
    
    private String centre;

    public Personnel(String userId,String password,String name,String gender,String email,String dateOfBirth,String contactNo, String IC, String centre, String state) {
        super(IC,userId, password, name, gender, email, dateOfBirth, contactNo, state);
        this.centre = centre;
    }
    
    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }


}
