package com.bookverse.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookverse.book.model.Book;
import com.bookverse.book.dtos.BookRequestDto;

@Service
public interface BookService {
    public List<Book> getAllBooks();

    public Book getBookById(Long id);

    public Book addBook(BookRequestDto bookRequestDto);

    public Book updateBook(Long id, Book book);

    public void deleteBook(Long id);

    public List<Book> searchBooks(String title, String author);

    public List<Book> sortBooks(String field, String direction);

}
