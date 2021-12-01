/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccineRegistrationSystem;

import Classes.User;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PeopleMain extends javax.swing.JFrame {
    
//    void usernameStudent1(String user){
//         lblPeopleName.setText(user);
//    }
    User user = new User();
    /**
     * Creates new form StudentMain
     */
    public PeopleMain() {
        initComponents();
//        lblPeopleName.setText(user.getName());
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
        lblBackground = new javax.swing.JLabel();
        lblPeopleIC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVacStatus = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblPeopleName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiVaccineRegistration = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        MyIssue = new javax.swing.JMenu();
        jPeopleProfile = new javax.swing.JMenu();
        jMenuLogOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/library background.jpg"))); // NOI18N

        lblPeopleIC.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel6.setText("Welcome Back");

        lblVacStatus.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        lblVacStatus.setForeground(new java.awt.Color(51, 51, 255));
        lblVacStatus.setText("Not Registered");

        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel18.setText("Vaccination Status:");

        lblPeopleName.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(lblVacStatus)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblPeopleName, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPeopleIC, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeopleName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeopleIC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel18)
                .addGap(33, 33, 33)
                .addComponent(lblVacStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 102, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(153, 102, 255));
        jMenuBar1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N

        jmiVaccineRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vaccine.png"))); // NOI18N
        jmiVaccineRegistration.setText("Vaccine Registration");
        jmiVaccineRegistration.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiVaccineRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmiVaccineRegistrationMouseClicked(evt);
            }
        });
        jmiVaccineRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVaccineRegistrationActionPerformed(evt);
            }
        });
        jmiVaccineRegistration.add(jSeparator4);

        jMenuBar1.add(jmiVaccineRegistration);

        MyIssue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/finetax.png"))); // NOI18N
        MyIssue.setText("Appointment");
        MyIssue.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        MyIssue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyIssueMouseClicked(evt);
            }
        });
        MyIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyIssueActionPerformed(evt);
            }
        });
        jMenuBar1.add(MyIssue);

        jPeopleProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SearchUser.png"))); // NOI18N
        jPeopleProfile.setText("Profile");
        jPeopleProfile.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jPeopleProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPeopleProfileMouseClicked(evt);
            }
        });
        jPeopleProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPeopleProfileActionPerformed(evt);
            }
        });
        jMenuBar1.add(jPeopleProfile);

        jMenuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N
        jMenuLogOut.setText("LogOut");
        jMenuLogOut.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jMenuLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogOutMouseClicked(evt);
            }
        });
        jMenuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogOutActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuLogOut);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogOutMouseClicked
       int a = JOptionPane.showConfirmDialog(null, "Do you really want to Log Out?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new MainPage().setVisible(true); 
        }
    }//GEN-LAST:event_jMenuLogOutMouseClicked

    private void jMenuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogOutActionPerformed

    }//GEN-LAST:event_jMenuLogOutActionPerformed

    private void jmiVaccineRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVaccineRegistrationActionPerformed

    }//GEN-LAST:event_jmiVaccineRegistrationActionPerformed

    private void MyIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyIssueActionPerformed
        
    }//GEN-LAST:event_MyIssueActionPerformed

    private void jmiVaccineRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiVaccineRegistrationMouseClicked
        PeopleVaccineRegistration pv = new PeopleVaccineRegistration();
        new PeopleVaccineRegistration().setVisible(true);
        String name = lblPeopleName.getText();
        String ic = lblPeopleIC.getText();
        String status = lblVacStatus.getText();
        pv.setVisible(true);
        pv.lblName.setText(name);
        pv.lblIC1.setText(ic);
        pv.lblVacStatus.setText(status);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
        if(!"Not Registered".equals(status)){
            pv.btnRegister.setVisible(false);
        }
        
    }//GEN-LAST:event_jmiVaccineRegistrationMouseClicked

    private void MyIssueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyIssueMouseClicked

        String user = lblPeopleIC.getText();
                StudentIssue lm = new StudentIssue();
                lm.setVisible(true);
//                lm.usernameStudent(user);
    }//GEN-LAST:event_MyIssueMouseClicked

    private void jPeopleProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPeopleProfileMouseClicked
        // TODO add your handling code here:
        new PeopleProfile().setVisible(true);
        
    }//GEN-LAST:event_jPeopleProfileMouseClicked

    private void jPeopleProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPeopleProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPeopleProfileActionPerformed

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
            java.util.logging.Logger.getLogger(PeopleMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MyIssue;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuLogOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jPeopleProfile;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu jmiVaccineRegistration;
    private javax.swing.JLabel lblBackground;
    public javax.swing.JLabel lblPeopleIC;
    public javax.swing.JLabel lblPeopleName;
    public javax.swing.JLabel lblVacStatus;
    // End of variables declaration//GEN-END:variables

}
