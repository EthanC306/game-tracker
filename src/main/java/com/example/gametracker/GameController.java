package com.example.gametracker;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    public class GameController {

        private final GameService gameService;
        public GameController(GameService gameService){
            this.gameService = gameService;
        }

        @GetMapping("/games")  //GetMapping is a usage of RequestMapping
        public List<Game> getGame() { //Java method inside the class of gamecontroller
            return gameService.getAll();
        }
        @GetMapping("/games/{id}")
        public Game getGameById(@PathVariable int id){
            Game game1 = new Game("Assassin's Creed Odyssey", 42, false);
            Game game2 = new Game("CyberPunk 2077", 0, false);
            if(id == 1){
                return game1;
            }
            else if(id ==2){
                return game2;
            }

            return null;
        }

        @PostMapping("/games")
        public Game createGame(@RequestBody Game newGame){
            return gameService.addGame(newGame);
        }

    }
