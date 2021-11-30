/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccine.Registration.System;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class StaffIssue extends javax.swing.JFrame {

    /**
     * Creates new form StaffIssue
     */
    
    private void ImportIssueDetailsToTable() {
        String filepath = "C:\\Users\\User\\Documents\\NetBeansProjects\\Library Service System\\IssueData.txt";
        File file = new File(filepath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            DefaultTableModel model = (DefaultTableModel) jTableIssueBook.getModel();
            /*String[] columnsName = firstLine.split("|");
            String firstLine = br.readLine().trim();
            model.setColumnIdentifiers(columnsName);*/

            Object[] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" : ");
                model.addRow(dataRow);
            }
        } catch (Exception ex) {
            Logger.getLogger(StaffIssue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void usernameStaff(String user){
         lblStaffBorrow.setText(user);
     } 
    
    public StaffIssue() {
        initComponents();
        ImportIssueDetailsToTable();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIssueBook = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        lblStaffBorrow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("My Borrow");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/borrowbook.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close-window-30.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClose)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblClose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableIssueBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue Id", "Member Id", "Member Name", "Book Id", "Book Name", "Borrowing Date", "Due Date", "Status", "Fine (RM)"
            }
        ));
        jTableIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIssueBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableIssueBook);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setText("Staff");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblStaffBorrow.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lblStaffBorrow.setText("  ");
        lblStaffBorrow.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblStaffBorrowAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblStaffBorrow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblStaffBorrowKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblStaffBorrowKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(491, 491, 491))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblStaffBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblStaffBorrow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnRefresh)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableIssueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIssueBookMouseClicked
        /*DefaultTableModel tblModel = (DefaultTableModel)jTableIssueBook.getModel();

        //set data to textfield when row i selected
        String tblIssueId = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 0).toString();
        String tblUserId = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 1).toString();
        String tblUserName = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 2).toString();
        String tblBookId = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 3).toString();
        String tblBookName = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 4).toString();
        String tblIssuedate = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 5).toString();
        String tblDueDate = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 6).toString();
        String tblStatus = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 7).toString();
        String tblFine = tblModel.getValueAt(jTableIssueBook.getSelectedRow(), 8).toString(); */
    }//GEN-LAST:event_jTableIssueBookMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        for(int x = 0; x< jTableIssueBook.getRowCount();x++){
            LocalDate today = LocalDate.now();
            String duedate = jTableIssueBook.getValueAt(x, 6).toString();
            LocalDate sduedate = LocalDate.parse(duedate);
            Duration differ = Duration.between(sduedate.atStartOfDay(), today.atStartOfDay());
            long fine = differ.toDays();
            double i = 0.00;
            if(fine > 0){
                jTableIssueBook.setValueAt((i + fine), x , 8);
                
            }
            JOptionPane.showMessageDialog(this, "Refreshed");
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void lblStaffBorrowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblStaffBorrowKeyReleased

    }//GEN-LAST:event_lblStaffBorrowKeyReleased

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblStaffBorrowKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblStaffBorrowKeyTyped
        
    }//GEN-LAST:event_lblStaffBorrowKeyTyped

    private void lblStaffBorrowAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblStaffBorrowAncestorAdded
        DefaultTableModel table = (DefaultTableModel) jTableIssueBook.getModel();
        String search = lblStaffBorrow.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTableIssueBook.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));// TODO add your handling code here:
    }//GEN-LAST:event_lblStaffBorrowAncestorAdded

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
            java.util.logging.Logger.getLogger(StaffIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffIssue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableIssueBook;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblStaffBorrow;
    // End of variables declaration//GEN-END:variables
}