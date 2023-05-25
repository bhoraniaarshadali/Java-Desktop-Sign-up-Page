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

    private static final Pattern GMAIL_ADDRESS_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@gmail.com$");

    public Con2() {
        con = null;
        ps = null;
    }

    public void getCon() throws ClassNotFoundException, SQLException {
        // 1. Load Drivers
        Class.forName("com.mysql.jdbc.Driver");

        // 2. Make connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "");
    }

    // Sign in method
    public void signin() throws ClassNotFoundException, SQLException {
        getCon();

        String name = Signin.namesigin.getText();
        String number = Signin.numsigin.getText();
        String email = Signin.emailsigin.getText();
        String pwd = Signin.pwdsignin.getText();
        
        if (isPhoneNumberAlreadyRegistered(number)) {
            showErrorDialog("Phone number already registered!");
        } else if (isEmailAlreadyRegistered(email)) {
            showErrorDialog("Email already registered!");
        } else if (name.isEmpty()) {
            showErrorDialog("Enter name!");
        } else if (number.isEmpty()) {
            showErrorDialog("Enter number!");
        } else if (!isValidMobileNumber(number)) {
            showErrorDialog("Mobile number should be 10 digits long!");
        } else if (email.isEmpty()) {
            showErrorDialog("Enter email!");
        } else if (!isValidGmailAddress(email)) {
            showErrorDialog("Invalid Email address!");
        } else if (pwd.isEmpty()) {
            showErrorDialog("Enter password!");
        } else if (!isValidPassword(pwd)) {
            showErrorDialog("Invalid password!");
        } else {
            double n = Double.parseDouble(number);
            String sql = "INSERT INTO registration_details (name, number, email, password) VALUES (?, ?, ?, ?)";
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
                JOptionPane.showMessageDialog(null, "Sign in Failed. Please try again.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean isEmailAlreadyRegistered(String email) throws SQLException {
        String sql = "SELECT * FROM registration_details WHERE Email=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    private boolean isPhoneNumberAlreadyRegistered(String number) throws SQLException {
        String sql = "SELECT * FROM registration_details WHERE number=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, number);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    private boolean isValidMobileNumber(String number) {
        return number.length() == 10 && number.matches("\\d+");
    }

    private boolean isValidGmailAddress(String email) {
        return GMAIL_ADDRESS_PATTERN.matcher(email).matches();
    }

    private boolean isValidPassword(String password) {
        boolean hasLowerCase = password.matches(".*[a-z].*");
        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSymbol = password.matches(".*[@#$!%^&*()].*");

        return hasLowerCase && hasUpperCase && hasDigit && hasSymbol && password.length() >= 8;
    }

    private void showErrorDialog(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Login method
    void login() throws ClassNotFoundException {
        try {
            getCon();
        } catch (SQLException ex) {
            ex.printStackTrace();
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
                    ResultSet rs = ps.executeQuery();

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
                    ex.printStackTrace();
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
        obj.signin();
    }
}
