package com.nxsakib.ecommercespring.controllers;


import com.nxsakib.ecommercespring.dtos.CategoryDTO;
import com.nxsakib.ecommercespring.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
        return categoryService.getAllCategories();
    }

}

 /*
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
*/