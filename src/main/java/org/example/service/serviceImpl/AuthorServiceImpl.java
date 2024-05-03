package org.example.service.serviceImpl;

import org.example.dao.AuthorDao;
import org.example.dao.daoImpl.AuthorDaoImpl;
import org.example.model.Author;
import org.example.service.AuthorService;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {
    AuthorDao authorDao = new AuthorDaoImpl();

    @Override
    public void createTableAuthor() {
        authorDao.createTableAuthor();
    }

    @Override
    public String saveAuthor(Author author) {
        return authorDao.saveAuthor(author);
    }

    @Override
    public Author findById(Long authorId) {
        return authorDao.findById(authorId);
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorDao.findAllAuthors();
    }

    @Override
    public String updateAuthor(Long authorId, Author newAuthor) {
        return authorDao.updateAuthor(authorId, newAuthor);
    }

    @Override
    public void deleteAuthor(Long authorId) {
        authorDao.deleteAuthor(authorId);
    }

    @Override
    public void dropAuthorTable() {
        authorDao.dropAuthorTable();
    }

    @Override
    public void cleanAuthorTable() {
        authorDao.cleanAuthorTable();
    }

    @Override
    public List<Author> sortByDateOfBirth() {
        return authorDao.sortByDateOfBirth();
    }
}
