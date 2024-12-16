package com.example.api_exemplo.services;

import com.example.api_exemplo.feing.BookCliente;
import com.example.api_exemplo.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookCliente bookCliente;

    public BookService(BookCliente bookCliente) {
        this.bookCliente = bookCliente;
    }

    public List<Book> getBooksFromLibrary() {
        return this.bookCliente.getBooks();
    }
}