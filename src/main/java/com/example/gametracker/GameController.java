package com.example.gametracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class GameController {
        @GetMapping("/hello")  //GetMapping is a usage of RequestMapping
        public Game getGame() { //Java method inside the class of gamecontroller
            {
                Game game = new Game(
                        "Assassin's Creed Odyssey",
                        42,
                        false
                );
                return game;
            }
        }
    }