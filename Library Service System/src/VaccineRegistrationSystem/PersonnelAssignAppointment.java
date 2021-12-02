/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineRegistrationSystem;

import Classes.Appointment;
import Classes.AppointmentSlots;
import Classes.Centre;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Asus
 */
public class PersonnelAssignAppointment extends javax.swing.JFrame {

    /**
     * Creates new form PersonnelAssignAppointment
     */
    Centre c =new Centre();
    Appointment a = new Appointment();
    AppointmentSlots as = new AppointmentSlots();
    public PersonnelAssignAppointment() {
        initComponents();
        hideContent();
        try {
            a.viewRegisteredPeopleTable(jTableRegistered);
        } catch (IOException ex) {
            Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbNewStateCentre = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cmbTime = new javax.swing.JComboBox<>();
        btnAddSlot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistered = new javax.swing.JTable();
        btnViewApp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblIC = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblPeopleType = new javax.swing.JLabel();
        txtAssSearch = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnviewSlot = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Assign Appointment");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/borrowbook.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close-window-30.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(509, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(398, 398, 398)
                .addComponent(lblClose)
                .addGap(35, 35, 35))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblClose))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setText("Arrange Date and Time ");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel6.setText("Select Centre:");

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel14.setText("IC / Passport Number:");

        cmbNewStateCentre.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbNewStateCentre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNewStateCentreItemStateChanged(evt);
            }
        });
        cmbNewStateCentre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbNewStateCentreMouseClicked(evt);
            }
        });
        cmbNewStateCentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewStateCentreActionPerformed(evt);
            }
        });
        cmbNewStateCentre.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbNewStateCentrePropertyChange(evt);
            }
        });
        cmbNewStateCentre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbNewStateCentreKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel15.setText("Select Time Slot:");

        cmbTime.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTimeActionPerformed(evt);
            }
        });

        btnAddSlot.setBackground(new java.awt.Color(255, 204, 153));
        btnAddSlot.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnAddSlot.setText("Add");
        btnAddSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSlotActionPerformed(evt);
            }
        });

        jTableRegistered.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jTableRegistered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableRegistered.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegisteredMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegistered);

        btnViewApp.setBackground(new java.awt.Color(255, 204, 204));
        btnViewApp.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnViewApp.setText("View Assigned Appointment");
        btnViewApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setText("Registered People Details");

        jLabel19.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel19.setText("Name: ");

        jLabel20.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel20.setText("PeopleType: ");

        jLabel21.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel21.setText("State:");

        lblIC.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblIC.setText("lblIC");

        lblName.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblName.setText("lblName");

        lblState.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblState.setText("lblStatus");

        lblPeopleType.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblPeopleType.setText("lblPeopleType");

        txtAssSearch.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtAssSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAssSearchKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel16.setText("Search:");

        btnviewSlot.setBackground(new java.awt.Color(255, 204, 153));
        btnviewSlot.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnviewSlot.setText("View Slots");
        btnviewSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewSlotActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel22.setText("Contact Number: ");

        lblContactNo.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblContactNo.setText("lblContactNo");

        jLabel23.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel23.setText("Email:");

        lblEmail.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblEmail.setText("lblEmail");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel6))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbNewStateCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnviewSlot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddSlot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel14)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblState)
                            .addComponent(lblIC)
                            .addComponent(lblName)
                            .addComponent(lblContactNo)
                            .addComponent(lblPeopleType)
                            .addComponent(lblEmail)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnViewApp, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtAssSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel7)
                    .addContainerGap(970, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblIC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(lblContactNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(lblEmail))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(lblState))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lblPeopleType))
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbNewStateCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnviewSlot))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(btnAddSlot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewApp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtAssSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel7)
                    .addContainerGap(622, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        PersonnelMain home = new PersonnelMain();
        home.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
        //        setVisible(false);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void cmbNewStateCentreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNewStateCentreItemStateChanged
       
//        try {
//            cmbTime.removeAllItems();
//            as.viewAvailableSlot(lblState, cmbNewStateCentre, cmbTime);
//        } catch (IOException ex) {
//            Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_cmbNewStateCentreItemStateChanged

    private void cmbNewStateCentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewStateCentreActionPerformed

    }//GEN-LAST:event_cmbNewStateCentreActionPerformed

    private void cmbNewStateCentreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbNewStateCentreKeyPressed

