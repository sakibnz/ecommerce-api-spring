package com.nxsakib.ecommercespring.services;

import com.nxsakib.ecommercespring.dtos.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {

    List<ProductDTO> getProductsByCategory(String category) throws IOException;
    ProductDTO getProductById(Long id);
    ProductDTO createProduct(ProductDTO productDTO);
}
