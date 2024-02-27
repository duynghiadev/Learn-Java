package com.enfocat.tictactoe.view;

import com.enfocat.tictactoe.controller.*;
import com.enfocat.tictactoe.model.GameBoard;

public interface VisualInterface {
	void setController(GameController c);

	void start();

	void update(GameBoard map);

	void updateCurrentPlayer(String name);

	void draw(GameBoard map);

	void error(String message);

	void congrats(String name);

	void finalWords();

	void newGame();

	String getNamePlayerOne();

	String getNamePlayerTwo();

	// constants for commands support
	final static String NEW_GAME = "NG";
	final static String ONE_PLAYER_GAME = "Start PvC";
	final static String TWO_PLAYERS_GAME = "Start PvP";
}
