package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Book;

public interface BookService {
	public List<Book> findAll();
	
	public Book findById(int theId);
	
	public void save(Book theBook);
	
	public void deleteById(int theId);
}
