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
	
	@GetMapping("/showFormAdd")
	public String showFormAdd(Model theModel) {
		
		Author theAuthor = new Author();
		
		theModel.addAttribute("author", theAuthor);
		
		return "authors/author-form";
	}
	
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(@RequestParam("authorId") int theId, Model theModel) {

		Author theAuthor = authorService.findById(theId);
		
		theModel.addAttribute("author", theAuthor);
		
		return "authors/author-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("authorId") int theId) {
		
		authorService.deleteById(theId);
		
		return "redirect:/authors/list";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("author") Author theAuthor) {
		
		authorService.save(theAuthor);
		
		return "redirect:/authors/list";
	}
}
