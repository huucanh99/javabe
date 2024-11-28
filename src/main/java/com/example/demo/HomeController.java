package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // trả về trang home.html
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // trả về trang about.html
    }
}
