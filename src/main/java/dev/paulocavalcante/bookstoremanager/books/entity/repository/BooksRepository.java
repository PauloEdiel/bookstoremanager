package dev.paulocavalcante.bookstoremanager.books.entity.repository;

import dev.paulocavalcante.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
