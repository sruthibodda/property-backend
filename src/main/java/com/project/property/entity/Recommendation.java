package com.project.property.entity;

import jakarta.persistence.*;

@Entity
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String suggestion;
    private String category;

    // Getters and Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getSuggestion() { return suggestion; }

    public void setSuggestion(String suggestion) { this.suggestion = suggestion; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }
}