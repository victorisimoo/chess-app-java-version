package com.url.chessapi.controllers;

import com.url.chessapi.models.Team;
import com.url.chessapi.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping()
    public ArrayList<Team> getAllTeams(){
        return teamService.getAllTeams();
    }

    @PostMapping()
    public Team saveTeam(@RequestBody Team team){
        return teamService.saveTeam(team);
    }
}
