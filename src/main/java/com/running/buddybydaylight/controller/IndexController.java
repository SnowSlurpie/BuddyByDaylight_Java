package com.running.buddybydaylight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    //mapper for getting to the creator builds page
    @GetMapping("/index")
    public String getCreatorBuilds(){

        return "index";
    }

}

