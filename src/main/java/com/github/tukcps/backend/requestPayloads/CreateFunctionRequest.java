package com.github.tukcps.backend.requestPayloads;

public class CreateFunctionRequest {

    private String name;
    private String desc;
    private String FuncMetadata;

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

    public String getFuncMetadata() {
        return FuncMetadata;
    }

    public void setFuncMetadata(String funcMetadata) {
        FuncMetadata = funcMetadata;
    }
}
