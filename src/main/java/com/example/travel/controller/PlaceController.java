package com.example.travel.controller;

import com.example.travel.model.Place;
import com.example.travel.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class PlaceController {
    private final PlaceService placeService;
    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }
    @GetMapping
    public String getAllPlaces(Model model) {
        model.addAttribute("place", placeService.getAllPlaces());
        return "places/list";
    }
    @GetMapping("/{id}")
    public String getPlaceById(@PathVariable Long id, Model model) {
        Place places = placeService.getPlaceById(id);
        model.addAttribute("place", places);
        return "places/details";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("place", new Place());
        return "places/create";
    }
    @PostMapping("/create")
    public String createPlace(@ModelAttribute Place place) {
        placeService.createPlace(place);
        return "redirect:/places";
    }
    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        placeService.deletePlace(id);
        return "redirect:/places";
    }
}


