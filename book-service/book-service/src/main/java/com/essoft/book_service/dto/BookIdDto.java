package com.essoft.book_service.dto;

public class BookIdDto {
    private final String bookId;
    private final String isbn;

    public BookIdDto(String id, String isbn) {
        this.bookId = id != null ? id : "";
        this.isbn = isbn;
    }

    public static BookIdDto convert(String id, String isbn) {
        return new BookIdDto(id, isbn);
    }

    public String getId() {
        return bookId;
    }

    public String getIsbn() {
        return isbn;
    }
}

