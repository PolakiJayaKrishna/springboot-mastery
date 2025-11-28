package com.example.productphaseone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.productphaseone.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}