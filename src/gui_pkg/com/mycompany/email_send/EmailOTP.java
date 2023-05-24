package com.mycompany.email_send;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailOTP {

    String to;
    String from;
    String subject;
    String msg;
    public static int otp;

    void getOTP() {
        
        int randomPin = (int) ((Math.random() * 9000) + 1000);
        otp = randomPin;
        System.out.println("Your OTP is "+ otp);
    }

    void sendEmail() {
        //System.out.println("sendEmail RUN");
        to = "bhoraniyamustakali12@gmail.com";
        from = "bhoraniyaarshadali431@gmail.com";
        subject = "Forgot Password OTP";
        msg = "Forgot Password OTP: " + EmailOTP.otp;

        // SMTP server configuration
        String host = "smtp.gmail.com";
        String port = "587";
        String username = "bhoraniyaarshadali431@gmail.com";
        String password = "kdfiotljaunnhbbi";

        // Set properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);

        // Get the Session object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set From address
            message.setFrom(new InternetAddress(from));

            // Set To address
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set email subject
            message.setSubject(subject);

            // Set email content
            message.setText(msg);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully");
        } catch (MessagingException ex) {
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        EmailOTP obj = new EmailOTP();
        obj.getOTP();
        obj.sendEmail();
    }
}
