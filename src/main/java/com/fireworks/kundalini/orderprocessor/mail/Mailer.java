package com.fireworks.kundalini.orderprocessor.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;

public class Mailer {

	public void send(CustomerOrder customerOrder) {
		// Get properties object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		// get Session
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("learnitwell2018@gmail.com", "gurukul2018");
			}
		});
		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("learnitwell2018@gmail.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(customerOrder.getCustomerMail()));
			message.setSubject(prepareSubject(customerOrder));
			message.setText(composeMessage(customerOrder));
			Transport.send(message);
			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}


	private String composeMessage(CustomerOrder customerOrder) {
		return "Mail Message";
	}

	private String prepareSubject(CustomerOrder customerOrder) {
		return "Subject";
	}
}
