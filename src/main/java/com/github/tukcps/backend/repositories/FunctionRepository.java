package com.github.tukcps.backend.repositories;

import com.github.tukcps.backend.entities.Function;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionRepository extends Neo4jRepository<Function, Long> {
}
