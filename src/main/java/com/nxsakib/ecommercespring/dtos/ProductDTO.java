package com.nxsakib.ecommercespring.dtos;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private long id;
    private String title;
    private String image;
    private double price;
    private String color;
    private String description;
    private double discount;
    private String model;
    private String brand;
    private boolean popular;
    private long categoryId;
}
