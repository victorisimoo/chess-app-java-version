package com.url.chessapi.controllers;

import com.url.chessapi.models.Player;
import com.url.chessapi.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping()
    public ArrayList<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping()
    public Player savePlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }
}
