package com.nxsakib.ecommercespring.controllers;

import com.nxsakib.ecommercespring.dtos.ProductDTO;
import com.nxsakib.ecommercespring.services.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
//@AllArgsConstructor
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<ProductDTO> getProductsByCategory(@RequestParam("category") String category) throws IOException {
        return productService.getProductsByCategory(category);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") Long id) {
        ProductDTO product = productService.getProductById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(product);
    }

    @PostMapping()
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO result = productService.createProduct(productDTO);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }
}


