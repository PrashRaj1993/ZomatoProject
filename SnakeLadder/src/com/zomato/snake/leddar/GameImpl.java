package com.zomato.snake.leddar;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.zomato.modal.Dice;
import com.zomato.modal.Player;

public class GameImpl implements GameInterface{

	Board board;
	PlayerStats playerStats;
	
	public GameImpl(Board board, PlayerStats playerStats) {
		this.board = board;
		this.playerStats = playerStats;
	}

	@Override
	public void play(Map<Integer,Integer> startEndMap) {
		// TODO Auto-generated method stub
		int flag=0;
		while(true) {
			List<Player> playerList = playerStats.getPlayers();
			for(Player p : playerList) {
				Dice dice = new Dice();
				dice.throwDice();
				p.setDiceVal(dice.getDiceValue());
				System.out.println(p.getName() + " : curent position " + p.getPosition() + " " + p.getName() + " : runs " + p.getDiceVal() + " values");
				p.updatePosition();
				if(startEndMap.containsKey(p.getPosition())){
					int end = startEndMap.get(p.getPosition());
					//System.out.println("Met snake/ladder with end point " + end);
					p.setPosition(end);
					//System.out.println("checking get position " + p.getPosition());
				}
				if(p.getPosition()>=100)
				{
					flag=1;
					System.out.println(p.getName() + " : is now on position 100.\n" + p.getName() +" won game");
				}else {
					//System.out.println(p.getName() + " is now on position " + p.getPosition());
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			System.out.println("Next Round");
			
			if(flag==1)
				break;
		}
	}
	
	public void setSlData(Board slData) {
		
	}

	@Override
	public void decideTurns() {
		// TODO Auto-generated method stub
		List<Player> playerList = playerStats.getPlayers();
		
		for(Player p : playerList) {
			Dice dice = new Dice();
			dice.throwDice();
			p.setDiceVal(dice.getDiceValue());
			System.out.println(p.getName() + " : " + p.getDiceVal());
		}
		playerList.sort(new Comparator<Player>() {
			public int compare(Player p1, Player p2) {
				return p2.getDiceVal()-p1.getDiceVal();
			}
		});
	}

}
