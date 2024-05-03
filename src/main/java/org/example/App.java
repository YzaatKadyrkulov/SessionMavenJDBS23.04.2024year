package org.example;

import org.example.model.Author;
import org.example.model.Book;
import org.example.service.AuthorService;
import org.example.service.BookService;
import org.example.service.serviceImpl.AuthorServiceImpl;
import org.example.service.serviceImpl.BookServiceImpl;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        AuthorService authorService = new AuthorServiceImpl();
//        System.out.println("Created table");
//        authorService.createTableAuthor();

//        System.out.println("Saved author: ");
//        authorService.saveAuthor(new Author("Nurmuhammed", "Akimbekov", "nurmuhammed@gmail.com", "KG", LocalDate.of(1998, 10, 5)));

//        System.out.println("Find By Id");
//        System.out.println(authorService.findById(1L));
//
//        System.out.println("Find all authors: ");
//        System.out.println(authorService.findAllAuthors());
//
//        System.out.println("Deleted author by id: ");
//        authorService.deleteAuthor(3L);
//
//        System.out.println("Sorted authors by date of birth: ");
//        System.out.println(authorService.sortByDateOfBirth());

        BookService bookService = new BookServiceImpl();
        System.out.println("Created table book");
        bookService.createTableBook();

    }
}

