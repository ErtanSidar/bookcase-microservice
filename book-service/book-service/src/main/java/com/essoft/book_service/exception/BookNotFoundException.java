package com.essoft.book_service.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String s) {
        super(s);
    }
}
