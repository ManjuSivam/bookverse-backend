package com.bookverse.book.dtos;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDetailsResponseDto {

    private Long id;

    private String title;

    private String author;

    private String description;

    private Double price;

    private String coverImage;

    private String language;

    private Integer numberOfPages;

    private Integer quantityAvailable;

    private Double rating;

    private String review;

    private LocalDate publicationDate;

    private String categoryName;

}