package com.xworkz.parkingRentalSystem.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ParkingEmail {

	public static boolean sendmail(String email, String name) {

		String host = "smtp.office365.com";
		final String user = "kathareakshata@outlook.com";
		final String password = "akshata@2001";
		String to = email;

		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug", "true");
		properties.put("mail.transport.protocol", "smtp");

		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Login message");
			message.setText("Hi " + name + ".Your admin login is successful");
		
			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}

		return true;
	}

}
