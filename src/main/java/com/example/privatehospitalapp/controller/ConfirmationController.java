package com.example.privatehospitalapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/confirmation")
public class ConfirmationController {

    @GetMapping()
    public String confirmation(Model model){
        return "confirmation";
    }
}
