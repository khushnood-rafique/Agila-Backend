package com.github.tukcps.backend.requestPayloads;

import java.util.List;

public class CreateComponentRequest {

    private String name;
    private String desc;
    private String partMetadata;
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

    public String getPartMetadata() {
        return partMetadata;
    }

    public void setPartMetadata(String partMetadata) {
        this.partMetadata = partMetadata;
    }

    public List<CreateFunctionRequest> getFunctionRequestList() {
        return functionList;
    }

    public void setFunctionRequestList(List<CreateFunctionRequest> functionRequestList) {
        this.functionList = functionRequestList;
    }
}
