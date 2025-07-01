package com.nxsakib.ecommercespring.dtos;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreProductsByCategoryResponseDTO {
    private String status;
    private String message;
    private List<ProductDTO> products;
}
