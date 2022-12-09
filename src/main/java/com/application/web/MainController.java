package com.application.web;

import com.application.entities.User;
import com.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    private UserService userService;

    @Autowired
    public MainController(UserService userService) { this.userService = userService; }

    @RequestMapping("/")
    public String home(Model model){

        User user1 = new User();

        user1.setName("user1");
        user1.setEmail("user1@gmail.com");
        user1.setPassword("123456");

        userService.createUser(user1);

        List<User> users = userService.getUsers();

        model.addAttribute("users", users);

        return "index";

    }

}
