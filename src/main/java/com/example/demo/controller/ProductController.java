package com.example.demo.controller;

import com.example.demo.repository.entity.Product;
import com.example.demo.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImpl productService;

@Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseBody
    public List<Product> listCryptoCurrency() {
        return productService.getAllProduct();
    }

    @PostMapping
    public String Create(String str) {
        return str;
    }
}
