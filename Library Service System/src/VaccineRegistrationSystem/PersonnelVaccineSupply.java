/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineRegistrationSystem;

/**
 *
 * @author Asus
 */
public class PersonnelVaccineSupply extends javax.swing.JFrame {

    /**
     * Creates new form PersonnelVaccineSupply
     */
    public PersonnelVaccineSupply() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableJohor = new javax.swing.JTable();
        btnAddSlots = new javax.swing.JButton();
        btnAddSlots2 = new javax.swing.JButton();
        btnAddSlots3 = new javax.swing.JButton();
        txtJhrCentre = new javax.swing.JTextField();
        txtKLCentre = new javax.swing.JTextField();
        txtPenangCentre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbNewStateSlots = new javax.swing.JComboBox<>();
        cmbNewStateCentre = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        cmbTime = new javax.swing.JComboBox<>();
        btnAddSlots1 = new javax.swing.JButton();
        jComboBoxState1 = new javax.swing.JComboBox<>();
        jLabelICPassport1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("Add New Centre");

        BtnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAdd.setText("Add");
        BtnAdd.setActionCommand("ADD");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        jTableJohor.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTableJohor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Johor"
            }
        ));
        jTableJohor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableJohorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableJohor);

        btnAddSlots.setBackground(new java.awt.Color(204, 255, 255));
        btnAddSlots.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnAddSlots.setText("Delete");
        btnAddSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSlotsActionPerformed(evt);
            }
        });

        btnAddSlots2.setBackground(new java.awt.Color(204, 255, 255));
        btnAddSlots2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnAddSlots2.setText("Delete");
        btnAddSlots2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSlots2ActionPerformed(evt);
            }
        });

        btnAddSlots3.setBackground(new java.awt.Color(204, 255, 255));
        btnAddSlots3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnAddSlots3.setText("Delete");
        btnAddSlots3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSlots3ActionPerformed(evt);
            }
        });

        txtJhrCentre.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        txtJhrCentre.setEnabled(false);
        txtJhrCentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJhrCentreActionPerformed(evt);
            }
        });

        txtKLCentre.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        txtKLCentre.setEnabled(false);

        txtPenangCentre.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        txtPenangCentre.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel6.setText("Select Centre:");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel5.setText("Select State:");

        cmbNewStateSlots.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbNewStateSlots.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*None*", "Johor", "Kuala Lumpur", "Penang", " " }));
        cmbNewStateSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewStateSlotsActionPerformed(evt);
            }
        });

        cmbNewStateCentre.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbNewStateCentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewStateCentreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(txtJhrCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddSlots)
                .addGap(136, 136, 136)
                .addComponent(txtKLCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddSlots2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPenangCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddSlots3)
                .addGap(79, 79, 79))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cmbNewStateSlots, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cmbNewStateCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383)
                        .addComponent(BtnAdd))
                    .addComponent(jLabel2))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BtnAdd))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbNewStateSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cmbNewStateCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddSlots3)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddSlots)
                        .addComponent(btnAddSlots2)
                        .addComponent(txtJhrCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtKLCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPenangCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 255));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setText("Add New Slots");

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel14.setText("New Date:");

        jLabel15.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel15.setText("New Time:");

        cmbTime.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        cmbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*None*", "9am", "12pm", "3pm", "6pm" }));
        cmbTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTimeActionPerformed(evt);
            }
        });

        btnAddSlots1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnAddSlots1.setText("Add New Slots");
        btnAddSlots1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSlots1ActionPerformed(evt);
            }
        });

        jComboBoxState1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*None*", "Johor", "Kuala Lumpur", "Penang", " " }));
        jComboBoxState1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxState1ActionPerformed(evt);
            }
        });

        jLabelICPassport1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabelICPassport1.setText("Select State:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelICPassport1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(497, 497, 497)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(497, 497, 497)
                                .addComponent(jLabel14)
                                .addGap(39, 39, 39)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBoxState1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(145, 145, 145))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(935, Short.MAX_VALUE)
                    .addComponent(btnAddSlots1)
                    .addGap(33, 33, 33)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelICPassport1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jComboBoxState1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(btnAddSlots1)
                    .addGap(28, 28, 28)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Vaccination Supply");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxState1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxState1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxState1ActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
       
    }//GEN-LAST:event_BtnAddActionPerformed

    private void jTableJohorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableJohorMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)jTableJohor.getModel();
        String tblID = tblModel.getValueAt(jTableJohor.getSelectedRow(), 0).toString();
        txtJhrCentre.setText(tblID);
    }//GEN-LAST:event_jTableJohorMouseClicked

    private void btnAddSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSlotsActionPerformed
        c.deleteJohorCentre(txtJhrCentre);
        jTableJohor.setModel(new DefaultTableModel());
        c.viewJohorCentres(jTableJohor);
    }//GEN-LAST:event_btnAddSlotsActionPerformed

    private void btnAddSlots2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSlots2ActionPerformed
        c.deleteKLCentre(txtKLCentre);
        jTableKl.setModel(new DefaultTableModel());
        c.viewKualaLumpurCentres(jTableKl);
    }//GEN-LAST:event_btnAddSlots2ActionPerformed

    private void btnAddSlots3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSlots3ActionPerformed
        c.deletePenangCentre(txtPenangCentre);
        jTablePenang.setModel(new DefaultTableModel());
        c.viewPenangCentres(jTablePenang);
    }//GEN-LAST:event_btnAddSlots3ActionPerformed

    private void txtJhrCentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJhrCentreActionPerformed

    }//GEN-LAST:event_txtJhrCentreActionPerformed

    private void cmbNewStateSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewStateSlotsActionPerformed
        String state = cmbNewStateSlots.getSelectedItem().toString();
        if(state.equals("*None*")){
            JOptionPane.showMessageDialog(null, "Please select the state.");
        }else if(state.equals("Johor")){
            try{
                cmbNewStateCentre.removeAllItems();
                c.fillComboBoxJohor(cmbNewStateCentre);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }else if(state.equals("Kuala Lumpur")){
            try{
                cmbNewStateCentre.removeAllItems();
                c.fillComboBoxKL(cmbNewStateCentre);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }else if(state.equals("Penang")){
            try{
                cmbNewStateCentre.removeAllItems();
                c.fillComboBoxPenang(cmbNewStateCentre);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }

        }
    }//GEN-LAST:event_cmbNewStateSlotsActionPerformed

    private void cmbNewStateCentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewStateCentreActionPerformed

    }//GEN-LAST:event_cmbNewStateCentreActionPerformed

    private void cmbTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTimeActionPerformed

    private void btnAddSlots1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSlots1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSlots1ActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lblCloseMouseClicked

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
            java.util.logging.Logger.getLogger(PersonnelVaccineSupply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccineSupply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccineSupply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccineSupply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelVaccineSupply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton btnAddSlots;
    private javax.swing.JButton btnAddSlots1;
    private javax.swing.JButton btnAddSlots2;
    private javax.swing.JButton btnAddSlots3;
    private javax.swing.JComboBox<String> cmbNewStateCentre;
    private javax.swing.JComboBox<String> cmbNewStateSlots;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JComboBox<String> jComboBoxState;
    private javax.swing.JComboBox<String> jComboBoxState1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelICPassport;
    private javax.swing.JLabel jLabelICPassport1;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableJohor;
    private javax.swing.JLabel lblClose;
    private javax.swing.JTextField txtJhrCentre;
    private javax.swing.JTextField txtKLCentre;
    private javax.swing.JTextField txtPenangCentre;
    // End of variables declaration//GEN-END:variables
}
