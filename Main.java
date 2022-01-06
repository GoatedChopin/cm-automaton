package com.colbymeline;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws GeneralSecurityException, IOException, MessagingException {
        Application application = new Application();
        MailBuilder mailBuilder = new MailBuilder();
        AutomatonStringBuilder automatonStringBuilder = new AutomatonStringBuilder();
        
        
        // customize the following strings with the information of the person you're addressing.
        
        String emailAddress; // the email address of the person you're addressing
        String name; // the name of the person you're addressing
        String message; // the body of the email
        String subject; // the subject of the email
        
        // the following three lines email the person described in the above 4 strings from the user's email address (if authorized to use the app by google cloud)
        String customizedMessage = automatonStringBuilder.customizeMessage(message, name);
        MimeMessage mimeMessage = mailBuilder.createEmail(emailAddress, "me", subject, customizedMessage);
        mailBuilder.sendMessage(application.service, "me", mimeMessage);

    }
}
