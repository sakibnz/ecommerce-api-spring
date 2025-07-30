package com.nxsakib.ecommercespring.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product extends BaseEntity {
    private String title;
    private String image;
    private double price;
    private String color;
    private String description;
    private double discount;
    private String model;
    private String brand;
    private boolean popular;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}


