package com.running.buddybydaylight.controller;

import com.running.buddybydaylight.model.User;
import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.SecureRandom;

@Controller
public class UserController {
    @Autowired
    private UserService service;
//controller for getting to users page
    @GetMapping("/users")
    public String showUserList(Model model) {
        Iterable<User> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }

    //controller for creating a new user
    @GetMapping("/users/new")
    public String showNewForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("pageTitle", "Add New User");
        return "user_form";
    }

    //controller for saving a new user to the db
    @PostMapping("/users/save")
    public String saveUser(User user, RedirectAttributes ra) {

        Integer passHash = 10;

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(passHash, new SecureRandom());
        String encodedPass = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPass);


        service.save(user);
        ra.addFlashAttribute("message", "The user has been successfully saved! Congratulations!");
        return "redirect:/users";
    }

    //controller for editing a current user based on their id
    @GetMapping("/users/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id,
                               Model model,
                               RedirectAttributes ra) {
        try {
            User user =service.get(id);
            model.addAttribute("user", user);
            model.addAttribute("pageTitle", "Edit User (ID: " + id + ")");
            return "user_form";
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/users";
        }
    }

    //controller for deleting users based on their id

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id,
                               RedirectAttributes ra) {
        try {
            service.delete(id);
            ra.addFlashAttribute("message","The user with ID " + id + " has been successfully deleted! Well done USER!");
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/users";
    }

}
