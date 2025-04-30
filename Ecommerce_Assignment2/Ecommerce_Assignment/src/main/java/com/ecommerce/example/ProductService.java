package com.ecommerce.example;
import org.springframework.stereotype.Service;

import com.ecommerce.example.Product;
import com.ecommerce.example.ProductRepository;

import java.util.List;

@SuppressWarnings("unused")
@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}