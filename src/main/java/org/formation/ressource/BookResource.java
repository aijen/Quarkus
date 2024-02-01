package org.formation.ressource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.formation.entity.Book;
import org.formation.repository.BookRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Path("/books")
public class BookResource {

    @Inject
   private BookRepository bookRepository;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {
        return bookRepository.countAllBooks();
    }

   /* @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Book> findById(@PathParam("id") int id) {
        return bookRepository.findById(id);
    }*/

}
