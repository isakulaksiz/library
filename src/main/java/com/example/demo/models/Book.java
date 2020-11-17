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
	
	@Column(name="bookName")
	private String bookName;
	
	@Column(name="bookUnderName")
	private String bookUnderName;
	
	@Column(name="serialName")
	private String serialName;
	
	@Column(name="authorName")
	private String authorName;
	
	@Column(name="publisherName")
	private String publisherName;
	
	@Column(name="isbnNum")
	private int isbnNum;
	
	@Column(name="bookDetail")
	private String bookDetail;
	
	public Book() {
		
	}

	public Book(int id, String bookName, String bookUnderName, String serialName, String authorName,
			String publisherName, int isbnNum, String bookDetail) {
		super();
		this.id = id;
		this.bookName = bookName;
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

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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
		return "Book [id=" + id + ", bookName=" + bookName + ", bookUnderName=" + bookUnderName + ", serialName="
				+ serialName + ", authorName=" + authorName + ", publisherName=" + publisherName + ", isbnNum="
				+ isbnNum + ", bookDetail=" + bookDetail + "]";
	}
	
	
}
