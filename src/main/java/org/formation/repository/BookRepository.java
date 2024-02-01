package org.formation.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.PathParam;
import org.formation.entity.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getBooks() {
        return Arrays.asList(new Book(1,"title 1"),new Book(2,"title 2"));
    }


    public int countAllBooks() {
        return Arrays.asList(new Book(1,"title 1"),new Book(2,"title 2")).size();
    }

    public Optional<Book> findById(@PathParam("id") int id) {
        return Arrays.asList(new Book(1,"title 1"),new Book(2,"title 2"))
                .stream()
                .filter(book -> book.id()==id)
                .findFirst();
    }
}
