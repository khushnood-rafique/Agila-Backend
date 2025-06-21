package com.github.tukcps.backend.entities.relationships;

import com.github.tukcps.backend.entities.Component;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class HasPartDirectly {

    @Id
    @GeneratedValue
    private Long id;
    private String partMetadata;
    @TargetNode
    private Component component;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartMetadata() {
        return partMetadata;
    }

    public void setPartMetadata(String partMetadata) {
        this.partMetadata = partMetadata;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
