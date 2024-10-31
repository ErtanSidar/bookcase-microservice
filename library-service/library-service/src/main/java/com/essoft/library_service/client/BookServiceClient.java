package com.essoft.library_service.client;

import com.essoft.library_service.dto.BookDto;
import com.essoft.library_service.dto.BookIdDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "book-service", path = "/v1/book")
public interface BookServiceClient {

    @GetMapping("/isbn/{isbn}")
    public ResponseEntity<BookIdDto> getBookByIsbn(@PathVariable String isbn);

    @GetMapping("/book/{bookId}")
    public ResponseEntity<BookDto> getBookById(@PathVariable String bookId);
}
