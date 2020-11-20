package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AuthorRepository;
import com.example.demo.models.Author;

@Service
public class AuthorServiceImpl implements AuthorService {

	private AuthorRepository authorRepository;
	
	@Autowired
	public AuthorServiceImpl(AuthorRepository theAuthorRepository) {
		authorRepository =  theAuthorRepository;
	}
	
	@Override
	public List<Author> findAll() {
		return authorRepository.findAllByOrderByAuthornameAsc();
	}

	@Override
	public Author findById(int theId) {
		Optional<Author> result = authorRepository.findById(theId);

		Author theAuthor = null;
		
		if(result.isPresent()) {
			theAuthor = result.get();
		}
		else {
			throw new RuntimeException("Did not find author id - "+theId);
		}
		
		return theAuthor;
	}

	@Override
	public void save(Author theAuthor) {
		authorRepository.save(theAuthor);

	}

	@Override
	public void deleteById(int theId) {
		authorRepository.deleteById(theId);
		
	}

}
