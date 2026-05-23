package com.bookverse.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookverse.book.model.Category;

@Service
public interface CategoryService {
    public List<Category> getAllCategories();

    public Category getCategoryById(Long id);

    public Category addCategory(Category category);

    public Category updateCategory(Long id, Category category);

    public void deleteCategory(Long id);
}
