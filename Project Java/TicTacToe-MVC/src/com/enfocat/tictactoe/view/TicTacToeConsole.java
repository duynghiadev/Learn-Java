package com.enfocat.tictactoe.view;

import java.awt.event.ActionEvent;
import java.util.Scanner;

import com.enfocat.tictactoe.controller.GameController;
import com.enfocat.tictactoe.model.GameBoard;

public class TicTacToeConsole implements VisualInterface {

	private GameController controller;
	private GameBoard map;
	private String currentPlayer;
	private String namePlayerOne;
	private String namePlayerTwo;
	private Scanner input;

	public TicTacToeConsole() {
		this.map = new GameBoard();
		this.input = new Scanner(System.in);
	}

	// interface implementation
	@Override
	public void setController(GameController c) {
		this.controller = c;
	}

	@Override
	public void start() {
		System.out.println("Welcome to a game of Tic Tac Toe!!!\n");
		int mode = this.askForType();
		if (mode == 1) {
			System.out.print("Enter your name, please: ");
			this.namePlayerOne = this.input.next();
			this.currentPlayer = this.namePlayerOne;
			this.controller.actionPerformed(new ActionEvent(this, 0, VisualInterface.ONE_PLAYER_GAME));
		} else {
			System.out.print("Player 1, enter your name, please: ");
			this.namePlayerOne = this.input.next();
			System.out.print("Player 2, enter your name, please: ");
			this.namePlayerTwo = this.input.next();
			this.currentPlayer = this.namePlayerOne;
			this.controller.actionPerformed(new ActionEvent(this, 0, VisualInterface.TWO_PLAYERS_GAME));
		}
	}

	@Override
	public void update(GameBoard map) {
		this.map.setCopyOf(map);
		;
		this.askForMove();
	}

	@Override
	public void draw(GameBoard map) {
		String tempSimbol;
		for (int i = 0; i < map.length(); i++) {
			// specially for console
			if (map.getSymbolAt(i).equals("")) {
				tempSimbol = "-";
			} else {
				tempSimbol = map.getSymbolAt(i);
			}

			System.out.print(tempSimbol + " ");

			// table support
			if (i % 3 == 2) {
				System.out.println("");
			}
		}
	}

	@Override
	public void error(String message) {
		System.out.println(message);
		this.askForMove();
	}

	@Override
	public void newGame() {
		System.out.println("\nThis is a new game of Tic Tac Toe!!!\n");
		this.map.clearTable();
		this.askForMove();
	}

	@Override
	public String getNamePlayerOne() {
		return this.namePlayerOne;
	}

	@Override
	public String getNamePlayerTwo() {
		return this.namePlayerTwo;
	}

	@Override
	public void congrats(String name) {
		System.out.println("\n\n***********************************");
		System.out.println("***********************************");
		System.out.println("***********************************");
		System.out.println("Congratulations!!! " + name + " wins!!!");
		System.out.println("***********************************");
		System.out.println("***********************************");
		System.out.println("***********************************");
		this.controller.actionPerformed(new ActionEvent(this, 0, VisualInterface.NEW_GAME));
	}

	@Override
	public void finalWords() {
		System.out.println("\n\n***********************************");
		System.out.println("***********************************");
		System.out.println("*The game  is over! Nobody wins...*");
		System.out.println("***********************************");
		System.out.println("***********************************");
		this.controller.actionPerformed(new ActionEvent(this, 0, VisualInterface.NEW_GAME));
	}

	@Override
	public void updateCurrentPlayer(String name) {
		this.currentPlayer = name;
	}

	// private methods
	private void askForMove() {
		this.draw(this.map);
		this.drawTips();
		System.out.println(this.currentPlayer + ", enter the position (NG for a new game): ");
		String position = this.input.next().toUpperCase();
		this.controller.actionPerformed(new ActionEvent(this, 0, position));
	}

	private void drawTips() {
		for (int i = 0; i < map.length(); i++) {
			System.out.print((i + 1) + " ");
			if (i % 3 == 2) {
				System.out.println("");
			}
		}
	}

	private int askForType() {
		this.drawMenu();
		String choise;
		int mode = -1;
		do {
			choise = this.input.next();
			if (choise.equalsIgnoreCase("1")) {
				mode = 1;
			} else if (choise.equalsIgnoreCase("2")) {
				mode = 2;
			} else {
				System.out.print("Enter 1 or 2 please: ");
			}
		} while (!(mode == 2 || mode == 1));
		return mode;
	}

	private void drawMenu() {
		System.out.println("*******Tic Tac Toe*******");
		System.out.println("          Menu:          ");
		System.out.println("(1) - Player vs. Computer ");
		System.out.println("(2) - Player vs. Player ");
		System.out.print("Enter 1 or 2 please: ");
	}

}
