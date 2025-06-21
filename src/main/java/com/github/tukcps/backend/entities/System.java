package com.github.tukcps.backend.entities;

import com.github.tukcps.backend.entities.relationships.HasPartDirectly;
import com.github.tukcps.backend.entities.relationships.ImplementsFunction;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

/**
 * System level element that is according to ISO 26262: set of components (3.21) or subsystems
 * that relates at least a sensor, a controller, and an actuator with one another
 * */

@Node(labels = {"System"})
public class System {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Property(name = "description")
    private String desc;
    @Relationship(type = "HAS_PART_DIRECTLY", direction = Relationship.Direction.OUTGOING)
    private List<HasPartDirectly> hasPartDirectlyList;
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

    public List<HasPartDirectly> getHasPartDirectlyList() {
        return hasPartDirectlyList;
    }

    public void setHasPartDirectlyList(List<HasPartDirectly> hasPartDirectlyList) {
        this.hasPartDirectlyList = hasPartDirectlyList;
    }

    public List<ImplementsFunction> getImplementsFunctions() {
        return implementsFunctions;
    }

    public void setImplementsFunctions(List<ImplementsFunction> implementsFunctions) {
        this.implementsFunctions = implementsFunctions;
    }

    @Override
    public String toString() {
        return "System{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", hasPartDirectlyList=" + hasPartDirectlyList +
                ", implementsFunctions=" + implementsFunctions +
                '}';
    }
}
