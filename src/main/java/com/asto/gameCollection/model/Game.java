package com.asto.gameCollection.model;


import jakarta.persistence.*;

@Entity // Cette classe sera une table en base
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation
    private Long id;

    private String title;
    private String genre;
    private String platform;
    private Double rating;
    private String state;

    // Constructeur vide obligatoire
    public Game() {}

    // Constructeur avec tous les champs
    public Game(String title, String genre, String platform, Double rating, String state) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.rating = rating;
        this.state = state;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}
