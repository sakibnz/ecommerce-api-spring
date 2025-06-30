package com.nxsakib.ecommercespring.gateways;

import com.nxsakib.ecommercespring.dtos.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<CategoryDTO> getAllCategories() throws IOException;
}
