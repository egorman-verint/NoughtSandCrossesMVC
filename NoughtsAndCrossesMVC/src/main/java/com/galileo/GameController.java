package com.galileo;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verint.NoughtsAndCrosses;

@RestController
@RequestMapping("/api/nandc")
public class GameController {
	
	private Hashtable<String, Game> table= new Hashtable<String, Game>();
	private NoughtsAndCrosses gameEngine;
	private final AtomicLong idCounter = new AtomicLong();
	
	@RequestMapping("/game")
	public Game game(){
		gameEngine = new NoughtsAndCrosses("one");
		String gameid = String.valueOf(idCounter.incrementAndGet());
		Game toReturn = new Game(gameid, gameEngine);
		table.put(gameid, toReturn);
		return toReturn;
	}
	
	@RequestMapping("/game/{id}/makeMove/{player}/{cell}")
	public String makeMove( @PathVariable("id") String gameId,  @PathVariable("player") String player,  @PathVariable("cell") String cell) {
		return gameId + ", " + player + ", " + cell;
	}

}
