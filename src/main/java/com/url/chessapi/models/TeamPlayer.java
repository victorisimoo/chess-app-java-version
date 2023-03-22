package com.url.chessapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "team_player")
public class TeamPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private Long team_id;
    private Long player_id;

    public TeamPlayer() {
    }

    public TeamPlayer(Long id, Long team_id, Long player_id) {
        this.id = id;
        this.team_id = team_id;
        this.player_id = player_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public Long getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Long player_id) {
        this.player_id = player_id;
    }

    @Override
    public String toString() {
        return "TeamPlayer{" + "id=" + id + ", team_id=" + team_id + ", player_id=" + player_id + '}';
    }

}
