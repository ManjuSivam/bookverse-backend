package com.bookverse.book.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorResponseDto {
    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;
}
