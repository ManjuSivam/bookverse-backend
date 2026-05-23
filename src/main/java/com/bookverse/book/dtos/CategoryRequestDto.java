package com.bookverse.book.dtos;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryRequestDto {
    @NotBlank(message = "Name is required")
    private String name;
    private String description;
}
