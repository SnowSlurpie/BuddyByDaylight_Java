package com.running.buddybydaylight.controller;

import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.model.Survivors;
import com.running.buddybydaylight.repository.SurvivorRepository;
import com.running.buddybydaylight.service.SurvivorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


// This is a controller class for handling survivor-related actions

@Controller
public class SurvivorController {

    // Injecting SurvivorService and SurvivorRepository dependencies into the controller
    @Autowired
    private SurvivorService service;
    @Autowired
    private SurvivorRepository survivorRepository;

    //Controller for retrieving and displaying a list of survivors
    @GetMapping("/survivors")
    public String showSurvList(Model model) {
        Iterable<Survivors> listSurvivors = service.listAll();
        model.addAttribute("listSurvivors", listSurvivors);
        return "survivors";
    }

    //Controller for displaying the form to add a new survivor
    @GetMapping("/survivors/new")
    public String showNewForm(Model model) {
        model.addAttribute("survivors", new Survivors());
        model.addAttribute("pageTitle", "Add New Survivor");
        return "survivor_form";
    }

    //Controller for saving a new survivor to the database
    @PostMapping("/survivors/save")
    public String saveUser(Survivors survivors, RedirectAttributes ra) {
        service.save(survivors);
        ra.addFlashAttribute("message", "The survivor has been successfully saved! Congratulations!");
        return "redirect:/survivors";
    }

    //Controller for displaying the form to edit an existing survivor
    @GetMapping("/survivors/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id,
                               Model model,
                               RedirectAttributes ra) {
        try {
            Survivors survivors = service.get(id);
            model.addAttribute("survivors", survivors);
            model.addAttribute("pageTitle", "Edit Survivor (ID: " + id + ")");
            return "survivor_form";
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/survivors";
        }
    }

    //Controller for deleting an existing survivor based on their id
    @GetMapping("/survivors/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id,
                             RedirectAttributes ra) {
        try {
            service.delete(id);
            ra.addFlashAttribute("message","The Survivor with ID " + id + " has been successfully deleted! Well done USER!");
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/survivors";
    }

}

