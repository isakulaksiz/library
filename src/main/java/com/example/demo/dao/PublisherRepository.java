package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.models.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}
