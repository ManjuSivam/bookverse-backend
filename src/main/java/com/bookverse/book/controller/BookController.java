package com.bookverse.book.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookverse.book.dtos.BookRequestDto;
import com.bookverse.book.dtos.BookResponseDto;
import com.bookverse.book.mapper.BookMapper;
import com.bookverse.book.model.Book;
import com.bookverse.book.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookResponseDto> getAllBooks() {
        List<BookResponseDto> bookDtos = new ArrayList<>();
        List<Book> books = this.bookService.getAllBooks();
        for (Book book : books) {
            bookDtos.add(BookMapper.convertBookToBookDto(book));
        }
        return bookDtos;
    }

    @GetMapping("/{id}")
    public BookResponseDto getBookById(@PathVariable Long id) {
        return BookMapper.convertBookToBookDto(this.bookService.getBookById(id));
    }

    @PostMapping
    public BookResponseDto addBook(@Valid @RequestBody BookRequestDto bookRequestDto) {
        return BookMapper.convertBookToBookDto(this.bookService.addBook(bookRequestDto));
    }

}
