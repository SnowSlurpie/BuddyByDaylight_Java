package com.running.buddybydaylight.controller;

import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.model.Killers;
import com.running.buddybydaylight.model.Survivors;
import com.running.buddybydaylight.service.SurvivorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SurvivorController {

    @Autowired
    private SurvivorService service;

        @GetMapping("/survivors")
        public String showKillerList(Model model)      {
            Iterable<Survivors> listSurvivors = service.listAll();
            model.addAttribute("listSurvivors", listSurvivors);
            return "survivors";
        }

        @GetMapping("/survivors/new")
        public String showNewForm(Model model) {
            model.addAttribute("survivors", new Survivors());
            model.addAttribute("pageTitle", "Add New Survivor");
            return "survivor_form";
        }
    @PostMapping("/survivors/save")
    public String saveUser(Survivors survivors, RedirectAttributes ra) {
        service.save(survivors);
        ra.addFlashAttribute("message", "The user has been successfully saved! Congratulations!");
        return "redirect:/survivors";
    }

    @GetMapping("/survivors/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id,
                               Model model,
                               RedirectAttributes ra) {
        try {
            Survivors survivors =service.get(id);
            model.addAttribute("survivors", survivors);
            model.addAttribute("pageTitle", "Edit Survivor (ID: " + id + ")");
            return "survivor_form";
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/survivors";
        }
    }

    @GetMapping("/survivors/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id,
                             RedirectAttributes ra) {
        try {
            service.delete(id);
            ra.addFlashAttribute("message","The Killer with ID " + id + " has been successfully deleted! Well done USER!");
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/survivors";
    }
}

