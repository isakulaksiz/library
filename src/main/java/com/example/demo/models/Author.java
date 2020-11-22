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
	
	@Column(name="authorname")
	private String authorname;
	
	@Column(name="authordesc")
	private String authordesc;
	
	public Author() {
		
	}

	public Author(int id, String authorname, String authordesc) {
		super();
		this.id = id;
		this.authorname = authorname;
		this.authordesc = authordesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getAuthordesc() {
		return authordesc;
	}

	public void setAuthordesc(String authordesc) {
		this.authordesc = authordesc;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", authorname=" + authorname + ", authordesc=" + authordesc + "]";
	}
		
}
