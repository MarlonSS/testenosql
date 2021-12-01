package com.testenosqlspring.testenosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TestenosqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestenosqlApplication.class, args);
	}

}
