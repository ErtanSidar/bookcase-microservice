package com.essoft.library_service.service;

import com.essoft.library_service.dto.LibraryDto;
import com.essoft.library_service.exception.LibraryNotFoundException;
import com.essoft.library_service.model.Library;
import com.essoft.library_service.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public LibraryDto getAllBooksInLibraryById(String id) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new LibraryNotFoundException("Library could not found by id : " + id));

        return new LibraryDto(library.getId());
    }

    public LibraryDto createLibrary() {
        Library library = libraryRepository.save(new Library());
        return new LibraryDto(library.getId());
    }

}
