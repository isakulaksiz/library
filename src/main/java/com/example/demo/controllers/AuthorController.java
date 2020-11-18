package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Author;
import com.example.demo.services.AuthorService;

@Controller
@RequestMapping("/authors")	
public class AuthorController {
	
	private AuthorService authorService;
	
	@Autowired
	public AuthorController(AuthorService theAuthorService) {
		authorService = theAuthorService;
	}
	
	@GetMapping("/list")
	public String listAuthors(Model theModel) {
		
		List<Author> theAuthor = authorService.findAll();
		
		theModel.addAttribute("authors",theAuthor);
		
		return "authors/list-authors";
	}
	
}