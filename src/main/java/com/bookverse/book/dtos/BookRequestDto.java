package com.bookverse.book.dtos;

import java.time.LocalDate;

import jakarta.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequestDto {

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;

    private String description;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive")
    private Double price;

    @NotBlank(message = "Cover Image is required")
    private String coverImage;

    private String language;

    @Positive(message = "Pages must be positive")
    private Integer numberOfPages;

    @PositiveOrZero(message = "Quantity cannot be negative")
    private Integer quantityAvailable;

    @DecimalMin(value = "0.0")
    @DecimalMax(value = "5.0")
    private Double rating;

    private String review;

    private LocalDate publicationDate;

    @NotNull(message = "Category Id is required")
    private Long categoryId;

}