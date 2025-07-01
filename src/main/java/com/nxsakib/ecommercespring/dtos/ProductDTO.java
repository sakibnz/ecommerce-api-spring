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
    private String id;
    private String title;
    private String image;
    private String price;
}
