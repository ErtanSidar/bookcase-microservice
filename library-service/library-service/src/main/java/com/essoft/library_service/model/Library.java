package com.essoft.library_service.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Library {

    @Id
    @Column(name = "library_id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private final String id;

    @ElementCollection
    private final List<String> userBook;

    public Library(String id, List<String> userBook) {
        this.id = id != null ? id : "";
        this.userBook = userBook != null ? userBook : new ArrayList<>();
    }

    public Library() {
        this.id = "";
        this.userBook = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<String> getUserBook() {
        return userBook;
    }
}

