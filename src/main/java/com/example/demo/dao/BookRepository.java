package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	public List<Book> findAll();
}
