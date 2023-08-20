package com.test2;

public class Documents {
	private int docId;
	private String author;
	private String date;

	public Documents() {

	}

	public Documents(int docId, String author, String date) {
		super();
		this.docId = docId;
		this.author = author;
		this.date = date;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
