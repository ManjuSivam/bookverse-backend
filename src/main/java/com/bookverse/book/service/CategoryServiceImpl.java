package com.bookverse.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookverse.book.model.Category;
import com.bookverse.book.repository.CategoryRepository;
import com.bookverse.common.exception.CategoryAlreadyExistsException;
import com.bookverse.common.exception.CategoryNotFoundException;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    @Override
    public List<Category> getAllCategories() {
        return this.categoryRepo.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        if (!this.categoryRepo.existsById(id)) {
            throw new CategoryNotFoundException("Category not found with id: " + id);
        }
        return this.categoryRepo.findById(id).get();
    }

    @Override
    public Category addCategory(Category category) {

        if (this.categoryRepo.existsByName(category.getName())) {

            throw new CategoryAlreadyExistsException(
                    "Category already exists with name: "
                            + category.getName());
        }

        return this.categoryRepo.save(category);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        if (!this.categoryRepo.existsById(id)) {
            throw new CategoryNotFoundException("Category not found with id: " + id);
        }
        return this.categoryRepo.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        if (!this.categoryRepo.existsById(id)) {
            throw new CategoryNotFoundException("Category not found with id: " + id);
        }
        this.categoryRepo.deleteById(id);

    }

}
