package com.bookverse.book.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookverse.book.dtos.CategoryRequestDto;
import com.bookverse.book.dtos.CategoryResponseDto;
import com.bookverse.book.mapper.CategoryMapper;
import com.bookverse.book.model.Category;
import com.bookverse.book.service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryResponseDto> getAllCategories() {
        List<CategoryResponseDto> categoryDtos = new ArrayList<>();
        List<Category> categories = this.categoryService.getAllCategories();
        for (Category category : categories) {
            categoryDtos.add(CategoryMapper.convertToCategoryResponseDto(category));
        }
        return categoryDtos;
    }

    @PostMapping
    public CategoryResponseDto addCategory(@Valid @RequestBody CategoryRequestDto categoryRequestDto) {
        return CategoryMapper
                .convertToCategoryResponseDto(
                        this.categoryService.addCategory(CategoryMapper.convertToCategoryEntity(categoryRequestDto)));
    }

}
