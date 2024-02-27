package com.enfocat.tictactoe.model;

import java.util.Arrays;

public class GameBoard {
	// map of the board
	// 0 - cell is free
	// 1 - cell is occupied by player 1
	// 2 - cell is occupied by player 2
	final private int[] map = new int[9];

	// Elegant method support
	// 0 1 2
	// 3 4 5
	// 6 7 8
	private final int[][] WINNING_COMBINATIONS = {
			// Horizontal
			{ 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
			// Vertical
			{ 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
			// Diagonal
			{ 0, 4, 8 }, { 2, 4, 6 } };

	public GameBoard() {
		this.clearTable();
	}

	// returns length of the map
	public int length() {
		return this.map.length;
	}

	// put the given value to the given position
	public void setValue(int pos, int val) {
		if (pos >= 0 && pos < this.map.length) {
			if (val == 1 || val == 2) {
				this.map[pos] = val;
			}
		}
	}

	// check if there are free places
	public boolean isFull() {
		for (int i = 0; i < this.map.length; i++) {
			if (this.map[i] == 0)
				return false;
		}
		return true;
	}

	// return 0 if nobody wins
	public int lookForWinner() {

		// more elegant code
		return this.winnerElegant();

		// more understandable code
		// return this.winnerBrute();

	}

	// check if given position is free
	public boolean positionIsFree(int position) {
		return this.map[position] == 0;
	}

	// set all values to 0
	public void clearTable() {
		Arrays.fill(this.map, 0);
	}

	// copies values of the map from the other board
	public void setCopyOf(GameBoard table) {
		for (int i = 0; i < this.map.length; i++) {
			this.map[i] = table.getValueAt(i);
		}
	}

	// returns the value at the given position
	public int getValueAt(int position) {
		return this.map[position];
	}

	// returns the symbol at the given position
	public String getSymbolAt(int position) {
		if (this.map[position] == 1) {
			return "X";
		} else if (this.map[position] == 2) {
			return "O";
		} else {
			return "";
		}
	}

	// this code is very simple to understand so
	// I write it to show as example to my classmates
	private int winnerBrute() {
		int result = 0;

		if (map[4] != 0) {
			if ((map[0] == map[4]) && (map[4] == map[8]) || (map[6] == map[4]) && (map[4] == map[2])
					|| (map[1] == map[4]) && (map[4] == map[7]) || (map[3] == map[4]) && (map[4] == map[5])) {
				result = map[4];
			}
		}
		if (map[0] != 0) {
			if ((map[0] == map[1]) && (map[1] == map[2]) || (map[0] == map[3]) && (map[3] == map[6])) {
				result = map[0];
			}
		}
		if (map[8] != 0) {
			if ((map[8] == map[5]) && (map[5] == map[2]) || (map[8] == map[7]) && (map[7] == map[6])) {
				result = map[8];
			}
		}
		return result;
	}

	// this code looks much better
	// but it is more difficult to understand
	private int winnerElegant() {
		int result = 0;
		for (int[] c : this.WINNING_COMBINATIONS) {
			if (this.map[c[0]] != 0) {
				if (map[c[0]] == map[c[1]] && map[c[1]] == map[c[2]])
					return this.map[c[0]];
			}
		}
		return result;
	}

}
