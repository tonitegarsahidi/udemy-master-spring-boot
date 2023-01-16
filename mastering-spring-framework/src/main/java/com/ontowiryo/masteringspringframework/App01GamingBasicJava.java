package com.ontowiryo.masteringspringframework;

import com.ontowiryo.masteringspringframework.game.GameRunner;
import com.ontowiryo.masteringspringframework.game.MarioGame;
import com.ontowiryo.masteringspringframework.game.PacmanGame;
import com.ontowiryo.masteringspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		

	}

}
