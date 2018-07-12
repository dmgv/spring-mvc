package com.javaee.diegophilipeklenner.services;

import java.util.Set;

import com.javaee.diegophilipeklenner.domain.Book;

public interface BookService {

	Set<Book> getBooks();

    Book findById(Long id);

    Book saveBook(Book book);

    void deleteById(Long idToDelete);
}
