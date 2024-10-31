package com.essoft.book_service.dto;

public class BookIdDto {
    private final String id;
    private final String isbn;

    public BookIdDto(String id, String isbn) {
        this.id = id != null ? id : "";
        this.isbn = isbn;
    }

    public static BookIdDto convert(String id, String isbn) {
        return new BookIdDto(id, isbn);
    }

    public String getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }
}

