/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_pkg;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Apex
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Index0
     */
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pwdlogin = new javax.swing.JPasswordField();
        login_head1 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        logininput = new javax.swing.JTextField();
        Loginbtn = new javax.swing.JButton();
        signinbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pwd1 = new javax.swing.JLabel();
        pwd2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(647, 454));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pwdlogin.setBackground(new java.awt.Color(204, 204, 204));
        pwdlogin.setForeground(new java.awt.Color(0, 0, 255));
        pwdlogin.setBorder(null);
        pwdlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdloginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 8, 0, 0);
        getContentPane().add(pwdlogin, gridBagConstraints);

        login_head1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        login_head1.setForeground(new java.awt.Color(0, 0, 255));
        login_head1.setText("Sign in");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 8, 0, 0);
        getContentPane().add(login_head1, gridBagConstraints);

        minimize.setBackground(new java.awt.Color(102, 102, 102));
        minimize.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        minimize.setForeground(new java.awt.Color(102, 102, 102));
        minimize.setText("-");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 53, 0, 0);
        getContentPane().add(minimize, gridBagConstraints);

        closebtn.setBackground(new java.awt.Color(102, 102, 102));
        closebtn.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        closebtn.setForeground(new java.awt.Color(102, 102, 102));
        closebtn.setText("X");
        closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 27);
        getContentPane().add(closebtn, gridBagConstraints);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_pkg/index_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 108, 0);
        getContentPane().add(image, gridBagConstraints);

        username.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        username.setText("Email or Mobile Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 8, 0, 0);
        getContentPane().add(username, gridBagConstraints);

        logininput.setBackground(new java.awt.Color(204, 204, 204));
        logininput.setForeground(new java.awt.Color(0, 0, 255));
        logininput.setAutoscrolls(false);
        logininput.setBorder(null);
        logininput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        logininput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logininputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 8, 0, 0);
        getContentPane().add(logininput, gridBagConstraints);
        logininput.getAccessibleContext().setAccessibleName("");
        logininput.getAccessibleContext().setAccessibleDescription("");

        Loginbtn.setBackground(new java.awt.Color(234, 234, 234));
        Loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Loginbtn.setForeground(new java.awt.Color(0, 0, 255));
        Loginbtn.setText("Sign in");
        Loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginbtn.setMaximumSize(new java.awt.Dimension(54, 28));
        Loginbtn.setMinimumSize(new java.awt.Dimension(54, 28));
        Loginbtn.setPreferredSize(new java.awt.Dimension(54, 28));
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 12, 0, 0);
        getContentPane().add(Loginbtn, gridBagConstraints);

        signinbtn.setBackground(new java.awt.Color(234, 234, 234));
        signinbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signinbtn.setForeground(new java.awt.Color(0, 0, 255));
        signinbtn.setText("Sign up");
        signinbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinbtn.setMaximumSize(new java.awt.Dimension(54, 28));
        signinbtn.setMinimumSize(new java.awt.Dimension(54, 28));
        signinbtn.setPreferredSize(new java.awt.Dimension(54, 28));
        signinbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinbtnMouseClicked(evt);
            }
        });
        signinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 12, 0, 0);
        getContentPane().add(signinbtn, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_pkg/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -62;
        gridBagConstraints.ipady = -110;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        pwd1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pwd1.setForeground(new java.awt.Color(0, 0, 255));
        pwd1.setText("forgot password");
        pwd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pwd1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pwd1.setDoubleBuffered(true);
        pwd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pwd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwd1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        getContentPane().add(pwd1, gridBagConstraints);

        pwd2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pwd2.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 8, 0, 0);
        getContentPane().add(pwd2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwdloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdloginActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closebtnMouseClicked

    private void logininputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logininputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logininputActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        try {
            Con2 obj = new Con2();
            obj.login();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "Error in login form", ex);
        }
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void signinbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinbtnMouseClicked

        
    }//GEN-LAST:event_signinbtnMouseClicked

    private void signinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtnActionPerformed
        Signup obj = new Signup();
        this.setState(JFrame.ICONIFIED);    //for close old window
        obj.setVisible(true);
        obj.setTitle("Sign in");

    }//GEN-LAST:event_signinbtnActionPerformed

    private void pwd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwd1MouseClicked
       //System.exit(0);
        Forgot_Pwd obj= new Forgot_Pwd();
        this.setState(JFrame.ICONIFIED);    //for close old window
        obj.setVisible(true);
        obj.setTitle("Forgot Details");
        
    }//GEN-LAST:event_pwd1MouseClicked

    public static void main(String args[]) {
        
        Login obj=new Login();
        obj.setVisible(true);
        obj.setTitle("Login");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loginbtn;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel login_head1;
    public static javax.swing.JTextField logininput;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel pwd1;
    private javax.swing.JLabel pwd2;
    public static javax.swing.JPasswordField pwdlogin;
    private javax.swing.JButton signinbtn;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
