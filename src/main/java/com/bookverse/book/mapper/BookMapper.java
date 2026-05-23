package com.bookverse.book.mapper;

import com.bookverse.book.dtos.BookRequestDto;
import com.bookverse.book.dtos.BookResponseDto;
import com.bookverse.book.model.Book;

import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public static BookResponseDto convertBookToBookDto(Book book) {
        BookResponseDto bookDto = new BookResponseDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setDescription(book.getDescription());
        bookDto.setPrice(book.getPrice());
        bookDto.setRating(book.getRating());
        bookDto.setCoverImage(book.getCoverImage());
        bookDto.setLanguage(book.getLanguage());
        return bookDto;
    }

    public static Book convertBookRequestDtoToBook(BookRequestDto bookRequestDto) {
        Book book = new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setAuthor(bookRequestDto.getAuthor());
        book.setDescription(bookRequestDto.getDescription());
        book.setPrice(bookRequestDto.getPrice());
        book.setCoverImage(bookRequestDto.getCoverImage());
        book.setLanguage(bookRequestDto.getLanguage());
        return book;

    }

    // convertToBookDetailsDto()

    // convertToBookEntity()

    // convertToBookRecommendationDto()
}
