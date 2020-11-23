package com.example.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="publisher")
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="publisherName")
	private String publisherName;
	
	@Column(name="descPublisher")
	private String descPublisher;
	
	@OneToMany(mappedBy="book",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Book> book;
	
	public Publisher() {
		
	}

	public Publisher(int id, String publisherName, String descPublisher) {
		super();
		this.id = id;
		this.publisherName = publisherName;
		this.descPublisher = descPublisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getDescPublisher() {
		return descPublisher;
	}

	public void setDescPublisher(String descPublisher) {
		this.descPublisher = descPublisher;
	}
	
	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + ", descPublisher=" + descPublisher + "]";
	}
	
	
}
