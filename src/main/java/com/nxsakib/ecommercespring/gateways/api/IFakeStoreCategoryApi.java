package com.nxsakib.ecommercespring.gateways.api;

import com.nxsakib.ecommercespring.dtos.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IFakeStoreCategoryApi {
    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllCategories();
}
