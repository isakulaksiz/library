package com.example.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Book;
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
	
	@GetMapping("/showFormAdd")
	public String showFormAdd(Model theModel) {
		
		Publisher thePublisher = new Publisher();
		
		theModel.addAttribute("publisher", thePublisher);
		
		return "publishers/publisher-form";
	}
	
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(@RequestParam("publisherId") int theId, Model theModel) {

		Publisher thePublisher = publisherService.findById(theId);
		
		theModel.addAttribute("publisher", thePublisher);		
		
		return "publishers/publisher-form";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("publisher") Publisher thePublisher) {
		
		publisherService.save(thePublisher);
		
		return "redirect:/publishers/list";
	}
}
