package com.github.tukcps.backend.serviceImpl;

import com.github.tukcps.backend.entities.Component;
import com.github.tukcps.backend.entities.Function;
import com.github.tukcps.backend.entities.System;
import com.github.tukcps.backend.entities.relationships.HasPartDirectly;
import com.github.tukcps.backend.entities.relationships.ImplementsFunction;
import com.github.tukcps.backend.repositories.ComponentRepository;
import com.github.tukcps.backend.repositories.FunctionRepository;
import com.github.tukcps.backend.repositories.SystemRepository;
import com.github.tukcps.backend.requestPayloads.CreateComponentRequest;
import com.github.tukcps.backend.requestPayloads.CreateFunctionRequest;
import com.github.tukcps.backend.requestPayloads.CreateSystemRequest;
import com.github.tukcps.backend.services.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemRepository systemRepository;
    @Autowired
    private FunctionRepository functionRepository;
    @Autowired
    private ComponentRepository componentRepository;

    private final List<ImplementsFunction> implementsFunctionsList = new ArrayList<ImplementsFunction>();
    private final List<HasPartDirectly> hasPartDirectlyList = new ArrayList<HasPartDirectly>();

    @Override
    public System createSystem(CreateSystemRequest createSystemRequest) {
        if (createSystemRequest.getComponentList() != null) {
            for (CreateComponentRequest createComponentRequest : createSystemRequest.getComponentList()){
                Component component = new Component();
                component.setName(createComponentRequest.getName());
                component.setDesc(createComponentRequest.getName());
                HasPartDirectly hasPartDirectly = new HasPartDirectly();
                hasPartDirectly.setPartMetadata(createComponentRequest.getPartMetadata());
                hasPartDirectly.setComponent(component);
                hasPartDirectlyList.add(hasPartDirectly);

                if (createComponentRequest.getFunctionRequestList() != null){
                    List<ImplementsFunction> implementsComp_FuncList = new ArrayList<ImplementsFunction>();
                    for (CreateFunctionRequest createFunctionRequest : createComponentRequest.getFunctionRequestList()){
                        Function function = new Function();
                        function.setName(createFunctionRequest.getName());
                        function.setDesc(createFunctionRequest.getDesc());
                        functionRepository.save(function);
                        ImplementsFunction implementsFunction = new ImplementsFunction();
                        implementsFunction.setFuncMetaData(createFunctionRequest.getFuncMetadata());
                        implementsFunction.setFunction(function);
                        implementsComp_FuncList.add(implementsFunction);
                        component.setImplementsFunctions(implementsComp_FuncList);
                        componentRepository.save(component);
                    }
                }
            }
        }
        if (createSystemRequest.getFunctionList() != null) {
            for (CreateFunctionRequest createFunctionRequest : createSystemRequest.getFunctionList()){
                Function function = new Function();
                function.setName(createFunctionRequest.getName());
                function.setDesc(createFunctionRequest.getDesc());
                functionRepository.save(function);
                ImplementsFunction implementsFunction = new ImplementsFunction();
                implementsFunction.setFuncMetaData(createFunctionRequest.getFuncMetadata());
                implementsFunction.setFunction(function);
                implementsFunctionsList.add(implementsFunction);
            }
        }
        System system = new System();
        system.setName(createSystemRequest.getName());
        system.setDesc(createSystemRequest.getDesc());
        system.setHasPartDirectlyList(hasPartDirectlyList);
        system.setImplementsFunctions(implementsFunctionsList);
        systemRepository.save(system);

        return system;
    }
}
