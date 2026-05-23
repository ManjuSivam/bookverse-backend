package com.bookverse.book.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponseDto {
    private Long id;
    private String title;
    private String author;
    private String description;
    private Double price;
    private Double rating;
    private String coverImage;
    private String language;
}
