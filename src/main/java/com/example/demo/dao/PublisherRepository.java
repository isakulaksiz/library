package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
	public List<Publisher> findAll();
}
