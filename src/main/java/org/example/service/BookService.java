package org.example.service;

import org.example.model.Book;

import java.util.List;

public interface BookService {
    void createTableBook();

    String saveBook(Book book);

    List<Book> getAllBookByAuthorId(Long authorId);

    List<Book> sortedBookByPrice();

    void deleteBooksFromAuthor(Long authorId);
}
