package gui_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Con2 {
     static Connection con;
     static PreparedStatement ps;
     static  ResultSet rs;
     String name;
     String number;
     String email;
     String pwd;
     
    private static final Pattern GMAIL_ADDRESS_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@gmail.com$");

    public Con2() {
        con = null;
        ps = null;
        rs = null;
    }

    public void getCon() throws ClassNotFoundException, SQLException {
        // 1. Load Drivers
        Class.forName("com.mysql.jdbc.Driver");

        // 2. Make connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "");
    }

    // Sign in method
void signup() throws ClassNotFoundException, SQLException {
    getCon();
    name = Signup.namesigin.getText();
    number = Signup.numsigin.getText();
    email = Signup.emailsigin.getText();
    pwd = Signup.pwdsignin.getText();

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
    } else if (!isNumeric(number)) {
        JOptionPane.showMessageDialog(null, "Mobile number should contain numeric digits only!", "Error", JOptionPane.WARNING_MESSAGE);
    } else if (number.length() != 10) {
        JOptionPane.showMessageDialog(null, "Mobile number should be 10 digits!", "Error", JOptionPane.WARNING_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Sign up Successful!");
                Welcome_Page obj = new Welcome_Page();
                obj.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Sign up Failed. Please try again.");
            }
        }
    }
}

private boolean isNumeric(String str) {
    return str.matches("\\d+");
}



    // Login method
    void login() throws ClassNotFoundException {
        try {
            getCon();
        } catch (SQLException ex) {
        }

        // get user input for email or mobile number
        String loginInput = Login.logininput.getText();
        String loginpwd = Login.pwdlogin.getText();

        // if mobile number or password is empty!
        if (loginInput.isEmpty() || loginpwd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email/Mobile number and Password should not be empty!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            boolean isEmail = loginInput.contains("@");
            boolean isNumeric = loginInput.matches("\\d+");

            if (isEmail || (isNumeric && loginInput.length() == 10)) {
                try {
                    // Query to check if email or mobile number exists in the database along with the correct password
                    String sql = "SELECT * FROM registration_details WHERE (Email=? OR Number=?) AND Password=?";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, loginInput);
                    ps.setString(2, loginInput);
                    ps.setString(3, loginpwd);
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        // Successful login
                        Welcome_Page obj = new Welcome_Page();
                        obj.setTitle("Welcome Page");
                        obj.setVisible(true);
                        System.out.println("Email/Number: " + loginInput + "\n" + "password: " + loginpwd);
                    } else {
                        // Incorrect email or mobile number
                        String errorMessage;
                        if (isEmail) {
                            errorMessage = "Email or Password is incorrect";
                        } else {
                            errorMessage = "Mobile number or Password is incorrect";
                        }
                        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Email/Mobile number format!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Con2 obj = new Con2();
        obj.getCon();
        obj.signup();
    }

    private boolean isValidGmailAddress(String email) {
    String regex = "^[A-Za-z0-9+_.-]+@gmail.com$";
    return email.matches(regex);
    }
}
