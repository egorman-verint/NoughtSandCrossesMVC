package com.galileo;

import com.verint.NoughtsAndCrosses;

public class Game {
	
	private String id;
	private NoughtsAndCrosses engine;

	public Game(String id, NoughtsAndCrosses gameEngine) {
		engine = gameEngine;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NoughtsAndCrosses getEngine() {
		return engine;
	}

	public void setEngine(NoughtsAndCrosses engine) {
		this.engine = engine;
	}

}
