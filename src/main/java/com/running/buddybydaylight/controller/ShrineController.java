package com.running.buddybydaylight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShrineController {

    @GetMapping("/shrine")
    public String showShrine(){
        return "shrine";
    }
}
