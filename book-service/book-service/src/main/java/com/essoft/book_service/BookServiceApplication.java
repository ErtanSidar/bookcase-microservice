package com.essoft.book_service;

import com.essoft.book_service.model.Book;
import com.essoft.book_service.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class BookServiceApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public BookServiceApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book("Title", 2024, "Author", "Press", "ISBN");
        Book book1 = new Book("Book 1", 2022, "Author 1","Press", "ISBN 1");
        Book book2 = new Book("book2", 2023, "Author 2", "Press", "ISBN 2");
        Book book3 = new Book("book3", 2024, "Author 3", "Press", "ISBN 3");

        List<Book> books = bookRepository.saveAll(Arrays.asList(book, book1, book2, book3));

        System.out.println(books);
    }
}
