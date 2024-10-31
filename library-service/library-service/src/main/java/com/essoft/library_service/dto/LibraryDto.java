package com.essoft.library_service.dto;

import java.util.ArrayList;
import java.util.List;

public class LibraryDto {
    private String id;
    private List<BookDto> userBookList;

    public LibraryDto(String id, List<BookDto> userBookList) {
        this.id = id != null ? id : "";
        this.userBookList = userBookList != null ? userBookList : new ArrayList<>();
    }

    public LibraryDto(String id) {
        this.id = id;
    }

    public LibraryDto() {
        this.id = "";
        this.userBookList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<BookDto> getUserBookList() {
        return userBookList;
    }
}

