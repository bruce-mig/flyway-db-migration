package com.github.bruce_mig.flyway_db_migration.domain.repositories;

import com.github.bruce_mig.flyway_db_migration.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
