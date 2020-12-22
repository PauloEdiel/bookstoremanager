package dev.paulocavalcante.bookstoremanager.publishers.entity.repository;

import dev.paulocavalcante.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
