package com.github.tukcps.backend.controllers;

import com.github.tukcps.backend.entities.System;
import com.github.tukcps.backend.requestPayloads.CreateSystemRequest;
import com.github.tukcps.backend.services.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agila/backend/entities/system")
public class SystemController {

    @Autowired
    private SystemService systemService;

    @PostMapping("/create")
    public System createSystem(@RequestBody CreateSystemRequest createSystemRequest){
        return systemService.createSystem(createSystemRequest);
    }
}
