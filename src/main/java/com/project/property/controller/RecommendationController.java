package com.project.property.controller;

import com.project.property.entity.Recommendation;
import com.project.property.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    @Autowired
    private RecommendationService service;

    // Add recommendation
    @PostMapping
    public Recommendation addRecommendation(@RequestBody Recommendation rec) {
        return service.addRecommendation(rec);
    }

    // Get all recommendations
    @GetMapping
    public List<Recommendation> getAllRecommendations() {
        return service.getAllRecommendations();
    }
}