package com.enfocat.tictactoe.model;

public abstract class Player {
	private String name;

	protected Player(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract int move(int position);
}
