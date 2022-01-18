package com.example.demo.demo.repository;

import com.example.demo.demo.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ProductRepository extends JpaRepository<Product, Integer>{
   
}