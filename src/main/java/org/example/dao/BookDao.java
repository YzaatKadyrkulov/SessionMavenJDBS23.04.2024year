package org.example.dao;

import org.example.model.Book;

import java.util.List;

public interface BookDao {
    void createTableBook();

    //CRUD
    String saveBook(Book book);

    //DOP methods
    List<Book> getAllBookByAuthorId(Long authorId);
    List<Book> sortedBookByPrice();
    void deleteBooksFromAuthor(Long authorId);


}
