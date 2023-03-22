package com.url.chessapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    String email;

    public Player() {
    }

    public Player(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", email=" + email + '}';
    }
}
