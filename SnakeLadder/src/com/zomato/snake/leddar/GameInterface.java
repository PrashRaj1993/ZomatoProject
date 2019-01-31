package com.zomato.snake.leddar;

import java.util.Map;

public interface GameInterface {
	
	public void decideTurns();
	public void play(Map<Integer,Integer> startEndMap);
	
}
