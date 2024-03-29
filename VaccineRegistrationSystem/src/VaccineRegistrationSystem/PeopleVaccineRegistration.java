/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineRegistrationSystem;

import Classes.Appointment;
import Classes.User;
import java.io.FileWriter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class PeopleVaccineRegistration extends javax.swing.JFrame {
        User user = new User();
        Appointment a = new Appointment();
    
    /**
     * Creates new form PeopleVaccineResgistration
     */
    public PeopleVaccineRegistration() {
        initComponents();
        lblName.setText(user.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblClose2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblVacStatus = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblIC1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCancelApp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCentre = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblSlot = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblVaccine = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Vaccine Registration");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vaccine.png"))); // NOI18N
        jLabel17.setText("jLabel13");

        lblClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close-window-30.png"))); // NOI18N
        lblClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(329, 329, 329)
                .addComponent(lblClose2)
                .addGap(35, 35, 35))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblClose2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        jPanel9.setPreferredSize(new java.awt.Dimension(548, 198));

        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel18.setText("Vaccination Status:");

        btnRegister.setBackground(new java.awt.Color(204, 255, 255));
        btnRegister.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setText("Registered People Details");

        jLabel22.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel22.setText("Name: ");

        lblVacStatus.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblVacStatus.setForeground(new java.awt.Color(51, 51, 255));
        lblVacStatus.setText("Not Registered");

        lblName.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblName.setText("lbl");
        lblName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblNameKeyReleased(evt);
            }
        });

        lblIC1.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblIC1.setText("lbl");
        lblIC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIC1KeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel23.setText("IC/ Passport No: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIC1)
                            .addComponent(lblName))
                        .addContainerGap(768, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(71, 71, 71)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVacStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lblIC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblVacStatus)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnCancelApp.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelApp.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnCancelApp.setText("Cancel Appointment");
        btnCancelApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAppActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setText("Vaccination Status");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel6.setText("Centre:");

        lblCentre.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblCentre.setText("lblCentre");

        jLabel19.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel19.setText("Slot:");

        lblSlot.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblSlot.setText("lblSlot");

        jLabel20.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel20.setText("Vaccine:");

        lblVaccine.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblVaccine.setText("lblVaccine");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(790, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel19))
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVaccine)
                                    .addComponent(lblSlot)
                                    .addComponent(lblCentre)))
                            .addComponent(jLabel20))
                        .addGap(151, 151, 151)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelApp, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblCentre))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblSlot))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelApp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(lblVaccine)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        PeopleMain pm = new PeopleMain();
        String name = lblName.getText();
        String ic = lblIC1.getText();
        String status = lblVacStatus.getText();
        pm.setVisible(true);
        pm.lblPeopleIC.setText(ic);
        pm.lblPeopleName.setText(name);
        pm.lblVacStatusM.setText(status);
        this.dispose();
        //        setVisible(false);
       
    }//GEN-LAST:event_lblClose2MouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String ic = lblIC1.getText();
        String name = lblName.getText();

        if(a.findCitizen(ic, name)){
            try{
                FileWriter Writer = new FileWriter("Appointment/vaccineregistered.txt", true);
                String phoneno = a.getContactNo();
                String email = a.getEmail(); 
                String state = a.getState();
                String peopleType =a.getPeopleType();
                
                String filecontent = (ic + " : " + name + " : " + phoneno + " : " + email + " : " + state+ " : " + peopleType );
                Writer.write(filecontent);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                JOptionPane.showMessageDialog(null, "Register Successful!");
                setVisible(false);
                PeopleMain hp = new PeopleMain();
                hp.setVisible(true);
                hp.lblPeopleIC.setText(ic);
                hp.lblPeopleName.setText(name);
                hp.lblVacStatusM.setText("Vaccination Registered");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }else if(a.findNonCitizen(ic, name)){
            try{
                FileWriter Writer = new FileWriter("Appointment/vaccineregistered.txt", true);
                String phoneno = a.getContactNo();
                String email = a.getEmail(); 
                String state = a.getState();
                String peopleType =a.getPeopleType();
                
                String filecontent = (ic + " : " + name + " : " + phoneno + " : " + email + " : " + state + " : " + peopleType);
                Writer.write(filecontent);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                JOptionPane.showMessageDialog(null, "Register Successful!");
                setVisible(false);
                PeopleMain hp = new PeopleMain();
                hp.setVisible(true);
                hp.lblPeopleIC.setText(ic);
                hp.lblPeopleName.setText(name);
                hp.lblVacStatusM.setText("Vaccination Registered");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
            
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lblNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblNameKeyReleased

    
    }//GEN-LAST:event_lblNameKeyReleased

    private void lblIC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIC1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIC1KeyReleased

    private void btnCancelAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAppActionPerformed
         String ic = lblIC1.getText();
        String name = lblName.getText();
        if(a.findCitizen(ic, name)){
            String phoneno = a.getContactNo();
                String email = a.getEmail(); 
                String state = a.getState();
                String peopleType =a.getPeopleType();
            if (JOptionPane.showConfirmDialog(null, "Are you sure to cancel his/her appointment?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
                try{
                    FileWriter Writer = new FileWriter("Appointment/vaccineregistered.txt", true);
                    Writer.write(ic + ", " + name + ", " + phoneno + ", " + email + ", " + state + ", " + peopleType);
                    Writer.write(System.getProperty("line.separator"));
                    Writer.close();
                    JOptionPane.showMessageDialog(null, "Appointment Cancelled. Your status is changed back as 'Vaccination Registered'.");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error");
                }
                //Delete from old file
                a.removefromAddedApp(lblIC1);
                PeopleMain pm = new PeopleMain();
                String status = "Vaccination Registered";
                pm.setVisible(true);
                pm.lblPeopleIC.setText(ic);
                pm.lblPeopleName.setText(name);
                pm.lblVacStatusM.setText(status);
                this.setVisible(false);
                this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                this.dispose();
            }
        }else if(a.findNonCitizen(ic, name)){
            String phoneno = a.getContactNo();
                String email = a.getEmail(); 
                String state = a.getState();
                String peopleType =a.getPeopleType();
            if (JOptionPane.showConfirmDialog(null, "Are you sure to cancel his/her appointment?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
                try{
                    FileWriter Writer = new FileWriter("Appointment/vaccineregistered.txt", true);
                    Writer.write(ic + ", " + name + ", " + phoneno + ", " + email + ", " + state + ", " + peopleType);
                    Writer.write(System.getProperty("line.separator"));
                    Writer.close();
                    JOptionPane.showMessageDialog(null, "Appointment Cancelled. Your status is changed back as 'Vaccination Registered'.");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error");
                }
                //Delete from old file
                a.removefromAddedApp(lblIC1);
                PeopleMain pm = new PeopleMain();
                String status = "Vaccination Registered";
                pm.setVisible(true);
                pm.lblPeopleIC.setText(ic);
                pm.lblPeopleName.setText(name);
                pm.lblVacStatusM.setText(status);
                this.setVisible(false);
                this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnCancelAppActionPerformed

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
            java.util.logging.Logger.getLogger(PeopleVaccineRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleVaccineRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleVaccineRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleVaccineRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleVaccineRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelApp;
    public javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblCentre;
    private javax.swing.JLabel lblClose2;
    public javax.swing.JLabel lblIC1;
    public javax.swing.JLabel lblName;
    public javax.swing.JLabel lblSlot;
    public javax.swing.JLabel lblVacStatus;
    public javax.swing.JLabel lblVaccine;
    // End of variables declaration//GEN-END:variables
}
