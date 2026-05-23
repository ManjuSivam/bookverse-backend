package com.bookverse.book.model;

import com.bookverse.common.entity.BaseModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "categories")
public class Category extends BaseModel {
    @Column(unique = true, nullable = false)
    private String name;
    private String description;
}
