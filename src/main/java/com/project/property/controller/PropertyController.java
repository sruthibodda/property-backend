package com.project.property.controller;

import com.project.property.entity.Property;
import com.project.property.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    @Autowired
    private PropertyService service;

    // Add property
    @PostMapping
    public Property addProperty(@RequestBody Property property) {
        return service.addProperty(property);
    }

    // Get all properties
    @GetMapping
    public List<Property> getAllProperties() {
        return service.getAllProperties();
    }
}