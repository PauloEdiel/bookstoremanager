package dev.paulocavalcante.bookstoremanager.author.entity.repository;

import dev.paulocavalcante.bookstoremanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
