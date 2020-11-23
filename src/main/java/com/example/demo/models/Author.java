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
	
	@OneToMany(mappedBy="book",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Book> book;
	
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
	
	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", authorname=" + authorname + ", authordesc=" + authordesc + "]";
	}
		
}
