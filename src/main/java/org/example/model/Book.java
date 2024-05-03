package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {
    private Long id;
    private String name;
    private String country;
    private int publishedYear;
    private int price;
    private Long authorId;

    public Book(Long id, String name, String country, int publishedYear, int price, Long authorId) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.publishedYear = publishedYear;
        this.price = price;
        this.authorId = authorId;
    }
}
