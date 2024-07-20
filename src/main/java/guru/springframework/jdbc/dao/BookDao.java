package guru.springframework.jdbc.dao;


import guru.springframework.jdbc.domain.Book;

public interface BookDao {
    Book getById(Long id);

    Book findByISBN(String isbn);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
