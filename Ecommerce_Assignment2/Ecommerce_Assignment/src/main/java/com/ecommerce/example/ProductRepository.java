package com.ecommerce.example;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.example.Product;

@SuppressWarnings("unused")
public interface ProductRepository extends JpaRepository<Product, Long> {
}