package com.essoft.library_service.dto;

public class BookDto {
    private final BookIdDto id;
    private final String title;
    private final Integer year;
    private final String author;
    private final String pressName;

    public BookDto(BookIdDto id, String title, Integer year, String author, String pressName) {
        this.id = id;
        this.title = title != null ? title : "";
        this.year = year != null ? year : 0;
        this.author = author != null ? author : "";
        this.pressName = pressName != null ? pressName : "";
    }

    public BookDto() {
        this.id = null;
        this.title = "";
        this.year = 0;
        this.author = "";
        this.pressName = "";
    }

    public BookIdDto getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getPressName() {
        return pressName;
    }
}
