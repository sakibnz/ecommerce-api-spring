package com.nxsakib.ecommercespring.gateways;

import com.nxsakib.ecommercespring.dtos.FakeStoreProductsByCategoryResponseDTO;
import com.nxsakib.ecommercespring.dtos.ProductDTO;
import com.nxsakib.ecommercespring.gateways.api.IFakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway {
    private final IFakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(IFakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public List<ProductDTO> getProductsByCategory(String category) throws IOException {
        FakeStoreProductsByCategoryResponseDTO response = fakeStoreProductApi.getProductsByCategory(category).execute().body();
        if(response == null) {
            throw new IOException("Failed to fetch products by category from Fake Store API");
        }
        return response.getProducts();
    }
}

