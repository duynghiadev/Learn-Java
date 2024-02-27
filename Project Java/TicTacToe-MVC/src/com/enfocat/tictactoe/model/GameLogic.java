package com.enfocat.tictactoe.model;

public class GameLogic {

	// map of the board
	final private GameBoard map = new GameBoard();

	// players
	private PlayerHuman player1;
	private Player player2;
	private int currentPlayer;
	public final static int ONE_PLAYER = 1;
	public final static int TWO_PLAYERS = 2;
	private int mode;

	public GameLogic() {
		this.map.clearTable();
		this.currentPlayer = 1;
	}

	// make a move to a given position
	// in case of computer it will skip position and make his own move
	public void move(int position) {
		switch (this.currentPlayer) {
		case 1:
			// put the value
			this.map.setValue(position, this.currentPlayer);

			// change the player
			this.currentPlayer = 2;
			break;
		case 2:
			// in case of computer
			if (this.mode == GameLogic.ONE_PLAYER) {
				((PlayerComputer) this.player2).takeBoard(this.map);
			}
			int move = player2.move(position);

			// put the value
			this.map.setValue(move, this.currentPlayer);

			// change the player
			this.currentPlayer = 1;
			break;
		}
	}

	// returns the current map of the game
	public GameBoard getMap() {
		return this.map;
	}

	// returns 0 if nobody wins yet
	public int winner() {
		return this.map.lookForWinner();
	}

	// returns the name of the current player
	public String getNameCurrentPlayer() {
		return this.getNameOfPlayer(this.currentPlayer);
	}

	// returns the game of the given player
	public String getNameOfPlayer(int number) {
		if (number == 1) {
			return this.player1.getName();
		} else {
			return this.player2.getName();
		}
	}

	// returns the mode of the game
	// (two players of one player)
	public int getMode() {
		return this.mode;
	}

	// sets the mode of a game and names of the players
	public void startGame(int mode, String nameOne, String nameTwo) {
		this.mode = mode;

		this.player1 = new PlayerHuman(nameOne);
		if (mode == GameLogic.ONE_PLAYER) {
			this.player2 = new PlayerComputer(nameTwo);
		} else {
			this.player2 = new PlayerHuman(nameTwo);
		}
	}

	// starts a new game
	public void newGame() {
		this.map.clearTable();
		this.currentPlayer = 1;
	}

}
