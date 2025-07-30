package com.nxsakib.ecommercespring.controllers;


import com.nxsakib.ecommercespring.dtos.CategoryDTO;
import com.nxsakib.ecommercespring.services.ICategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<CategoryDTO>> getAllCategories() throws IOException {
        List<CategoryDTO> result = categoryService.getAllCategories();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable Long id) {
        CategoryDTO categoryDTO = categoryService.getCategoryById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(categoryDTO);
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) {
        CategoryDTO categoryResponseDto = categoryService.createCategory(categoryDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(categoryResponseDto);
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