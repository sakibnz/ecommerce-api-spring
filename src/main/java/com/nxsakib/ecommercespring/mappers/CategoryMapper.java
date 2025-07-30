package com.nxsakib.ecommercespring.mappers;

import com.nxsakib.ecommercespring.dtos.CategoryDTO;
import com.nxsakib.ecommercespring.entities.Category;

public class CategoryMapper {
    public static CategoryDTO categoryEntityToCategoryDto(Category category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public static Category categoryDtoToCategoryEntity(CategoryDTO categoryDTO) {
        return Category.builder()
                .name(categoryDTO.getName())
                .build();
    }
}
