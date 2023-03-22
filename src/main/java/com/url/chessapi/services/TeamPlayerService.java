package com.url.chessapi.services;

import com.url.chessapi.models.TeamPlayer;
import com.url.chessapi.repositories.TeamPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TeamPlayerService {

    @Autowired
    private TeamPlayerRepository teamPlayerRepository;

    public void deleteTeamPlayer(Long id) {
        teamPlayerRepository.deleteById(id);
    }

    public ArrayList<TeamPlayer> getAllTeamPlayers() {
        return (ArrayList<TeamPlayer>) teamPlayerRepository.findAll();
    }

    public TeamPlayer getTeamPlayerById(Long id) {
        return teamPlayerRepository.findById(id).get();
    }

    public TeamPlayer saveTeamPlayer(TeamPlayer teamPlayer) {
        return teamPlayerRepository.save(teamPlayer);
    }

    public TeamPlayer updateTeamPlayer(TeamPlayer teamPlayer) {
        return teamPlayerRepository.save(teamPlayer);
    }
}
