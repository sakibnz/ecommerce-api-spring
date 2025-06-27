package com.nxsakib.ecommercespring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @GetMapping("/category")
    public String getCategory() {
        return "Electronics";
    }
    @PostMapping("/category")
    public String postCategory() {
        return "Category created successfully";
    }
    @GetMapping("/count")
    public int getCategoryCount() {
        return 10;
    }
 }
