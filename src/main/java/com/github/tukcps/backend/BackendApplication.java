package com.github.tukcps.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories("com.github.tukcps.backend.repositories")
@SpringBootApplication
@EntityScan("com.github.tukcps.backend.entities")
@ComponentScan(basePackages = {"com.github.tukcps.backend.controllers", "com.github.tukcps.backend.services", "com.github.tukcps.backend.serviceImpl"})
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
