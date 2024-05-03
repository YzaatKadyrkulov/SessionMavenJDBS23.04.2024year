package org.example.dao.daoImpl;

import org.example.config.JdbcConfig;
import org.example.dao.BookDao;
import org.example.model.Book;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class BookDaoImpl implements BookDao {
    private final Connection connection = JdbcConfig.getConnection();
    @Override
    public void createTableBook() {
        String sql = """
                create table if not exists books(
                id serial primary key,
                name varchar(50),
                country varchar(50),
                published_year int,
                price int,
                author_id int references authors(id))""";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public String saveBook(Book book) {
        return null;
    }

    @Override
    public List<Book> getAllBookByAuthorId(Long authorId) {
        return null;
    }

    @Override
    public List<Book> sortedBookByPrice() {
        return null;
    }
}
