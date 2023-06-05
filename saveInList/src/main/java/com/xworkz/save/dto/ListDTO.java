package com.xworkz.save.dto;

import java.io.Serializable;
import java.util.Objects;
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
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class ListDTO implements Serializable, Comparable<ListDTO> {

	public ListDTO() {
		System.out.println("ListDTO no-arg const");
	}

	public ListDTO(String fullName, String email, String country, long contactNo, String type, String description) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.country = country;
		this.contactNo = contactNo;
		this.type = type;
		this.description = description;
	}

	private String fullName;
	private String email;
	private String country;
	private long contactNo;
	private String type;
	private String description;

	@Override
	public int compareTo(ListDTO o) {
		return this.getFullName().compareTo(o.getFullName());
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
			message.setText("Your mail " + this.getEmail() + " " + "has been registered");

			Transport.send(message);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ListDTO [fullName=" + fullName + ", email=" + email + ", country=" + country + ", contactNo="
				+ contactNo + ", type=" + type + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactNo, country, description, email, fullName, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ListDTO)) {
			return false;
		}
		ListDTO other = (ListDTO) obj;
		return contactNo == other.contactNo && Objects.equals(country, other.country)
				&& Objects.equals(description, other.description) && Objects.equals(email, other.email)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(type, other.type);
	}

}
