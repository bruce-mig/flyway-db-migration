package com.github.bruce_mig.flyway_db_migration;

import com.github.bruce_mig.flyway_db_migration.domain.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayDbMigrationApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

    public FlywayDbMigrationApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(FlywayDbMigrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.findAll().forEach(System.out::println);
	}
}
