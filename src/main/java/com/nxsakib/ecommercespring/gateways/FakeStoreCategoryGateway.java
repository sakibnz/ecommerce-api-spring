package com.nxsakib.ecommercespring.gateways;

import com.nxsakib.ecommercespring.dtos.CategoryDTO;
import com.nxsakib.ecommercespring.dtos.FakeStoreCategoryResponseDTO;
import com.nxsakib.ecommercespring.gateways.api.IFakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {
    private final IFakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(IFakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO response = fakeStoreCategoryApi.getAllCategories().execute().body();
        if(response == null) {
            throw new IOException("Failed to fetch categories from Fake Store API");
        }
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build()).toList();
    }
}
