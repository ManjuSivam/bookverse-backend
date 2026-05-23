package com.bookverse.book.mapper;

import com.bookverse.book.dtos.CategoryRequestDto;
import com.bookverse.book.dtos.CategoryResponseDto;
import com.bookverse.book.model.Category;

public class CategoryMapper {

    public static Category convertToCategoryEntity(CategoryRequestDto categoryRequestDto) {
        Category category = new Category();
        category.setName(categoryRequestDto.getName());
        category.setDescription(categoryRequestDto.getDescription());
        return category;
    }

    public static CategoryResponseDto convertToCategoryResponseDto(Category category) {
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        categoryResponseDto.setId(category.getId());
        categoryResponseDto.setName(category.getName());
        categoryResponseDto.setDescription(category.getDescription());
        return categoryResponseDto;
    }
}
