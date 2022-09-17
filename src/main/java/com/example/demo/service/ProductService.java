package com.example.demo.service;

import com.example.demo.repository.entity.Product;

import java.util.List;

public interface ProductService {
    List <Product> getAllProduct();

    Product createProduct (Product bookDto);

    Product updateProduct (Product bookDto);

    void deleteProduct (Long id);
}
