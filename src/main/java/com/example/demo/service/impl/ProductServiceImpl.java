package com.example.demo.service.impl;

import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    private  final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        List<Product> products = productRepository.findAll();
        List<Product> productList = new ArrayList<>();
        products.forEach(productList::add);
        return productList;
    }

    @Override
    public Product createProduct(Product product) {
        Product createdProduct = productRepository.save(product);
        return createdProduct;
    }

    @Override
    public Product updateProduct(Product product) {
        Product createdProduct = productRepository.save(product);
        return createdProduct;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(String.valueOf(id));
    }

}
