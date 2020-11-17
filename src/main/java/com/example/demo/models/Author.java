package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="authorName")
	private String authorName;
	
	@Column(name="descAuthor")
	private String descAuthor;
	
	public Author() {
		
	}
	
	public Author(int id, String authorName, String descAuthor) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.descAuthor = descAuthor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getdescAuthor() {
		return descAuthor;
	}

	public void setdescAuthor(String descAuthor) {
		this.descAuthor = descAuthor;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + ", descAuthor=" + descAuthor + "]";
	}
	
	
}
