/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineRegistrationSystem;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Asus
 */
public class PersonnelCompletedAppointment extends javax.swing.JFrame {

    /**
     * Creates new form PersonnelCompletedAppointment
     */
    public PersonnelCompletedAppointment() {
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
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableToBeCompleted = new javax.swing.JTable();
        btnViewSlot1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblIC = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cmbVaccineName = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtAssSearch = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPeopleType = new javax.swing.JLabel();
        lblCentre = new javax.swing.JLabel();
        lblSlot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Vaccination Completion");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vaccinated.png"))); // NOI18N
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
                .addContainerGap(447, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(408, 408, 408)
                .addComponent(lblClose)
                .addGap(35, 35, 35))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel14.setText("IC / Passport Number:");

        jTableToBeCompleted.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jTableToBeCompleted.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableToBeCompleted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableToBeCompletedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableToBeCompleted);

        btnViewSlot1.setBackground(new java.awt.Color(204, 255, 255));
        btnViewSlot1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnViewSlot1.setText("Complete");
        btnViewSlot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSlot1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setText("Registered People Details");

        jLabel19.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel19.setText("Name: ");

        jLabel20.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel20.setText("Contact Number:");

        jLabel21.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel21.setText("Status:");

        lblIC.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblIC.setText("lblIC/Passport");

        lblName.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblName.setText("lblName");

        lblStatus.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblStatus.setText("lblStatus");

        lblContactNo.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblContactNo.setText("lblContactNo");

        jLabel22.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel22.setText("Vaccine Name:");

        cmbVaccineName.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        cmbVaccineName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel16.setText("Search:");

        txtAssSearch.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtAssSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAssSearchKeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel23.setText("Email:");

        jLabel24.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel24.setText("People Type:");

        jLabel25.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel25.setText("Centre:");

        jLabel26.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel26.setText("Slot:");

        lblEmail.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblEmail.setText("lblEmail");

        lblPeopleType.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblPeopleType.setText("lblPeopleType");

        lblCentre.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblCentre.setText("lblCentre");

        lblSlot.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        lblSlot.setText("lblSlot");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSlot)
                                    .addComponent(lblCentre)
                                    .addComponent(lblPeopleType)
                                    .addComponent(lblEmail)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblIC)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblContactNo, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(39, 39, 39)
                                .addComponent(cmbVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnViewSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtAssSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtAssSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblIC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(lblStatus))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lblContactNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(lblEmail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(lblPeopleType))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(lblCentre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(lblSlot))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(btnViewSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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
        PersonnelMain home = new PersonnelMain();
        home.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
        //        setVisible(false);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void jTableToBeCompletedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableToBeCompletedMouseClicked
        //        DefaultTableModel tblModel = (DefaultTableModel) jTableToBeCompleted.getModel();
        //        String id = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 0).toString();
        //        String name = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 1).toString();
        //        String phoneno = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 2).toString();
        //        String email = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 3).toString();
        //        String state = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 4).toString();
        //        String peopletype = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 5).toString();
        //        String centre = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 6).toString();
        //        String date = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 7).toString();
        //        String time = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 8).toString();
        //        String slot = date + ", " + time;
        //        String vac1 = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 9).toString();
        //        String vac2 = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 10).toString();
        //        String vac3 = tblModel.getValueAt(jTableToBeCompleted.getSelectedRow(), 11).toString();
        //        String vac = vac1 + " : " + vac2 + " : " + vac3;
        //
        //        lblIC.setText(id);
        //        lblName.setText(name);
        //        lblStatus.setText(state);
        //        lblContactNo.setText(phoneno);
        //        lblEmail.setText(email);
        //        lblPeopleType.setText(peopletype);
        //        lblCentre.setText(centre);
        //        lblSlot.setText(slot);
        //        lbl.setText(vac);
    }//GEN-LAST:event_jTableToBeCompletedMouseClicked

    private void btnViewSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSlot1ActionPerformed
        //        String state = cmbNewStateSlots.getSelectedItem().toString();
        //        String centre  = cmbNewStateCentre.getSelectedItem().toString();
        //        try {
            //            jTableSlot.setModel(new DefaultTableModel());
            //            as.viewSlotTable(cmbNewStateSlots, cmbNewStateCentre, jTableSlot);
            //            lblState.setText(state);
            //            lblCentre.setText(centre);
            //        } catch (IOException ex) {
            //            Logger.getLogger(PersonnelAddSlots.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btnViewSlot1ActionPerformed

    private void txtAssSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAssSearchKeyReleased
        DefaultTableModel table = (DefaultTableModel) jTableToBeCompleted.getModel();
        String search = txtAssSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTableToBeCompleted.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtAssSearchKeyReleased

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
            java.util.logging.Logger.getLogger(PersonnelCompletedAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelCompletedAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelCompletedAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelCompletedAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelCompletedAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewSlot1;
    private javax.swing.JComboBox<String> cmbVaccineName;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableToBeCompleted;
    private javax.swing.JLabel lblCentre;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPeopleType;
    private javax.swing.JLabel lblSlot;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtAssSearch;
    // End of variables declaration//GEN-END:variables
}
