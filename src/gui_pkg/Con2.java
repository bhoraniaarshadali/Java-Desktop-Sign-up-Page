package gui_pkg;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Con2 {
    String name;
    String number;
    String email;
    String pwd;
    String loginemail;
    String loginpwd;

    public static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    private Component rootPane;

    public Con2() {
    }

    void getCon() throws ClassNotFoundException, SQLException {
        // 1. Load Drivers
        Class.forName("com.mysql.jdbc.Driver");

        // 2. Make connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "");
    }

    @SuppressWarnings("deprecation")
    void signin() throws ClassNotFoundException, SQLException {
        getCon();
        name = Signin.namesigin.getText();
        number = Signin.numsigin.getText();
        email = Signin.emailsigin.getText();
        pwd = Signin.pwdsignin.getText();

            String sql = "SELECT * FROM registration_details WHERE Email=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, email);
                rs = ps.executeQuery();

            if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Email already registered!", "Error",
                                JOptionPane.HEIGHT);        
            } else if (name.isEmpty()) {
             JOptionPane.showMessageDialog(null, "Enter name!");
            } else if (number.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter number!");
            } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter email!");
            } else if (pwd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter password!");
            } else {
            double n = Double.parseDouble(number);
            sql = "INSERT INTO registration_details (name, number, email, password) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, n);
            ps.setString(3, email);
            ps.setString(4, pwd);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(rootPane, "Sign in Successful!");
                Welcome_Page obj = new Welcome_Page();
                obj.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sign in Failed. Please try again.");
            }
        }
    }

    @SuppressWarnings("deprecation")
    void login() throws ClassNotFoundException {
        try {
            getCon();
        } catch (SQLException ex) {
            Logger.getLogger(Con2.class.getName()).log(Level.SEVERE, null, ex);
        }
        loginemail = Login.logininput.getText();
        loginpwd = Login.pwdlogin.getText();

        if (loginemail.isEmpty() && loginpwd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email and Password should not be empty!");
        } else if (loginemail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter email!");
        } else if (loginpwd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter password!");
        } else {
            try {
                String sql = "SELECT * FROM registration_details WHERE Email=? AND Password=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, loginemail);
                ps.setString(2, loginpwd);
                rs = ps.executeQuery();

                if (rs.next()) {
                    Welcome_Page obj = new Welcome_Page();
                    obj.setTitle("Welcome Page");
                    obj.setVisible(true);
                    System.out.println("email: " + loginemail + "\n" + "password: " + loginpwd);
                } else {
                    JOptionPane.showMessageDialog(null, "Email or Password not found.", "Error", JOptionPane.HEIGHT);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Con2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        Con2 obj = new Con2();
        obj.getCon();
        obj.signin();
        //obj.forgot_pwd();
    }  
}