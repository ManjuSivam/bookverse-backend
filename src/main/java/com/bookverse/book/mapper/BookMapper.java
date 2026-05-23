package com.bookverse.book.mapper;

import com.bookverse.book.dtos.BookDetailsResponseDto;
import com.bookverse.book.dtos.BookRequestDto;
import com.bookverse.book.dtos.BookSummaryResponseDto;
import com.bookverse.book.model.Book;

import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public static BookSummaryResponseDto convertBookToBookDto(Book book) {
        BookSummaryResponseDto bookDto = new BookSummaryResponseDto();
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

    public static BookDetailsResponseDto convertToBookDetailsResponseDto(Book book) {

        BookDetailsResponseDto dto = new BookDetailsResponseDto();

        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setDescription(book.getDescription());
        dto.setPrice(book.getPrice());
        dto.setCoverImage(book.getCoverImage());
        dto.setLanguage(book.getLanguage());

        dto.setNumberOfPages(
                book.getNumberOfPages());

        dto.setQuantityAvailable(
                book.getQuantityAvailable());

        dto.setRating(book.getRating());

        dto.setReview(book.getReview());

        dto.setPublicationDate(
                book.getPublicationDate());

        dto.setCategoryName(
                book.getCategory().getName());

        return dto;
    }

    // convertToBookDetailsDto()

    // convertToBookEntity()

    // convertToBookRecommendationDto()
}
