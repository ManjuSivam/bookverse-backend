package com.bookverse.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookverse.book.dtos.BookRequestDto;
import com.bookverse.book.mapper.BookMapper;
import com.bookverse.book.model.Book;
import com.bookverse.book.model.Category;
import com.bookverse.book.repository.BookRepository;
import com.bookverse.book.repository.CategoryRepository;
import com.bookverse.common.exception.BookAlreadyExistsException;
import com.bookverse.common.exception.BookNotFoundException;
import com.bookverse.common.exception.CategoryNotFoundException;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        if (this.bookRepo.existsById(id)) {
            return this.bookRepo.findById(id).get();
        }
        throw new BookNotFoundException("Book not found with id: " + id);

    }

    @Override
    public Book addBook(BookRequestDto bookRequestDto) {
        if (bookRequestDto.getCategoryId() == null) {
            throw new IllegalArgumentException("Category ID must not be null");
        }
        Category category = this.categoryRepo.findById(bookRequestDto.getCategoryId())
                .orElseThrow(() -> new CategoryNotFoundException(
                        "Category not found with id: " + bookRequestDto.getCategoryId()));

        Book book = BookMapper.convertBookRequestDtoToBook(bookRequestDto);
        book.setCategory(category);

        return this.bookRepo.save(book);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        if (this.bookRepo.existsById(id)) {
            return this.bookRepo.save(book);
        }
        throw new BookNotFoundException("Book not found with id: " + id);
    }

    @Override
    public void deleteBook(Long id) {
        if (this.bookRepo.existsById(id)) {
            this.bookRepo.deleteById(id);
            return;
        }
        throw new BookNotFoundException("Book not found with id: " + id);

    }

}
