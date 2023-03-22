package com.url.chessapi.services;

import com.url.chessapi.models.Team;
import com.url.chessapi.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }

    public ArrayList<Team> getAllTeams() {
        return (ArrayList<Team>) teamRepository.findAll();
    }

    public Team getTeamById(Long id) {
        return teamRepository.findById(id).get();
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team updateTeam(Team team) {
        return teamRepository.save(team);
    }
}
