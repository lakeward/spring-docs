package com.github.paulcwarren.springdocs.repositories.jpa;

import com.github.paulcwarren.springdocs.domain.Document;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@Profile({"in-memory","msql","postgress","sqlserver"})
@CrossOrigin(origins = "http://localhost:8080")
public interface JpaDocumentRepository extends JpaRepository<Document, String> {
	
	List<Document> findByTitle(@Param("title") String title);
	
}
