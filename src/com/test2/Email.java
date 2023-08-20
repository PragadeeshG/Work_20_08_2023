package com.test2;

public class Email extends Documents {
	private int emailId;
	private String subject;
	private String from;
	private String to;

	public Email() {

	}

	public Email(int emailId, String subject, String from, String to) {
		super();
		this.emailId = emailId;
		this.subject = subject;
		this.from = from;
		this.to = to;
	}

	public int getEmailId() {
		return emailId;
	}

	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
