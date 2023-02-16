package com.running.buddybydaylight;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String showHomePage() {
        System.out.println("---------MAIN CONTROLLER-------------");
        return "index";
    }

}

//    TODO: Update pathings in GetMappings