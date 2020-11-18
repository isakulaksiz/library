package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.BookRepository;
import com.example.demo.models.Book;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository theBookRepository) {
		bookRepository = theBookRepository;
	}
	
	@Override
	public List<Book> findAll() {
		//TODO
		return null;
	}

	@Override
	public Book findById(int theId) {
		Optional<Book> result = bookRepository.findById(theId);
		
		Book theBook = null;
		
		if(result.isPresent()) {
			theBook = result.get();
		}
		else {
			throw new RuntimeException("Did not find book id - "+theId);

		}
		
		return theBook;
	}

	@Override
	public void save(Book theBook) {
		bookRepository.save(theBook);

	}

	@Override
	public void deleteById(int theId) {
		bookRepository.deleteById(theId);

	}

}
