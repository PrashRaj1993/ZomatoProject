package com.zomato.modal;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	
	private int diceValue;
	public void throwDice() {
		this.diceValue = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	}
	/**
	 * @return the diceValue
	 */
	public int getDiceValue() {
		return diceValue;
	}
	/**
	 * @param diceValue the diceValue to set
	 */
	public void setDiceValue(int diceValue) {
		this.diceValue = diceValue;
	}

}
