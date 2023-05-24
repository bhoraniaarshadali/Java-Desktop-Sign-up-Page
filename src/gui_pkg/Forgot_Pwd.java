package gui_pkg;

import static gui_pkg.Con2.con;
import static gui_pkg.Con2.ps;
import static gui_pkg.Con2.rs;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Forgot_Pwd extends javax.swing.JFrame {
    static String email0;
    String number0;
    
    public Forgot_Pwd() {
        initComponents();
        //Connection
        try {
            Con2 obj1 = new Con2();
            obj1.getCon();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Forgot_Pwd.class.getName()).log(Level.SEVERE, "Connection Error", ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        forgot_text = new javax.swing.JLabel();
        pwd2 = new javax.swing.JLabel();
        pwd3 = new javax.swing.JLabel();
        forgot_number = new javax.swing.JTextField();
        forgot_email = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        pwd_otp = new javax.swing.JTextField();
        pwd4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setText("Note:- if credential is match then otp sent on your email address"); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setMaximumSize(new java.awt.Dimension(340, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(340, 20));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(340, 20));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        forgot_text.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        forgot_text.setForeground(new java.awt.Color(0, 0, 255));
        forgot_text.setText("Forgot Password");

        pwd2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pwd2.setText("Enter Email");

        pwd3.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pwd3.setText("Mobile Number");

        forgot_number.setBackground(new java.awt.Color(204, 204, 204));
        forgot_number.setForeground(new java.awt.Color(0, 0, 255));
        forgot_number.setBorder(null);
        forgot_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_numberActionPerformed(evt);
            }
        });

        forgot_email.setBackground(new java.awt.Color(204, 204, 204));
        forgot_email.setForeground(new java.awt.Color(0, 0, 255));
        forgot_email.setBorder(null);
        forgot_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_emailActionPerformed(evt);
            }
        });

        check.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        check.setForeground(new java.awt.Color(102, 102, 102));
        check.setText("Check");
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.setMaximumSize(new java.awt.Dimension(72, 27));
        check.setMinimumSize(new java.awt.Dimension(72, 27));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        pwd_otp.setBackground(new java.awt.Color(204, 204, 204));
        pwd_otp.setForeground(new java.awt.Color(0, 0, 255));
        pwd_otp.setBorder(null);
        pwd_otp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd_otpActionPerformed(evt);
            }
        });

        pwd4.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pwd4.setText("Enter OTP (coming soon)");

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Note:- if credential is match then otp sent"); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(340, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(340, 20));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(340, 20));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText(" on your email address."); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setMaximumSize(new java.awt.Dimension(340, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(340, 20));
        jLabel4.setName(""); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(340, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forgot_text, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forgot_number, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forgot_email, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd_otp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwd4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(forgot_text)
                .addGap(18, 18, 18)
                .addComponent(pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(forgot_email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwd3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgot_number, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pwd4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd_otp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel4});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forgot_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgot_numberActionPerformed

    private void forgot_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgot_emailActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        try {
            
            email0 =forgot_email.getText();
            number0 = forgot_number.getText();
            pwd_otp.getText();
           
            String sql=("select * from registration_details where Email=? and Number=?");
            ps=con.prepareStatement(sql);
            ps.setString(1, email0);
            ps.setString(2,number0);
            rs=ps.executeQuery();
            
            if(email0.equals("")){
                JOptionPane.showMessageDialog(rootPane, "enter email");
            }
            else if(number0.equals("")){
                JOptionPane.showMessageDialog(rootPane, "enter number");
            }
            else if(rs.next())
            {
                //success obj0= new success();
                //obj0.setTitle("Change Passoword");
                //obj0.setVisible(true);
                System.out.println("email: "+email0+"\n"+"password: "+number0);
                JOptionPane.showMessageDialog(rootPane, "Credential Match\n OTP sent on your Email");   
                
                Confirm_Pwd dialog = new Confirm_Pwd(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
            }
            else
            {
              JOptionPane.showMessageDialog(null, "Credential doesn't match ","Error", JOptionPane.HEIGHT);  
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Forgot_Pwd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkActionPerformed

    private void pwd_otpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd_otpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd_otpActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Forgot_Pwd().setVisible(true);
        });
        Forgot_Pwd obj=new Forgot_Pwd();
        obj.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    public static javax.swing.JTextField forgot_email;
    public static javax.swing.JTextField forgot_number;
    private javax.swing.JLabel forgot_text;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel pwd2;
    private javax.swing.JLabel pwd3;
    private javax.swing.JLabel pwd4;
    public static javax.swing.JTextField pwd_otp;
    // End of variables declaration//GEN-END:variables
}
