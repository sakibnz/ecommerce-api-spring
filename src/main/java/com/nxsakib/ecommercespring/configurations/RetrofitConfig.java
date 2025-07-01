package com.nxsakib.ecommercespring.configurations;

import com.nxsakib.ecommercespring.gateways.api.IFakeStoreCategoryApi;
import com.nxsakib.ecommercespring.gateways.api.IFakeStoreProductApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {
    @Value("${FAKE_STORE_BASE_URL}")
    private String fakeStoreBaseUrl;

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(fakeStoreBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public IFakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(IFakeStoreCategoryApi.class);
    }

    @Bean
    public IFakeStoreProductApi fakeStoreProductApi(Retrofit retrofit) {
        return retrofit.create(IFakeStoreProductApi.class);
    }
}
