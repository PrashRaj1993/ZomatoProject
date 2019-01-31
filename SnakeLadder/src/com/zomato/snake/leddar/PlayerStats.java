package com.zomato.snake.leddar;

import java.util.List;

import com.zomato.modal.Player;

public class PlayerStats {
	
	private int numOfPlayer = 2;
	
	private List<Player> players;
	
	//private Player currentPlayer = players.iterator().next();
	
	/**
	 * @return the numOfPlayer
	 */
	public int getNumOfPlayer() {
		return numOfPlayer;
	}

	/**
	 * @param numOfPlayer the numOfPlayer to set
	 */
	public void setNumOfPlayer(int numOfPlayer) {
		this.numOfPlayer = numOfPlayer;
	}

	/**
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public PlayerStats(int numOfPlayer,List<Player> playerList) {
		this.numOfPlayer = numOfPlayer; 
		players = playerList;
	}
	

}
