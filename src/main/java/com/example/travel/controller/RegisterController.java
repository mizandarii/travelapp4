package com.example.travel.controller;

import com.example.travel.model.Place;
import com.example.travel.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class RegisterController {
    @GetMapping("/register")
    public String showRegisterPage() {
        return "registration";  // Thymeleaf template file name without the extension
    }
}