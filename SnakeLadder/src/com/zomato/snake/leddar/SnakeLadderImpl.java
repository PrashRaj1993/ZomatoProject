package com.zomato.snake.leddar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zomato.modal.Ladder;
import com.zomato.modal.Player;
import com.zomato.modal.Snake;

public class SnakeLadderImpl implements SnakeLeddar{

	@Override
	public void start() {
		Map<Integer,Integer> startEndMap = new HashMap<>();
		// TODO Auto-generated method stub
		List<Snake> s = new ArrayList<>();
		s.add(new Snake(31,14));
		s.add(new Snake(37,17));
		s.add(new Snake(73,53));
		s.add(new Snake(78,39));
		s.add(new Snake(99,7));
		s.add(new Snake(92,35));
		
		List<Ladder> l = new ArrayList<>();
		l.add(new Ladder(5,25));
		l.add(new Ladder(10,29));
		l.add(new Ladder(28,55));
		l.add(new Ladder(22,41));
		l.add(new Ladder(44,95));
		l.add(new Ladder(70,89));
		l.add(new Ladder(79,81));
		
		Board snakeLaddarData = new Board(s,l); //Snake and Ladder initialized
		
		startEndMap.put(31, 14);
		startEndMap.put(37, 17);
		startEndMap.put(73, 53);
		startEndMap.put(78, 39);
		startEndMap.put(99, 7);
		startEndMap.put(92, 35);
		startEndMap.put(5, 25);
		startEndMap.put(10, 29);
		startEndMap.put(28, 55);
		startEndMap.put(22, 41);
		startEndMap.put(44, 95);
		startEndMap.put(70, 89);
		startEndMap.put(79, 81);
		
		List<Player> p = new ArrayList<>();
		p.add(new Player(0,"Player 1"));
		p.add(new Player(0,"Player 2"));
		PlayerStats playerStats = new PlayerStats(2,p); //Players Initialized
		
		//Start the game
		GameHelper.start(snakeLaddarData,playerStats,startEndMap);
		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
