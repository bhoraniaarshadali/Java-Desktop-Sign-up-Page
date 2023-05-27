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
        setPreferredSize(new java.awt.Dimension(700, 500));

        pwdlogin.setBackground(new java.awt.Color(204, 204, 204));
        pwdlogin.setForeground(new java.awt.Color(0, 0, 255));
        pwdlogin.setBorder(null);
        pwdlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdloginActionPerformed(evt);
            }
        });

        login_head1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        login_head1.setForeground(new java.awt.Color(0, 0, 255));
        login_head1.setText("Sign in");

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

        username.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        username.setText("Email or Mobile Number");

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

        Loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Loginbtn.setForeground(new java.awt.Color(102, 102, 102));
        Loginbtn.setText("Sign in");
        Loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginbtn.setMaximumSize(new java.awt.Dimension(72, 27));
        Loginbtn.setMinimumSize(new java.awt.Dimension(72, 27));
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });

        signinbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signinbtn.setForeground(new java.awt.Color(102, 102, 102));
        signinbtn.setText("Sign up");
        signinbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinbtn.setMaximumSize(new java.awt.Dimension(72, 27));
        signinbtn.setMinimumSize(new java.awt.Dimension(72, 27));
        signinbtn.setPreferredSize(new java.awt.Dimension(72, 27));
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

        jLabel1.setText("jLabel1");

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

        pwd2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pwd2.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(420, 420, 420)
                        .addComponent(minimize)
                        .addGap(10, 10, 10)
                        .addComponent(closebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(image)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logininput, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwdlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(login_head1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize)
                    .addComponent(closebtn))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(login_head1)
                        .addGap(18, 18, 18)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(logininput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pwd2)
                        .addGap(6, 6, 6)
                        .addComponent(pwdlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(pwd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(108, 108, 108))
        );

        logininput.getAccessibleContext().setAccessibleName("");
        logininput.getAccessibleContext().setAccessibleDescription("");

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
