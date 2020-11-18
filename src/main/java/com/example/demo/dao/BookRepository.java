package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
