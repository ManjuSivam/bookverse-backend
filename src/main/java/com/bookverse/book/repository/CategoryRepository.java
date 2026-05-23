package com.bookverse.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookverse.book.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    boolean existsByName(String name);
}
