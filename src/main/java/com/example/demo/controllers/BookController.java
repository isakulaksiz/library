package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	public BookService bookService;
	
	@Autowired
	public BookController(BookService theBookService) {
		bookService = theBookService;
	}
	
	@GetMapping("/list")
	public String listBooks(Model theModel) {
		
		List<Book> theBook = bookService.findAll();
		
		theModel.addAttribute("books", theBook);
		
		return "books/list-books";
	}
	
	@GetMapping("/showFormAdd")
	public String showFormAdd(Model theModel) {
		
		Book theBook = new Book();
		
		theModel.addAttribute("book", theBook);
		
		return "books/book-form";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("book") Book theBook) {
		
		bookService.save(theBook);
		
		return "redirect:/books/list";
	}
}
