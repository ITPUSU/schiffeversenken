package com.example.shipsinking.controller;

import com.example.shipsinking.model.GameMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GameController {

    @MessageMapping("/move")
    @SendTo("/topic/game")
    public GameMessage handleMove(GameMessage message) {
        // Logica per gestire le mosse del gioco
        return message;
    }
}
