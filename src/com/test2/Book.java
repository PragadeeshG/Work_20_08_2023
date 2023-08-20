package com.test2;

public class Book extends Documents {
	private String bookName;
	private String author;
	private String date;
	private double price;

	public Book() {

	}

	public Book(String bookName, String author, String date, double price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.date = date;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
