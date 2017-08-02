package me.yling.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String sayHello(Model model)
    {
        String message = "This is the text from the sayHello() method";
        model.addAttribute ("myMessage",message);


        return "index";
    }
}
