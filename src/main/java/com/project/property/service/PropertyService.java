package com.project.property.service;

import com.project.property.entity.Property;
import com.project.property.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository repository;

    public Property addProperty(Property property) {
        return repository.save(property);
    }

    public List<Property> getAllProperties() {
        return repository.findAll();
    }
}