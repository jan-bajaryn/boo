package com.ang.boo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "/index";
    }

    @GetMapping("/first_page")
    public String firstPage() {
        return "/first_page";
    }

    @GetMapping("/second_page")
    public String secondPage() {
        return "/second_page";
    }
    @GetMapping("/third_page")
    public String thirdPage() {
        return "/third_page";
    }
}
