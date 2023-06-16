package com.xworkz.passport.dto;

import java.io.Serializable;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PassportDTO implements Serializable, Comparable<PassportDTO> {

	private String fName;
	private String lName;
	private String email;
	private long contactNo;

	@Override
	public int compareTo(PassportDTO o) {
		return this.getFName().compareTo(o.getFName());
	}

	public boolean sendEmail(String mail) {
		String host = "smtp.office365.com";
		final String user = "kathareakshata@outlook.com";
		final String password1 = "akshata@2001";
		String to = mail;

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
				return new PasswordAuthentication(user, password1);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Registration Confirmation mail");
			message.setText("Hi I am " + getFName() + " " + getLName());

			Transport.send(message);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
