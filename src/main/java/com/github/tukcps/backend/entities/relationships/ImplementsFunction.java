package com.github.tukcps.backend.entities.relationships;

import com.github.tukcps.backend.entities.Function;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class ImplementsFunction {

    @Id
    @GeneratedValue
    private Long id;
    private String funcMetaData;
    @TargetNode
    private Function function;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuncMetaData() {
        return funcMetaData;
    }

    public void setFuncMetaData(String funcMetaData) {
        this.funcMetaData = funcMetaData;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }
}
