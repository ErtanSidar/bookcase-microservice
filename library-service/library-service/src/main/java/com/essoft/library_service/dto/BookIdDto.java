package com.essoft.library_service.dto;

public class BookIdDto {
    private final String bookId;
    private final String isbn;

    public BookIdDto(String bookId, String isbn) {
        this.bookId = bookId != null ? bookId : "";
        this.isbn = isbn != null ? isbn : "";
    }

    public BookIdDto() {
        this.bookId = "";
        this.isbn = "";
    }

    public static BookIdDto convert(String id, String isbn) {
        return new BookIdDto(id, isbn);
    }

    public String getBookId() {
        return bookId;
    }

    public String getIsbn() {
        return isbn;
    }
}

