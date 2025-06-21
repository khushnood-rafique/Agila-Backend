package com.github.tukcps.backend.requestPayloads;

import com.github.tukcps.backend.entities.Component;
import com.github.tukcps.backend.entities.Function;

import java.util.List;

public class CreateSystemRequest {

    private String name;
    private String desc;
    private List<CreateComponentRequest> componentList;
    private List<CreateFunctionRequest> functionList;

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

    public List<CreateComponentRequest> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<CreateComponentRequest> componentList) {
        this.componentList = componentList;
    }

    public List<CreateFunctionRequest> getFunctionList() {
        return functionList;
    }

    public void setFunctionList(List<CreateFunctionRequest> functionList) {
        this.functionList = functionList;
    }
}
