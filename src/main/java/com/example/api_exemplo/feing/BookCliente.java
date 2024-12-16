package com.example.api_exemplo.feing;

import com.example.api_exemplo.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "BookApi", url = "https://victorlpsrd.github.io/api_livros")
public interface BookCliente {

    @GetMapping("/books.json")
    List<Book> getBooks();
}
