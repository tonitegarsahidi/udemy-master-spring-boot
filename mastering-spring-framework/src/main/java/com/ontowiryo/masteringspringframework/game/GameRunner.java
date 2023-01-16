package com.ontowiryo.masteringspringframework.game;

public class GameRunner {
	
//	MarioGame game;
	GamingConsole game;
	
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}

	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running Game " + game);
		
		game.up();
		game.down();
		game.right();
		game.left();
		
	}

}
