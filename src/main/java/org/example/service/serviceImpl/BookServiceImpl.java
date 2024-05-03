package org.example.service.serviceImpl;

import org.example.dao.BookDao;
import org.example.dao.daoImpl.BookDaoImpl;
import org.example.model.Book;
import org.example.service.BookService;

public class BookServiceImpl implements BookService {
    BookDao bookDao = new BookDaoImpl();
    @Override
    public void createTableBook() {
        bookDao.createTableBook();
    }

    @Override
    public String saveBook(Book book) {
        return null;
    }
}
