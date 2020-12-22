package dev.paulocavalcante.bookstoremanager.user.repository;

import dev.paulocavalcante.bookstoremanager.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
