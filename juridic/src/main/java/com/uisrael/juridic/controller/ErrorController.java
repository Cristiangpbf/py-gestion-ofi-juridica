package com.uisrael.juridic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/mostrarError")
    public String mostrarError(Model model) {
        return "/error/showError";
    }
}
