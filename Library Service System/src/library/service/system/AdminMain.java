/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianSite
     */
    public AdminMain() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    void username(String user){
         lblUser.setText(user);
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
        lbl = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAddLibrarian = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiViewLibrarian = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        AddLecturer = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ViewLecturer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiAddStudent = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiViewStudent = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiAddBook = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiViewBook = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmiIssueBook = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jmiRenew = new javax.swing.JMenu();
        jmiReturnBook = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuLogOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Librarian");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/library background.jpg"))); // NOI18N

        lbl.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N

        lblUser.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        lblUser.setText("  ");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel5.setText("WELCOME Personnel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(lbl)
                .addGap(237, 237, 237)
                .addComponent(lblUser)
                .addContainerGap(391, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(795, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(128, 128, 128)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(lblUser)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(jLabel5)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 102, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(153, 102, 255));
        jMenuBar1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(153, 102, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Adminpic.png"))); // NOI18N
        jMenu1.setText("Admin");
        jMenu1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N

        jmiAddLibrarian.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiAddLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AddUser.png"))); // NOI18N
        jmiAddLibrarian.setText("Add Admin");
        jmiAddLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddLibrarianActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAddLibrarian);
        jMenu1.add(jSeparator1);

        jmiViewLibrarian.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiViewLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SearchUser.png"))); // NOI18N
        jmiViewLibrarian.setText("View Admin");
        jmiViewLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiViewLibrarianActionPerformed(evt);
            }
        });
        jMenu1.add(jmiViewLibrarian);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lecturerpic.png"))); // NOI18N
        jMenu3.setText("Personnel");
        jMenu3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N

        AddLecturer.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        AddLecturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AddUser.png"))); // NOI18N
        AddLecturer.setText("Add Personnel");
        AddLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLecturerActionPerformed(evt);
            }
        });
        jMenu3.add(AddLecturer);
        jMenu3.add(jSeparator2);

        ViewLecturer.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        ViewLecturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SearchUser.png"))); // NOI18N
        ViewLecturer.setText("View Personnel");
        ViewLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewLecturerActionPerformed(evt);
            }
        });
        jMenu3.add(ViewLecturer);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Studentpic.png"))); // NOI18N
        jMenu2.setText("Student");
        jMenu2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N

        jmiAddStudent.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AddUser.png"))); // NOI18N
        jmiAddStudent.setText("Add Student");
        jmiAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddStudentActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAddStudent);
        jMenu2.add(jSeparator3);

        jmiViewStudent.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiViewStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SearchUser.png"))); // NOI18N
        jmiViewStudent.setText("View Student");
        jmiViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiViewStudentActionPerformed(evt);
            }
        });
        jMenu2.add(jmiViewStudent);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Book.png"))); // NOI18N
        jMenu4.setText("Book");
        jMenu4.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N

        jmiAddBook.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/addbook.png"))); // NOI18N
        jmiAddBook.setText("Add Book");
        jmiAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddBookActionPerformed(evt);
            }
        });
        jMenu4.add(jmiAddBook);
        jMenu4.add(jSeparator4);

        jmiViewBook.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiViewBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search.png"))); // NOI18N
        jmiViewBook.setText("View Book ");
        jmiViewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiViewBookActionPerformed(evt);
            }
        });
        jMenu4.add(jmiViewBook);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/borrowbook.png"))); // NOI18N
        jMenu5.setText("Issue");
        jMenu5.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N

        jmiIssueBook.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiIssueBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bookmark.png"))); // NOI18N
        jmiIssueBook.setText("Issue Book");
        jmiIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIssueBookActionPerformed(evt);
            }
        });
        jMenu5.add(jmiIssueBook);

        jMenuBar1.add(jMenu5);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Renewbook.png"))); // NOI18N
        jMenu8.setText("Renew");
        jMenu8.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N

        jmiRenew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/renew book.png"))); // NOI18N
        jmiRenew.setText("Renew Book");
        jmiRenew.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiRenew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmiRenewMouseClicked(evt);
            }
        });
        jmiRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRenewActionPerformed(evt);
            }
        });
        jMenu8.add(jmiRenew);

        jMenuBar1.add(jMenu8);

        jmiReturnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/finetax.png"))); // NOI18N
        jmiReturnBook.setText("Return");
        jmiReturnBook.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jmiReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReturnBookActionPerformed(evt);
            }
        });

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/returnbook.png"))); // NOI18N
        jMenu10.setText("Return Book");
        jMenu10.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jmiReturnBook.add(jMenu10);

        jMenuBar1.add(jmiReturnBook);

        jMenuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N
        jMenuLogOut.setText("LogOut");
        jMenuLogOut.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jMenuLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogOutMouseClicked(evt);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLecturerActionPerformed
        new RegisterPerExtra().setVisible(true);
    }//GEN-LAST:event_AddLecturerActionPerformed

    private void jmiViewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiViewBookActionPerformed
        new ViewBook().setVisible(true);
    }//GEN-LAST:event_jmiViewBookActionPerformed

    private void jmiAddLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddLibrarianActionPerformed
        new RegisterPersonnel().setVisible(true);
    }//GEN-LAST:event_jmiAddLibrarianActionPerformed

    private void jmiViewLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiViewLibrarianActionPerformed
        new ViewPersonnel().setVisible(true);
    }//GEN-LAST:event_jmiViewLibrarianActionPerformed

    private void jmiAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddStudentActionPerformed
        new RegisterUser().setVisible(true);
    }//GEN-LAST:event_jmiAddStudentActionPerformed

    private void jmiViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiViewStudentActionPerformed
        new ViewStudent().setVisible(true);
    }//GEN-LAST:event_jmiViewStudentActionPerformed

    private void jMenuLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogOutMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Log Out?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
           setVisible(false);
            new MainPage().setVisible(true);  
        }
        
    }//GEN-LAST:event_jMenuLogOutMouseClicked

    private void jmiAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddBookActionPerformed
        new AddBook().setVisible(true);
    }//GEN-LAST:event_jmiAddBookActionPerformed

    private void ViewLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewLecturerActionPerformed
        new ViewStaff().setVisible(true);
    }//GEN-LAST:event_ViewLecturerActionPerformed

    private void jmiIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIssueBookActionPerformed
        new BorrowBook().setVisible(true);
    }//GEN-LAST:event_jmiIssueBookActionPerformed

    private void jmiRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRenewActionPerformed
        
    }//GEN-LAST:event_jmiRenewActionPerformed

    private void jmiReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReturnBookActionPerformed
        
    }//GEN-LAST:event_jmiReturnBookActionPerformed

    private void jmiRenewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiRenewMouseClicked
        new RenewBook().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jmiRenewMouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        new ReturnBook().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenu10MouseClicked

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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddLecturer;
    private javax.swing.JMenuItem ViewLecturer;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuLogOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem jmiAddBook;
    private javax.swing.JMenuItem jmiAddLibrarian;
    private javax.swing.JMenuItem jmiAddStudent;
    private javax.swing.JMenuItem jmiIssueBook;
    private javax.swing.JMenu jmiRenew;
    private javax.swing.JMenu jmiReturnBook;
    private javax.swing.JMenuItem jmiViewBook;
    private javax.swing.JMenuItem jmiViewLibrarian;
    private javax.swing.JMenuItem jmiViewStudent;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
