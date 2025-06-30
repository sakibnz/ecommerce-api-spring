package com.nxsakib.ecommercespring.services;

import com.nxsakib.ecommercespring.dtos.CategoryDTO;
import com.nxsakib.ecommercespring.gateways.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{
    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return categoryGateway.getAllCategories();
    }
}