//                try {
//            cmbTime.removeAllItems();
//            as.viewAvailableSlot(lblState, cmbNewStateCentre, cmbTime);
//        } catch (IOException ex) {
//            Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_cmbNewStateCentreKeyPressed

    private void cmbTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTimeActionPerformed

    private void btnAddSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSlotActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure to add appointment to this people?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                String ic = lblIC.getText();
                String name = lblName.getText();
                String cn = lblContactNo.getText();
                String email = lblContactNo.getText();
                String state = lblState.getText();
                String peopletype = lblPeopleType.getText();
                String centre = cmbNewStateCentre.getSelectedItem().toString();
                String slot = cmbTime.getSelectedItem().toString();

                FileWriter Writer = new FileWriter("Appointment/vaccineappadded.txt", true);
                Writer.write(ic + " : " + name + " : " + cn + " : " + email + " : " + state + " : " + peopletype + " : " + centre + " : " + slot);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();

                JOptionPane.showMessageDialog(null, "Assigned Successful");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }

            a.removefromRegistered(lblIC);
            jTableRegistered.setModel(new DefaultTableModel());
            try {
                a.viewRegisteredPeopleTable(jTableRegistered);
            } catch (IOException ex) {
                Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jTableRegistered.setModel(new DefaultTableModel());
            try {
                a.viewRegisteredPeopleTable(jTableRegistered);
            } catch (IOException ex) {
                Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddSlotActionPerformed

    private void jTableRegisteredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegisteredMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)jTableRegistered.getModel();
        String ic = tblModel.getValueAt(jTableRegistered.getSelectedRow(), 0).toString();
        String name = tblModel.getValueAt(jTableRegistered.getSelectedRow(), 1).toString();
        String contactNo = tblModel.getValueAt(jTableRegistered.getSelectedRow(), 2).toString();
        String email = tblModel.getValueAt(jTableRegistered.getSelectedRow(), 3).toString();
        String state= tblModel.getValueAt(jTableRegistered.getSelectedRow(), 4).toString();
        String peopletype = tblModel.getValueAt(jTableRegistered.getSelectedRow(), 5).toString();
        
        showContent();
         try {
            lblIC.setText(ic);
        lblName.setText(name);
        lblContactNo.setText(contactNo);
        lblEmail.setText(email);
        lblState.setText(state);
        lblPeopleType.setText(peopletype);
            if(lblState.getText().equals("Johor")){
                try{
                    cmbNewStateCentre.removeAllItems();
                    c.fillComboBoxJohor(cmbNewStateCentre);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error.");
                }
            }else if(lblState.getText().equals("Kuala Lumpur")){
                try{
                    cmbNewStateCentre.removeAllItems();
                    c.fillComboBoxKL(cmbNewStateCentre);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error.");
                }
            }else if(lblState.getText().equals("Penang")){
                try{
                    cmbNewStateCentre.removeAllItems();
                    c.fillComboBoxPenang(cmbNewStateCentre);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error.");
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableRegisteredMouseClicked

    private void btnViewAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppActionPerformed
 new PersonnelManageAppointment().setVisible(true);
 this.dispose();
    }//GEN-LAST:event_btnViewAppActionPerformed

    public void hideContent() {
        jSeparator1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel6.setVisible(false);
        cmbNewStateCentre.setVisible(false);
        btnviewSlot.setVisible(false);
        jLabel15.setVisible(false);
        cmbTime.setVisible(false);
        btnAddSlot.setVisible(false);
//        btnViewApp.setVisible(false);
    }

    public void showContent() {
        jSeparator1.setVisible(true);
        jLabel4.setVisible(true);
        jLabel6.setVisible(true);
        cmbNewStateCentre.setVisible(true);
        btnviewSlot.setVisible(true);
        jLabel15.setVisible(true);
        cmbTime.setVisible(true);
        btnAddSlot.setVisible(true);
//        btnViewApp.setVisible(true);
    }
    private void txtAssSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAssSearchKeyReleased
        DefaultTableModel table = (DefaultTableModel) jTableRegistered.getModel();
        String search = txtAssSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTableRegistered.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtAssSearchKeyReleased

    private void cmbNewStateCentrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbNewStateCentrePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNewStateCentrePropertyChange

    private void btnviewSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewSlotActionPerformed
        try {
            cmbTime.removeAllItems();
            as.viewAvailableSlot(lblState, cmbNewStateCentre, cmbTime);
        } catch (IOException ex) {
            Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnviewSlotActionPerformed

    private void cmbNewStateCentreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbNewStateCentreMouseClicked
        cmbTime.removeAllItems();
    }//GEN-LAST:event_cmbNewStateCentreMouseClicked

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
            java.util.logging.Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelAssignAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelAssignAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSlot;
    private javax.swing.JButton btnViewApp;
    private javax.swing.JButton btnviewSlot;
    private javax.swing.JComboBox<String> cmbNewStateCentre;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableRegistered;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPeopleType;
    private javax.swing.JLabel lblState;
    private javax.swing.JTextField txtAssSearch;
    // End of variables declaration//GEN-END:variables
}
