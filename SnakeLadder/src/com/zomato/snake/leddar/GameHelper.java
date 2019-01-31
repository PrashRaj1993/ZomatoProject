package com.zomato.snake.leddar;

import java.util.Map;

public class GameHelper {

	public static void start(Board snakeLaddarData, PlayerStats playerStats, Map<Integer,Integer> startEndMap) {
		// TODO Auto-generated method stub
		GameImpl game = new GameImpl(snakeLaddarData,playerStats);
		game.decideTurns();
		game.play(startEndMap);
	} 
	
}
