package com.essoft.library_service.dto;

public class BookDto {
    private final BookIdDto bookIdDto;
    private final String title;
    private final Integer year;
    private final String author;
    private final String pressName;

    public BookDto(BookIdDto bookIdDto, String title, Integer year, String author, String pressName) {
        this.bookIdDto = bookIdDto;
        this.title = title != null ? title : "";
        this.year = year != null ? year : 0;
        this.author = author != null ? author : "";
        this.pressName = pressName != null ? pressName : "";
    }

    public BookDto() {
        this.bookIdDto = null;
        this.title = "";
        this.year = 0;
        this.author = "";
        this.pressName = "";
    }


    public BookIdDto getId() {
        return bookIdDto;
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
