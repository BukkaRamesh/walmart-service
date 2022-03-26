/**
 * 
 */
package com.sample.model;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author manasvibhardwaj
 *
 */
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Mail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
  private String mailFrom; 
	private String mailTo; 
	private String mailCc; 
	private String mailBcc;
	private String mailSubject; 
	private String mailContent; 
	private String contentType;
	
	
	public Mail() {
		super();
        //contentType = "text/plain";
    }

	public String getMailFrom() {
		return mailFrom;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getMailCc() {
		return mailCc;
	}
	public void setMailCc(String mailCc) {
		this.mailCc = mailCc;
	}
	public String getMailBcc() {
		return mailBcc;
	}
	public void setMailBcc(String mailBcc) {
		this.mailBcc = mailBcc;
	}
	public String getMailSubject() {
		return mailSubject;
	}
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}
	public String getMailContent() {
		return mailContent;
	}
	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
