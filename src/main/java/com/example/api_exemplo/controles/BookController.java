package com.example.api_exemplo.controles;

import com.example.api_exemplo.domain.Book;
import com.example.api_exemplo.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books") // Define o endpoint base para as requisições
public class BookController {

    private final BookService service; // Referência ao serviço

    // Construtor com injeção de dependência
    public BookController(BookService service) {
        this.service = service; // Atribui o serviço corretamente
    }

    @GetMapping
    public List<Book> getBooks() {
        // Retorna a lista de livros obtida do serviço
        return this.service.getBooksFromLibrary();
    }
}
