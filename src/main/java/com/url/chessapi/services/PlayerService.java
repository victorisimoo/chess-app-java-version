package com.url.chessapi.services;

import com.url.chessapi.models.Player;
import com.url.chessapi.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public ArrayList<Player> getAllPlayers() {
        return (ArrayList<Player>) playerRepository.findAll();
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).get();
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

}
