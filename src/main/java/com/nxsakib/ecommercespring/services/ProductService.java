package com.nxsakib.ecommercespring.services;

import com.nxsakib.ecommercespring.dtos.ProductDTO;
import com.nxsakib.ecommercespring.entities.Category;
import com.nxsakib.ecommercespring.entities.Product;
import com.nxsakib.ecommercespring.mappers.ProductMapper;
import com.nxsakib.ecommercespring.repositories.CategoryRepository;
import com.nxsakib.ecommercespring.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class ProductService implements IProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public List<ProductDTO> getProductsByCategory(String category) throws IOException {
        return List.of();
    }

    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::ProductEntityToProductDto)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + id));
//        try {
//            Product product = productRepository.getReferenceById(id);
//            return ProductMapper.ProductEntityToProductDto(product);
//        } catch (EntityNotFoundException exception) {
//            throw new RuntimeException("Product not found with id: " + id, exception);
//        }
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Category category = categoryRepository.findById(productDTO.getCategoryId())
                .orElseThrow(() -> new EntityNotFoundException("Category not found with id: " + productDTO.getId()));
        Product product = productRepository.save(ProductMapper.ProductDtoToProductEntity(productDTO, category));
        return ProductMapper.ProductEntityToProductDto(product);
    }
}
