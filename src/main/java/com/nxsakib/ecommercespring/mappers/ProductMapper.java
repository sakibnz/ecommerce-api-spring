package com.nxsakib.ecommercespring.mappers;

import com.nxsakib.ecommercespring.dtos.ProductDTO;
import com.nxsakib.ecommercespring.entities.Category;
import com.nxsakib.ecommercespring.entities.Product;

public class ProductMapper {
    public static ProductDTO ProductEntityToProductDto(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .image(product.getImage())
                .title(product.getTitle())
                .price(product.getPrice())
                .color(product.getColor())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .model(product.getModel())
                .brand(product.getBrand())
                .popular(product.isPopular())
                .categoryId(product.getCategory().getId())
                .build();
    }

    public static Product ProductDtoToProductEntity(ProductDTO productDTO, Category category) {
        return Product.builder()
                .title(productDTO.getTitle())
                .image(productDTO.getImage())
                .price(productDTO.getPrice())
                .color(productDTO.getColor())
                .description(productDTO.getDescription())
                .discount(productDTO.getDiscount())
                .model(productDTO.getModel())
                .brand(productDTO.getBrand())
                .popular(productDTO.isPopular())
                .category(category)
                .build();
    }
}
