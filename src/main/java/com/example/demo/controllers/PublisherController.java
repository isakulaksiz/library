package com.example.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Publisher;
import com.example.demo.services.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {

	PublisherService publisherService;
	
	public PublisherController(PublisherService thePublisherService) {
		publisherService = thePublisherService;
	}
	
	@GetMapping("/list")
	public String listPublishers(Model theModel) {
		
		List<Publisher> thePublisherService = publisherService.findAll();
		
		theModel.addAttribute("publishers", thePublisherService);
		
		return "publishers/list-publishers";
	}
}
