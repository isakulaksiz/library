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
	
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(@RequestParam("bookId") int theId, Model theModel) {

		Book theBook = bookService.findById(theId);
		
		theModel.addAttribute("book", theBook);		
		
		return "books/book-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("bookId") int theId) {
		
		bookService.deleteById(theId);
		
		return "redirect:/books/list";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("book") Book theBook) {
		
		bookService.save(theBook);
		
		return "redirect:/books/list";
	}
}
