/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

import Classes.Admin;
import Classes.DatePicker;
import Classes.Librarian;
import Classes.AdminDetails;
import Classes.Personnel;
import Classes.PersonnelDetails;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class RegisterAdmin extends javax.swing.JFrame {

    /**
     * Creates new form RegisterLibrarian
     */
    public RegisterAdmin() {
        initComponents();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLEmailAddress = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtLUsername = new javax.swing.JTextField();
        txtLDOB = new javax.swing.JTextField();
        txtLMobileNumber = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbLGender = new javax.swing.JComboBox<>();
        btnSelectDateStdDOB = new javax.swing.JToggleButton();
        txtLPassword = new javax.swing.JTextField();
        btnLRegister = new javax.swing.JToggleButton();
        btnLClear = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        CmbLecSchoolProgram = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 550));
        jPanel1.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setText("IC Number:");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel6.setText("Date of Birth:");

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel7.setText("Email Address:");

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel8.setText("Mobile Number:");

        txtLEmailAddress.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLEmailAddressActionPerformed(evt);
            }
        });

        txtLName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        txtLUsername.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLUsernameActionPerformed(evt);
            }
        });

        txtLDOB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLDOBActionPerformed(evt);
            }
        });

        txtLMobileNumber.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLMobileNumberActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setText("Admin Registration");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Adminpic.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel10.setText("Gender:");

        cmbLGender.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbLGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));

        btnSelectDateStdDOB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnSelectDateStdDOB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Calender.png"))); // NOI18N
        btnSelectDateStdDOB.setText("Select Date");
        btnSelectDateStdDOB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSelectDateStdDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDateStdDOBActionPerformed(evt);
            }
        });

        txtLPassword.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtLPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLPasswordActionPerformed(evt);
            }
        });

        btnLRegister.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        btnLRegister.setText("Register");
        btnLRegister.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLRegisterActionPerformed(evt);
            }
        });

        btnLClear.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        btnLClear.setText("Clear");
        btnLClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLClearActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel12.setText("Centre");

        CmbLecSchoolProgram.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        CmbLecSchoolProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science ", "Software Engineering", "Cyber Security", "Interactive Media", "Networking" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CmbLecSchoolProgram, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbLGender, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtLEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtLMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSelectDateStdDOB)))
                                .addGap(237, 237, 237))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnLClear)
                                .addGap(63, 63, 63)
                                .addComponent(btnLRegister))
                            .addComponent(jLabel12))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cmbLGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtLUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtLPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtLDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnSelectDateStdDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtLMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CmbLecSchoolProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLRegister)
                            .addComponent(btnLClear)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLEmailAddressActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void txtLUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLUsernameActionPerformed

    private void txtLDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLDOBActionPerformed

    private void txtLMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLMobileNumberActionPerformed

    private void btnSelectDateStdDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDateStdDOBActionPerformed
        DatePicker datePicker = new DatePicker(this);
        txtLDOB.setText(datePicker.setPickedDate());
    }//GEN-LAST:event_btnSelectDateStdDOBActionPerformed

    private void txtLPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLPasswordActionPerformed

    private void btnLRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLRegisterActionPerformed
        
        if(txtLName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtLUsername.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtLPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtLDOB.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtLEmailAddress.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else if(txtLMobileNumber.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all the textfields are filled.");
        }
        else {
        String personnelID = null;
        String personnelName = txtLName.getText(); /*name*/
        String personnelGender = cmbLGender.getSelectedItem().toString();/*gender*/
        String personnelIC = txtLUsername.getText();/*IC*/
        String personnelPassword = txtLPassword.getText(); /*password*/
        String personnelDOB = txtLDOB.getText();/*DOB*/
        String personnelEmail = txtLEmailAddress.getText();/*email*/
        String personnelContactNo = txtLMobileNumber.getText();/*contactNo*/
        
        Personnel personnel = new Personnel(personnelID, personnelID, personnelName, personnelIC, personnelEmail, personnelIC, personnelContactNo, personnelIC, personnelIC);        
        
        PersonnelDetails personnelDetails = new PersonnelDetails();
      
        personnelDetails.addPersonnelToTextFile(personnel);

        cmbLGender.setSelectedItem(0);
        txtLName.setText("");
        txtLUsername.setText("");
        txtLPassword.setText("");
        txtLDOB.setText("");
        txtLEmailAddress.setText("");
        txtLMobileNumber.setText("");
        }
    }//GEN-LAST:event_btnLRegisterActionPerformed

    private void btnLClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLClearActionPerformed
        cmbLGender.setSelectedItem(0);
        txtLName.setText("");
        txtLUsername.setText("");
        txtLPassword.setText("");
        txtLDOB.setText("");
        txtLEmailAddress.setText("");
        txtLMobileNumber.setText("");
    }//GEN-LAST:event_btnLClearActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbLecSchoolProgram;
    private javax.swing.JButton btnLClear;
    private javax.swing.JToggleButton btnLRegister;
    private javax.swing.JToggleButton btnSelectDateStdDOB;
    private javax.swing.JComboBox<String> cmbLGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtLDOB;
    private javax.swing.JTextField txtLEmailAddress;
    private javax.swing.JTextField txtLMobileNumber;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtLPassword;
    private javax.swing.JTextField txtLUsername;
    // End of variables declaration//GEN-END:variables
}
