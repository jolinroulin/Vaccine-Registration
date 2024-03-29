/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineRegistrationSystem;

import Classes.AppointmentSlots;
import Classes.Centre;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class PersonnelAddSlots extends javax.swing.JFrame {

    /**
     * Creates new form PersonnelAddSlots
     */
    AppointmentSlots as = new AppointmentSlots();
    Centre c = new Centre();

    public PersonnelAddSlots() {
        initComponents();
        hideContent();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbNewStateSlots = new javax.swing.JComboBox<>();
        cmbNewStateCentre = new javax.swing.JComboBox<>();
        DateSlot = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        cmbTime = new javax.swing.JComboBox<>();
        btnAddSlot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSlot = new javax.swing.JTable();
        btnDeleteSlots = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblCentre = new javax.swing.JLabel();
        btnViewSlot1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        lblSlotId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add Vaccination Slots");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/addappointment.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setText("Add New Slots");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel5.setText("Select State:");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel6.setText("Select Centre:");

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel14.setText("New Date:");

        cmbNewStateSlots.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbNewStateSlots.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*None*", "Johor", "Kuala Lumpur", "Penang" }));
        cmbNewStateSlots.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNewStateSlotsItemStateChanged(evt);
            }
        });
        cmbNewStateSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewStateSlotsActionPerformed(evt);
            }
        });
        cmbNewStateSlots.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbNewStateSlotsPropertyChange(evt);
            }
        });

        cmbNewStateCentre.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbNewStateCentre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNewStateCentreItemStateChanged(evt);
            }
        });
        cmbNewStateCentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewStateCentreActionPerformed(evt);
            }
        });
        cmbNewStateCentre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbNewStateCentreKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel15.setText("New Time:");

        cmbTime.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*None*", "9am", "12pm", "3pm", "6pm" }));
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

        jTableSlot.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jTableSlot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableSlot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSlotMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSlot);

        btnDeleteSlots.setBackground(new java.awt.Color(255, 204, 204));
        btnDeleteSlots.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnDeleteSlots.setText("Delete");
        btnDeleteSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSlotsActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel16.setText("State:");

        lblState.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblState.setText("<State>");

        jLabel17.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel17.setText("Centre:");

        lblCentre.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblCentre.setText("<Centre>");

        btnViewSlot1.setBackground(new java.awt.Color(204, 255, 255));
        btnViewSlot1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnViewSlot1.setText("View");
        btnViewSlot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSlot1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel18.setText("Slot Id:");

        lblSlotId.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblSlotId.setText("<Slot Id>");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(cmbNewStateSlots, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(cmbNewStateCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnViewSlot1)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(btnDeleteSlots)
                                .addGap(39, 39, 39)
                                .addComponent(btnAddSlot))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(40, 40, 40)
                                        .addComponent(DateSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel15)
                                        .addGap(34, 34, 34)
                                        .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSlotId)))
                                .addGap(139, 139, 139))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(lblState)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(lblCentre)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(45, 45, 45))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbNewStateSlots, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbNewStateCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewSlot1))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(DateSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel14))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteSlots)
                            .addComponent(btnAddSlot))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblState)
                    .addComponent(jLabel17)
                    .addComponent(lblCentre)
                    .addComponent(jLabel18)
                    .addComponent(lblSlotId))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.dispose();
        new PersonnelMain().setVisible(true);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void cmbNewStateSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewStateSlotsActionPerformed
        String state = cmbNewStateSlots.getSelectedItem().toString();

        if (state.equals("*None*")) {
            JOptionPane.showMessageDialog(null, "Please select the state.");
        } else if (state.equals("Johor")) {
            try {
//               lblState.setText(state);
                cmbNewStateCentre.removeAllItems();
                c.fillComboBoxJohor(cmbNewStateCentre);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        } else if (state.equals("Kuala Lumpur")) {
            try {
//                lblState.setText(state);
                cmbNewStateCentre.removeAllItems();
                c.fillComboBoxKL(cmbNewStateCentre);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        } else if (state.equals("Penang")) {
            try {
//                lblState.setText(state);
                cmbNewStateCentre.removeAllItems();
                c.fillComboBoxPenang(cmbNewStateCentre);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        }
    }//GEN-LAST:event_cmbNewStateSlotsActionPerformed

    private void cmbNewStateCentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewStateCentreActionPerformed

    }//GEN-LAST:event_cmbNewStateCentreActionPerformed

    private void cmbTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTimeActionPerformed

    private void btnAddSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSlotActionPerformed
        Date date = DateSlot.getDate();
        String time = cmbTime.getSelectedItem().toString();
        String state = lblState.getText();
        String centre = lblCentre.getText();
        if ("*None*".equals(cmbNewStateSlots.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Please select the state.");
        } else if (state.equals(" ") && centre.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Please click the 'VIEW' button to proceed.");
        } else if (!centre.equals(cmbNewStateCentre.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Please click the 'VIEW' button to proceed.");
        } else if (!state.equals(cmbNewStateSlots.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Please click the 'VIEW' button to proceed.");
        } else if (date == null) {
            JOptionPane.showMessageDialog(null, "Please select the date.");
        } else if (time.equals("*None*")) {
            JOptionPane.showMessageDialog(null, "Please select the time.");
        } else {
            as.addSlot(cmbNewStateSlots, cmbNewStateCentre, DateSlot, cmbTime);
            try {
                jTableSlot.setModel(new DefaultTableModel());
                as.viewSlotTable(state, centre, jTableSlot);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        }

    }//GEN-LAST:event_btnAddSlotActionPerformed

    private void btnDeleteSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSlotsActionPerformed
        String state = lblState.getText();
        String centre = lblCentre.getText();
        Date date = DateSlot.getDate();
        String time = cmbTime.getSelectedItem().toString();

        if ("*None*".equals(cmbNewStateSlots.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Please select the state.");
        } else if (state.equals(" ") && centre.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Please click the 'VIEW' button to proceed.");
        } else if (!centre.equals(cmbNewStateCentre.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Please click the 'VIEW' button to proceed.");
        } else if (!state.equals(cmbNewStateSlots.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Please click the 'VIEW' button to proceed.");
        } else if (date == null) {
            JOptionPane.showMessageDialog(null, "Please select the date.");
        } else if (time.equals("*None*")) {
            JOptionPane.showMessageDialog(null, "Please select the time.");
        } else {
            as.deleteSlot(lblSlotId,state, centre, DateSlot, cmbTime);
            jTableSlot.setModel(new DefaultTableModel());
            try {
                as.viewSlotTable(state, centre, jTableSlot);
            } catch (IOException ex) {
                Logger.getLogger(PersonnelAddSlots.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteSlotsActionPerformed

    private void cmbNewStateCentreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNewStateCentreItemStateChanged

    }//GEN-LAST:event_cmbNewStateCentreItemStateChanged

    private void cmbNewStateCentreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbNewStateCentreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNewStateCentreKeyPressed

    private void cmbNewStateSlotsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNewStateSlotsItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNewStateSlotsItemStateChanged

    private void cmbNewStateSlotsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbNewStateSlotsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNewStateSlotsPropertyChange

    private void btnViewSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSlot1ActionPerformed
        String state = cmbNewStateSlots.getSelectedItem().toString();
        String centre = cmbNewStateCentre.getSelectedItem().toString();
        try {
            showContent();
            jTableSlot.setModel(new DefaultTableModel());
            as.viewSlotTable(cmbNewStateSlots, cmbNewStateCentre, jTableSlot);
            lblState.setText(state);
            lblCentre.setText(centre);
        } catch (IOException ex) {
            Logger.getLogger(PersonnelAddSlots.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewSlot1ActionPerformed

    private void jTableSlotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSlotMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTableSlot.getModel();
        String id = tblModel.getValueAt(jTableSlot.getSelectedRow(), 0).toString();
        String date = tblModel.getValueAt(jTableSlot.getSelectedRow(), 1).toString();
        String time = tblModel.getValueAt(jTableSlot.getSelectedRow(), 2).toString();

        try {
            java.util.Date thedate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            lblSlotId.setText(id);
            DateSlot.setDate(thedate);
            cmbTime.setSelectedItem(time);
        } catch (ParseException ex) {
            Logger.getLogger(PersonnelAddSlots.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTableSlotMouseClicked
    public void hideContent(){
        jSeparator1.setVisible(false);
        jLabel14.setVisible(false);
        DateSlot.setVisible(false);
        jLabel15.setVisible(false);
        cmbTime.setVisible(false);
        btnDeleteSlots.setVisible(false);
        btnAddSlot.setVisible(false);
        jLabel16.setVisible(false);
        lblState.setVisible(false);
        jLabel17.setVisible(false);
        lblCentre.setVisible(false);
        jTableSlot.setVisible(false);

    }
    
    
    public void showContent(){
        jSeparator1.setVisible(true);
        jLabel14.setVisible(true);
        DateSlot.setVisible(true);
        jLabel15.setVisible(true);
        cmbTime.setVisible(true);
        btnDeleteSlots.setVisible(true);
        btnAddSlot.setVisible(true);
        jLabel16.setVisible(true);
        lblState.setVisible(true);
        jLabel17.setVisible(true);
        lblCentre.setVisible(true);
        jTableSlot.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(PersonnelAddSlots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddSlots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddSlots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddSlots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelAddSlots().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateSlot;
    private javax.swing.JButton btnAddSlot;
    private javax.swing.JButton btnDeleteSlots;
    private javax.swing.JButton btnViewSlot1;
    private javax.swing.JComboBox<String> cmbNewStateCentre;
    private javax.swing.JComboBox<String> cmbNewStateSlots;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableSlot;
    private javax.swing.JLabel lblCentre;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblSlotId;
    private javax.swing.JLabel lblState;
    // End of variables declaration//GEN-END:variables
}

