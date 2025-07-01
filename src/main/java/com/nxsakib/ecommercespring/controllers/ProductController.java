package com.nxsakib.ecommercespring.controllers;

import com.nxsakib.ecommercespring.dtos.ProductDTO;
import com.nxsakib.ecommercespring.services.IProductService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productsOfCategoryService;

    public ProductController(IProductService productsOfCategoryService) {
        this.productsOfCategoryService = productsOfCategoryService;
    }
    @GetMapping
    public List<ProductDTO> getProductsByCategory(@RequestParam("category") String category) throws IOException {
        return productsOfCategoryService.getProductsByCategory(category);
    }
}


