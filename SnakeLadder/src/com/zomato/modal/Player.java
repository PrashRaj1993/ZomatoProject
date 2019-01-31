package com.zomato.modal;

public class Player implements Comparable<Player>{
	
	private String name;
	private int position;
	private int diceVal;
	
	public Player() {
		this.position = -1;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * @return the diceVal
	 */
	public int getDiceVal() {
		return diceVal;
	}

	/**
	 * @param diceVal the diceVal to set
	 */
	public void setDiceVal(int diceVal) {
		this.diceVal = diceVal;
	}

	public Player(int i, String name) {
		// TODO Auto-generated constructor stub
		this.position=i;
		this.name=name;
	}

	public void updatePosition() {
		this.position = this.position + this.diceVal;
	}
	
	@Override
	public int compareTo(Player o) {
		return diceVal - o.diceVal;
	}
}
