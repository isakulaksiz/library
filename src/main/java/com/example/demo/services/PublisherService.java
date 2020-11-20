package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Publisher;

public interface PublisherService {
	
	public List<Publisher> findAll();
	
	public Publisher findById(int theId);
	
	public void save(Publisher thePublisher);
	
	public void deleteById(int theId);
}
