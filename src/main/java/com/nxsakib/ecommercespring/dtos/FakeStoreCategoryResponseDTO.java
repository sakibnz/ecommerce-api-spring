package com.nxsakib.ecommercespring.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreCategoryResponseDTO {
    private String status;
    private String message;
    private List<String> categories;
}
