package com.nxsakib.ecommercespring.gateways.api;

import com.nxsakib.ecommercespring.dtos.FakeStoreProductsByCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IFakeStoreProductApi {
    @GET("products/category")
    Call<FakeStoreProductsByCategoryResponseDTO> getProductsByCategory(@Query("type") String category);
}
