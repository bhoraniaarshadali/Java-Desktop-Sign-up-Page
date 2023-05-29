/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/OkCancelDialog.java to edit this template
 */
package gui_pkg;

import static gui_pkg.Con2.con;
import static gui_pkg.Con2.ps;
import static gui_pkg.Forgot_Pwd.email0;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Apex
 */
public class Confirm_Pwd extends javax.swing.JDialog {
        
    String new_pwd1;
    String new_re_pwd1;
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;
    private Object ex;

    /**
     * Creates new form demo
     * @param parent
     * @param modal
     */
    public Confirm_Pwd(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        
        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
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

        pwd3 = new javax.swing.JLabel();
        new_pwd = new javax.swing.JTextField();
        pwd4 = new javax.swing.JLabel();
        new_re_pwd = new javax.swing.JTextField();
        Submit_new_pwd = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pwd3.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pwd3.setText("Enter New Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 97, 0, 0);
        getContentPane().add(pwd3, gridBagConstraints);

        new_pwd.setBackground(new java.awt.Color(204, 204, 204));
        new_pwd.setForeground(new java.awt.Color(0, 0, 255));
        new_pwd.setBorder(null);
        new_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_pwdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 97, 0, 100);
        getContentPane().add(new_pwd, gridBagConstraints);

        pwd4.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pwd4.setText("Re-write Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 97, 0, 0);
        getContentPane().add(pwd4, gridBagConstraints);

        new_re_pwd.setBackground(new java.awt.Color(204, 204, 204));
        new_re_pwd.setForeground(new java.awt.Color(0, 0, 255));
        new_re_pwd.setBorder(null);
        new_re_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_re_pwdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 97, 0, 100);
        getContentPane().add(new_re_pwd, gridBagConstraints);

        Submit_new_pwd.setBackground(new java.awt.Color(234, 234, 234));
        Submit_new_pwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Submit_new_pwd.setForeground(new java.awt.Color(0, 0, 255));
        Submit_new_pwd.setText("Change Password");
        Submit_new_pwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit_new_pwd.setMaximumSize(new java.awt.Dimension(54, 28));
        Submit_new_pwd.setMinimumSize(new java.awt.Dimension(54, 28));
        Submit_new_pwd.setPreferredSize(new java.awt.Dimension(54, 28));
        Submit_new_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_new_pwdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 97, 63, 0);
        getContentPane().add(Submit_new_pwd, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void new_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwdActionPerformed

    private void new_re_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_re_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_re_pwdActionPerformed

    private void Submit_new_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_new_pwdActionPerformed
            Con2 objCon2 = new Con2();
        try {
            objCon2.getCon();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Confirm_Pwd.class.getName()).log(Level.SEVERE, null, ex);
        }
            new_pwd1 =new_pwd.getText();
            new_re_pwd1 =new_re_pwd.getText();
            //Con2.email0 =forgot_email.getText();

            if (new_pwd1.equals("")) {    
                JOptionPane.showMessageDialog(rootPane, "Field must not null");
            }
            else if(new_re_pwd1.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Field must not null");
            }
            else if(new_re_pwd1 == null ? new_pwd1 != null : !new_re_pwd1.equals(new_pwd1)) {
                JOptionPane.showMessageDialog(rootPane, "both password field doesn,t match");
            }
            else {
                try {
                    //String email00="test";
                    //System.out.println(email0);
                    String sql;
                    sql = ("update registration_details SET Password=? where Email=?");
                    ps=con.prepareStatement(sql);
                    ps.setString(1, new_pwd1);
                    ps.setString(2, email0);
                    
                    
                    
                    int i=ps.executeUpdate();
                    if(i!=0)
                        {
                        JOptionPane.showMessageDialog(rootPane, "Password change Successfully.");                        
                        Signup objSignup =new Signup();
                        Login objLogin = new Login();
                        objLogin.setVisible(true);
                        objLogin.setTitle("Login");
                        }
                        else  {
                         JOptionPane.showMessageDialog(rootPane,"Something wrong !");
                        }
                    
                    java.util.logging.Logger.getLogger(Confirm_Pwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Confirm_Pwd.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
    }//GEN-LAST:event_Submit_new_pwdActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
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
            java.util.logging.Logger.getLogger(Confirm_Pwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm_Pwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm_Pwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm_Pwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            Confirm_Pwd dialog = new Confirm_Pwd(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit_new_pwd;
    public static javax.swing.JTextField new_pwd;
    public static javax.swing.JTextField new_re_pwd;
    private javax.swing.JLabel pwd3;
    private javax.swing.JLabel pwd4;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;

    private void setState(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
