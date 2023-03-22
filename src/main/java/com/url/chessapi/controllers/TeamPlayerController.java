package com.url.chessapi.controllers;

import com.url.chessapi.models.TeamPlayer;
import com.url.chessapi.services.TeamPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/team_players")
public class TeamPlayerController {

    @Autowired
    private TeamPlayerService teamPlayerService;

    @GetMapping()
    public ArrayList<TeamPlayer> getAllTeamPlayers() {
        return teamPlayerService.getAllTeamPlayers();
    }

    @PostMapping()
    public TeamPlayer saveTeamPlayer(@RequestBody TeamPlayer teamPlayer) {
        return teamPlayerService.saveTeamPlayer(teamPlayer);
    }
}
