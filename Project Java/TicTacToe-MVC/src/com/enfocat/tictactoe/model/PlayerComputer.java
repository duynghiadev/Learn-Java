package com.enfocat.tictactoe.model;

import java.util.Arrays;
import java.util.Random;

public class PlayerComputer extends Player {

	private GameBoard startBoard;
	private GameBoard currentBoard;
	private int[] evaluationBoard = new int[9];
	private Random random = new Random();
	private int computerValue = 2;

	public PlayerComputer(String name) {
		super(name);
		this.startBoard = new GameBoard();
		this.currentBoard = new GameBoard();
	}

	// function that decides what is the best move
	// using Monte Carlo simulations
	@Override
	public int move(int fakePosition) {
		int result;
		Arrays.fill(this.evaluationBoard, 0);

		this.simulate(1000);
		result = this.maxIndex();

		return result;
	}

	// copies board of the game
	public void takeBoard(GameBoard board) {
		this.startBoard.setCopyOf(board);
		this.currentBoard.setCopyOf(board);
	}

	// evaluates current board
	void evaluate(int winner, int player) {
		for (int i = 0; i < this.evaluationBoard.length; i++) {
			if (winner != 0) // if somebody wins
			{
				if (this.startBoard.getValueAt(i) != 0) {
					this.evaluationBoard[i] -= 30;
				} else if (player == winner) {
					if (this.currentBoard.getValueAt(i) == player) {
						this.evaluationBoard[i] += 10;
					} else if (this.currentBoard.getValueAt(i) != 0) {
						this.evaluationBoard[i] -= 20;
					}
				} else if (player != winner) {
					if (this.currentBoard.getValueAt(i) == player) {
						this.evaluationBoard[i] -= 10;
					} else if (this.currentBoard.getValueAt(i) != 0) {
						this.evaluationBoard[i] += 20;
					}
				}
			} else // if there are no winners
			{
				if (this.startBoard.getValueAt(i) == 0) {
					this.evaluationBoard[i] += this.random.nextInt(3);
				}
			}
		}
	}

	// simulation of the game
	private void simulate(int number) {
		int move;
		boolean end;
		int player;

		// play the game from the current board given number of times
		for (int i = 0; i < number; i++) {
			player = 1;
			end = false;
			do {
				boolean isFree = false;
				do {
					// generate a random move
					move = this.random.nextInt(9);
					if (this.currentBoard.getValueAt(move) == 0) {
						isFree = true;

						// make a move if it is possible
						this.currentBoard.setValue(move, player);

						// change the current player
						player = 3 - player;
					}
				} while (!isFree);

				// in the end of each game evaluate the board
				if (this.currentBoard.lookForWinner() != 0) {
					end = true;
					this.evaluate(this.currentBoard.lookForWinner(), this.computerValue);
				} else if (this.currentBoard.isFull()) {
					end = true;
					this.evaluate(0, this.computerValue);
				}
			} while (!end);

			// reload the current board
			this.currentBoard.setCopyOf(this.startBoard);
		}
	}

	// find the index of the max value in the evaluation board
	private int maxIndex() {
		int result = 0;
		for (int i = 1; i < this.evaluationBoard.length; i++) {
			if (this.evaluationBoard[i] > this.evaluationBoard[result]) {
				result = i;
			}
		}
		return result;
	}
}
