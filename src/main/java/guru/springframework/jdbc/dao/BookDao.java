package guru.springframework.jdbc.dao;


import guru.springframework.jdbc.domain.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAll();

    Book getById(Long id);

    Book findByISBN(String isbn);

    Book findBookByTitle(String title);

    Book findBookByTitleCriteria(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
