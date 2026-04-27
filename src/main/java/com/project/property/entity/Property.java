package com.project.property.entity;

import jakarta.persistence.*;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private String type;
    private int size;
    private double price;

    // Getters and Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getSize() { return size; }

    public void setSize(int size) { this.size = size; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }
}