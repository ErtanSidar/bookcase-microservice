package com.essoft.library_service.repository;

import com.essoft.library_service.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, String> {
}
