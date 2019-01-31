package com.zomato.snake.leddar;

import java.util.ArrayList;
import java.util.List;

import com.zomato.modal.Ladder;
import com.zomato.modal.Snake;

public class Board {
	
	private List<Snake> bitingSnakes;	
	private List<Ladder> ladder;
	
	public Board() {
		initData();
	}

	public Board(List<Snake> s, List<Ladder> l) {
		// TODO Auto-generated constructor stub
		this.bitingSnakes=s;
		this.ladder=l;
	}

	private void initData() {
		this.bitingSnakes = new ArrayList<>();
		this.ladder = new ArrayList<>();
		//TODO Needs to fill the state
	}

}
