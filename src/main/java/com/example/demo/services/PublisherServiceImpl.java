package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.PublisherRepository;
import com.example.demo.models.Publisher;

public class PublisherServiceImpl implements PublisherService {

	private PublisherRepository publisherRepository;
	
	@Autowired
	public PublisherServiceImpl(PublisherRepository thePublisherRepository) {
		publisherRepository = thePublisherRepository;
	}
	
	@Override
	public List<Publisher> findAll() {
		//TODO
	}

	@Override
	public Publisher findById(int theId) {
		Optional<Publisher> result = publisherRepository.findById(theId);

		Publisher thePublisher = null;
		
		if(result.isPresent()) {
			thePublisher = result.get();
		}
		else {
			throw new RuntimeException("Did not find publisher id - "+theId);
		}
		
		return thePublisher;
	}

	@Override
	public void save(Publisher thePublisher) {
		publisherRepository.save(thePublisher);

	}

	@Override
	public void deleteById(int theId) {
		publisherRepository.deleteById(theId);

	}

}
