package com.running.buddybydaylight.controller;

import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.model.Killers;
import com.running.buddybydaylight.service.KillerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class KillerController {

    @Autowired
    private KillerService service; // Autowired instance of KillerService

    // Controller for getting to the killers page
    @GetMapping("/killers")
    public String showKillerList(Model model) {
        Iterable<Killers> listKillers = service.listAll(); // Retrieve all killers from the database
        model.addAttribute("listKillers", listKillers); // Add the list of killers to the model
        return "killers"; // Return the name of the view that should be rendered
    }

    // Controller for creating a new killer
    @GetMapping("/killers/new")
    public String showNewForm(Model model) {
        model.addAttribute("killer", new Killers()); // Add an empty instance of the Killers model to the model
        model.addAttribute("pageTitle", "Add New Killer"); // Add the page title to the model
        return "killer_form"; // Return the name of the view that should be rendered
    }

    // Controller for saving a new killer to the database
    @PostMapping("/killers/save")
    public String saveUser(Killers killer, RedirectAttributes ra) {
        service.save(killer); // Save the new killer to the database
        ra.addFlashAttribute("message", "The user has been successfully saved! Congratulations!"); // Add a flash message to the redirect attributes
        return "redirect:/killers"; // Redirect to the killers page
    }

    // Controller for editing an existing killer based on their ID
    @GetMapping("/killers/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        try {
            Killers killer = service.get(id); // Get the killer with the specified ID from the database
            model.addAttribute("killer", killer); // Add the killer to the model
            model.addAttribute("pageTitle", "Edit Killer (ID: " + id + ")"); // Add the page title to the model
            return "killer_form"; // Return the name of the view that should be rendered
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage()); // Add a flash message to the redirect attributes
            return "redirect:/killers"; // Redirect to the killers page
        }
    }

    // Controller for deleting an existing killer based on their ID
    @GetMapping("/killers/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id, RedirectAttributes ra) {
        try {
            service.delete(id); // Delete the killer with the specified ID from the database
            ra.addFlashAttribute("message","The Killer with ID " + id + " has been successfully deleted! Well done USER!"); // Add a flash message to the redirect attributes
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage()); // Add a flash message to the redirect attributes
        }
        return "redirect:/killers"; // Redirect to the killers page
    }
}

