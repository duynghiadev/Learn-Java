package com.enfocat.tictactoe.model;

public class PlayerHuman extends Player {
	public PlayerHuman(String name) {
		super(name);
	}

	@Override
	public int move(int position) {
		return position;
	}
}
