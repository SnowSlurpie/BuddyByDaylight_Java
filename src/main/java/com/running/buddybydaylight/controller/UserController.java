package com.running.buddybydaylight.controller;

import com.running.buddybydaylight.model.User;
import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.repository.UserRepository;
import com.running.buddybydaylight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;

/*3.f*/
//5.d @controller, service, repository


// This is a controller for handling user-related requests and responses
@Controller
public class UserController {
    // We're autowiring the UserService and UserRepository for accessing the service layer and repository layer, respectively
    @Autowired
    private UserService service;

    @Autowired
    private UserRepository userRepository;

    // This method is for handling GET requests for /users, and it returns the users.html template
    @GetMapping("/users")
    public String showUserList(Model model) {
        Iterable<User> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }

    // This method is for handling GET requests for /users/new, and it returns the user_form.html template with an empty user object
    @GetMapping("/users/new")
    public String showNewForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("pageTitle", "Sign Up!");
        return "user_form";
    }

    // This method is for handling POST requests for /users/save, and it saves a new user to the database
    @PostMapping("/users/save")
    public String saveUser(User user, RedirectAttributes ra) {

        // We're using BCrypt to hash the user's password before saving it to the database. 5.i
        int strength = 10;
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(strength, new SecureRandom());
        String hashPass = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(hashPass);

        // Saving the user to the database and setting a flash message for the user
        service.save(user);
        ra.addFlashAttribute("message", "The user has been successfully saved! Congratulations!");
        return "redirect:/users";
    }

    // This method is for handling GET requests for /users/edit/{id}, and it returns the user_form.html template with the specified user's data
    @GetMapping("/users/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        try {
            // Getting the user object from the database using the specified id
            User user = service.get(id);
            model.addAttribute("user", user);
            model.addAttribute("pageTitle", "Edit User (ID: " + id + ")");
            return "user_form";
        } catch (UserNotFoundException e) {
            // If the user isn't found in the database, we're redirecting the user to /users and setting a flash message
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/users";
        }
    }

    // This method is for handling GET requests for /users/delete/{id}, and it deletes the user with the specified id from the database
    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id, RedirectAttributes ra) {
        try {
            service.delete(id);
            ra.addFlashAttribute("message","The user with ID " + id + " has been successfully deleted! Well done USER!");
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/users";
    }

}
