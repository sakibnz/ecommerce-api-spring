package com.nxsakib.ecommercespring.services;

import com.nxsakib.ecommercespring.dtos.ProductDTO;
import com.nxsakib.ecommercespring.gateways.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService {
    private final IProductGateway productsByCategoryGateway;

    public FakeStoreProductService(IProductGateway productsByCategoryGateway) {
        this.productsByCategoryGateway = productsByCategoryGateway;
    }

    @Override
    public List<ProductDTO> getProductsByCategory(String category) throws IOException {
        return productsByCategoryGateway.getProductsByCategory(category);
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return null;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return null;
    }
}
