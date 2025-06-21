package com.github.tukcps.backend.entities;

import com.github.tukcps.backend.entities.relationships.ImplementsFunction;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

/**
 * According to ISO26262: non-system level element (3.41) that is logically or technically
 * separable and is comprised more than one hardware part (3.71) or one or more software units
 * */

@Node(labels = {"Component"})
public class Component {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Property(name = "description")
    private String desc;
    @Relationship(type = "IMPLEMENTS", direction = Relationship.Direction.OUTGOING)
    private List<ImplementsFunction> implementsFunctions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<ImplementsFunction> getImplementsFunctions() {
        return implementsFunctions;
    }

    public void setImplementsFunctions(List<ImplementsFunction> implementsFunctions) {
        this.implementsFunctions = implementsFunctions;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", implementsFunctions=" + implementsFunctions +
                '}';
    }
}
