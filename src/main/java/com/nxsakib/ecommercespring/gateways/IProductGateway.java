package com.nxsakib.ecommercespring.gateways;

import com.nxsakib.ecommercespring.dtos.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductGateway {

    List<ProductDTO> getProductsByCategory(String category) throws IOException;
}
