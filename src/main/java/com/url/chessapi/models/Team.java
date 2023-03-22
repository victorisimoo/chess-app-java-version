package com.url.chessapi.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    String name;
    Timestamp created_at;

    public Team() {
    }

    public Team(Long id, String name, Timestamp created_at) {
        this.id = id;
        this.name = name;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Team{" + "id=" + id + ", name=" + name + ", created_at=" + created_at + '}';
    }
}
