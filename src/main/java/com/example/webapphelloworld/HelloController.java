package com.example.webapphelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hi there!");
        return "index";
    }
}
