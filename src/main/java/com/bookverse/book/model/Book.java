package com.bookverse.book.model;

import java.time.LocalDate;

import com.bookverse.common.entity.BaseModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "books")
public class Book extends BaseModel {
    private String title;
    @Column(length = 2000)
    private String description;
    private String author;
    @Column(unique = true)
    private String isbn;
    private String genre;
    private LocalDate publicationDate;
    private String language;
    private Integer numberOfPages;
    private Double price;
    private Integer quantityAvailable;
    private Double rating;
    @Column(length = 2000)
    private String review;
    private String coverImage;

    @ManyToOne
    private Category category;

    /*
     * C : B = 1:M
     * 1 : M
     * 1 : 1
     * Id on 1 side to Many side
     */

}
