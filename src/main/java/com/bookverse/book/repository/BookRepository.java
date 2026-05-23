package com.bookverse.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookverse.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
