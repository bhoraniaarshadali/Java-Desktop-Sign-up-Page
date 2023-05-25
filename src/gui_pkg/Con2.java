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
        JOptionPane.showMessageDialog(null, "Email already registered!", "Error", JOptionPane.HEIGHT);
    } else if (name.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter name!");
    } else if (number.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter number!");
    } else if (email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter email!");
    } else if (!isValidGmailAddress(email)) {
        JOptionPane.showMessageDialog(null, "Invalid Email address!", "Error", JOptionPane.WARNING_MESSAGE);
    } else if (pwd.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter password!");
    } else {
        boolean hasLowerCase = pwd.matches(".*[a-z].*");
        boolean hasUpperCase = pwd.matches(".*[A-Z].*");
        boolean hasDigit = pwd.matches(".*\\d.*");
        boolean hasSymbol = pwd.matches(".*[@#$!%^&*()].*");

        StringBuilder errorMessage = new StringBuilder("Invalid Password:");

        if (!hasLowerCase) {
            errorMessage.append("\n- Password must contain at least one lowercase letter.");
        }

        if (!hasUpperCase) {
            errorMessage.append("\n- Password must contain at least one uppercase letter.");
        }

        if (!hasDigit) {
            errorMessage.append("\n- Password must contain at least one digit.");
        }

        if (!hasSymbol) {
            errorMessage.append("\n- Password must contain at least one symbol character.");
        }

        if (pwd.length() < 8) {
            errorMessage.append("\n- Password should be at least 8 characters long.");
        }

        if (errorMessage.length() > "Invalid Password:".length()) {
            JOptionPane.showMessageDialog(null, errorMessage.toString(), "Invalid Password", JOptionPane.WARNING_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Sign in Successful!");
                Welcome_Page obj = new Welcome_Page();
                obj.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Sign in Failed. Please try again.");
            }
        }
    }
}

private boolean isValidGmailAddress(String email) {
    // Gmail address validation logic
    String regex = "^[A-Za-z0-9+_.-]+@gmail.com$";
    return email.matches(regex);
}

    @SuppressWarnings("deprecation")
    void login() throws ClassNotFoundException {
    try {
        getCon();
    } catch (SQLException ex) {
        Logger.getLogger(Con2.class.getName()).log(Level.SEVERE, null, ex);
    }
    String loginInput = Login.logininput.getText();
    loginpwd = Login.pwdlogin.getText();

    if (loginInput.isEmpty() && loginpwd.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Email/Password should not be empty!");
    } else if (loginInput.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter email or password!");
    } else if (loginpwd.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter password!");
    } else {
        try {
            String sql = "SELECT * FROM registration_details WHERE Email=? OR Password=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, loginInput);
            ps.setString(2, loginpwd);
            rs = ps.executeQuery();

            if (rs.next()) {
                Welcome_Page obj = new Welcome_Page();
                obj.setTitle("Welcome Page");
                obj.setVisible(true);
                System.out.println("email/password: " + loginInput + "\n" + "password: " + loginpwd);
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