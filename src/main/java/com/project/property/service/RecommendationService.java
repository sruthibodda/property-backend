package com.project.property.service;

import com.project.property.entity.Recommendation;
import com.project.property.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    @Autowired
    private RecommendationRepository repository;

    public Recommendation addRecommendation(Recommendation rec) {
        return repository.save(rec);
    }

    public List<Recommendation> getAllRecommendations() {
        return repository.findAll();
    }
}