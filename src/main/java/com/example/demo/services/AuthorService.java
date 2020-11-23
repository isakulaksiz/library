package com.example.demo.services;

import java.util.List;
import com.example.demo.models.Author;

public interface AuthorService {
	
	public List<Author> findAll();
	
	public Author findById(int theId);
	
	public void save(Author theAuthor);
	
	public void deleteById(int theId);

	public List<Author> listAll(String keyword);
}
