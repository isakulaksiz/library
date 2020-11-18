package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
