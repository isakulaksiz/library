package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="book_name")
	private String bookname;
	
	@Column(name="book_under_name")
	private String bookUnderName;
	
	@Column(name="serial_name")
	private String serialName;
	
	@Column(name="authorname")
	private String authorName;
	
	@Column(name="publisher_name")
	private String publisherName;
	
	@Column(name="isbn_num")
	private int isbnNum;
	
	@Column(name="book_detail")
	private String bookDetail;
	
	public Book() {
		
	}

	public Book(int id, String bookname, String bookUnderName, String serialName, String authorName,
			String publisherName, int isbnNum, String bookDetail) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.bookUnderName = bookUnderName;
		this.serialName = serialName;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.isbnNum = isbnNum;
		this.bookDetail = bookDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookUnderName() {
		return bookUnderName;
	}

	public void setBookUnderName(String bookUnderName) {
		this.bookUnderName = bookUnderName;
	}

	public String getSerialName() {
		return serialName;
	}

	public void setSerialName(String serialName) {
		this.serialName = serialName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public int getIsbnNum() {
		return isbnNum;
	}

	public void setIsbnNum(int isbnNum) {
		this.isbnNum = isbnNum;
	}

	public String getBookDetail() {
		return bookDetail;
	}

	public void setBookDetail(String bookDetail) {
		this.bookDetail = bookDetail;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", bookUnderName=" + bookUnderName + ", serialName="
				+ serialName + ", authorName=" + authorName + ", publisherName=" + publisherName + ", isbnNum="
				+ isbnNum + ", bookDetail=" + bookDetail + "]";
	}
	
}
