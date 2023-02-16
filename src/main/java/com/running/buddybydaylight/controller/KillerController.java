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
    private KillerService service;

        @GetMapping("/killers")
        public String showKillerList(Model model)      {
            Iterable<Killers> listKillers = service.listAll();
            model.addAttribute("listKillers", listKillers);
            return "killers";
        }

        @GetMapping("/killers/new")
        public String showNewForm(Model model) {
            model.addAttribute("killer", new Killers());
            model.addAttribute("pageTitle", "Add New Killer");
            return "killer_form";
        }
    @PostMapping("/killers/save")
    public String saveUser(Killers killer, RedirectAttributes ra) {
        service.save(killer);
        ra.addFlashAttribute("message", "The user has been successfully saved! Congratulations!");
        return "redirect:/killers";
    }

    @GetMapping("/killers/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id,
                               Model model,
                               RedirectAttributes ra) {
        try {
            Killers killer =service.get(id);
            model.addAttribute("killer", killer);
            model.addAttribute("pageTitle", "Edit Killer (ID: " + id + ")");
            return "killer_form";
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/killers";
        }
    }

    @GetMapping("/killers/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id,
                             RedirectAttributes ra) {
        try {
            service.delete(id);
            ra.addFlashAttribute("message","The Killer with ID " + id + " has been successfully deleted! Well done USER!");
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/killers";
    }
}

