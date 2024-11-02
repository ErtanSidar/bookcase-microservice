package com.essoft.library_service.service;

import com.essoft.library_service.client.BookServiceClient;
import com.essoft.library_service.dto.AddBookRequest;
import com.essoft.library_service.dto.LibraryDto;
import com.essoft.library_service.exception.LibraryNotFoundException;
import com.essoft.library_service.model.Library;
import com.essoft.library_service.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;
    private final BookServiceClient bookServiceClient;

    public LibraryService(LibraryRepository libraryRepository, BookServiceClient bookServiceClient) {
        this.libraryRepository = libraryRepository;
        this.bookServiceClient = bookServiceClient;
    }

    public LibraryDto getAllBooksInLibraryById(String id) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new LibraryNotFoundException("Library could not found by id : " + id));

        return new LibraryDto(library.getId(),
                library.getUserBook()
                        .stream()
                        .map(book -> bookServiceClient.getBookById(book).getBody())
                        .collect(Collectors.toList()));
    }

    public LibraryDto createLibrary() {
        Library library = libraryRepository.save(new Library());
        return new LibraryDto(library.getId());
    }


    public void addBookToLibrary(AddBookRequest addBookRequest) {
        String bookId = bookServiceClient.getBookByIsbn(addBookRequest.getIsbn()).getBody().getBookId();

        Library library = libraryRepository.findById(addBookRequest.getId())
                .orElseThrow(() -> new LibraryNotFoundException("Library could not found by id : " + addBookRequest.getId()));

        library.getUserBook().add(bookId);

        libraryRepository.save(library);
    }

    public List<String> getAllLibraries() {
        return libraryRepository.findAll().stream().map(Library::getId).collect(Collectors.toList());
    }
}
