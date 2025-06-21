package com.github.tukcps.backend.services;

import com.github.tukcps.backend.entities.System;
import com.github.tukcps.backend.requestPayloads.CreateSystemRequest;
import org.springframework.stereotype.Service;

@Service
public interface SystemService {

    public System createSystem(CreateSystemRequest createSystemRequest);
}
