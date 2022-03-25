package com.sample.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.sample.mail.Mail;

@Service("emailService")
public class EmailServiceImpl implements EmailService {

	//It is the subinterface of MailSender. It supports MIME messages.
	//It is mostly used with MimeMessageHelper class for the creation of JavaMail MimeMessage, with attachment etc.
	@Autowired
	JavaMailSender mailSender;

	@Override
	public void sendEmail(Mail mail) {
		//Multipurpose Internet Mail Extensions (MIME) uses headers and separators that tell a user agent (UA) 
		//how to re-create the message.
		MimeMessage mimeMessage = mailSender.createMimeMessage();

		try {

			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

			mimeMessageHelper.setSubject(mail.getMailSubject());
			mimeMessageHelper.setFrom(new InternetAddress(mail.getMailFrom(), "JavaLearning.com"));
			mimeMessageHelper.setTo(mail.getMailTo());
			mimeMessageHelper.setText(mail.getMailContent());

			mailSender.send(mimeMessageHelper.getMimeMessage());

		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
