package com.example.gametracker;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


    @Service
    public class GameService{


        //Create a list of objects
        private List<Game> games = new ArrayList<>(List.of(new Game("Assassin's Creed Odyssey", 42, false),
        new Game("CyberPunk 2077", 0, false)
        ));


        public List<Game> getAll(){
            return games;
        }

        public Game getGameByID( int id){
            if(id >=1 && id <= games.size()) {
                return games.get(id - 1);
            }
            return null;
        }

        public Game addGame(Game newGame){

             games.add(newGame);
             return newGame;
        }
    }

