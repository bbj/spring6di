package com.bbj.sprint6di.controllers;

import com.bbj.sprint6di.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment () {
        return "You are in - "+environmentService.getEnv()+" - environment.";
    }

}
