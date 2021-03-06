/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nox;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vam
 */
public class Admin_Changepassword extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Changepassword
     */
    Statement s = null;
    ResultSet rs = null;
    public Admin_Changepassword() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Newpassword_Label = new javax.swing.JLabel();
        Oldpassword_Field = new javax.swing.JPasswordField();
        Oldpassword_Label = new javax.swing.JLabel();
        Newpassword_Field = new javax.swing.JPasswordField();
        Reenter_Label = new javax.swing.JLabel();
        Reenter_Field = new javax.swing.JPasswordField();
        Change_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        Newpassword_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Newpassword_Label.setForeground(new java.awt.Color(255, 255, 255));
        Newpassword_Label.setText("Enter New Password");

        Oldpassword_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Oldpassword_Label.setForeground(new java.awt.Color(255, 255, 255));
        Oldpassword_Label.setText("Enter Old Password");

        Reenter_Label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Reenter_Label.setForeground(new java.awt.Color(255, 255, 255));
        Reenter_Label.setText("Re-enter Password");

        Change_Button.setText("Change");
        Change_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Change_Button)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Newpassword_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Oldpassword_Field)
                        .addComponent(Oldpassword_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Newpassword_Field)
                        .addComponent(Reenter_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reenter_Field)))
                .addContainerGap(1110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(Oldpassword_Label)
                .addGap(38, 38, 38)
                .addComponent(Oldpassword_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(Newpassword_Label)
                .addGap(39, 39, 39)
                .addComponent(Newpassword_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(Reenter_Label)
                .addGap(38, 38, 38)
                .addComponent(Reenter_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(Change_Button)
                .addGap(79, 79, 79))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nox/cinemas/Background/changepassword.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Change_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_ButtonActionPerformed
        String s1 = Oldpassword_Field.getText();
        String s2 = Newpassword_Field.getText();
        String s3 = Reenter_Field.getText();
        Admin_Login al = new Admin_Login();
        if("".equals(s1) || "".equals(s2) || "".equals(s3))
        {
            JOptionPane.showMessageDialog(null, "Mandatory Fields Cannot be empty");
        }
        else if(s2 == "" || s3 == "")
        {
                JOptionPane.showMessageDialog(null,"Passwords do not Match");
        }
        else
        {
            try
            {
                DatabaseConnection con_8 = new DatabaseConnection();
                s = con_8.Connect.createStatement();
                s.executeQuery("UPDATE ADMIN SET PASSWORD = '"+s2+"' WHERE ADMINID = '"+al.adminuser+"'");
            }
            catch(SQLException se)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
            new Admin_Login().setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_Change_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Changepassword().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_Button;
    private javax.swing.JPasswordField Newpassword_Field;
    private javax.swing.JLabel Newpassword_Label;
    private javax.swing.JPasswordField Oldpassword_Field;
    private javax.swing.JLabel Oldpassword_Label;
    private javax.swing.JPasswordField Reenter_Field;
    private javax.swing.JLabel Reenter_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
