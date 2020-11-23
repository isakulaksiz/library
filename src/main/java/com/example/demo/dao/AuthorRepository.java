package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	public List<Author> findAll();
	
	@Query(value="SELECT authorname from Author WHERE authorname LIKE '%?1%'")
	public List<Author> search(String keyword);
}
