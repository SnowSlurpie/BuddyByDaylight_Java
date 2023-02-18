package com.running.buddybydaylight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreatorBuildsController {

//mapper for getting to the creator builds page
    @GetMapping("/creatorBuilds")
    public String getCreatorBuilds(){
        return "creatorBuilds";
    }

}
