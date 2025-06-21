package com.github.tukcps.backend.repositories;

import com.github.tukcps.backend.entities.Component;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends Neo4jRepository<Component, Long> {
}
