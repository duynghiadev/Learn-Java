package com.enfocat.tictactoe.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.enfocat.tictactoe.model.*;
import com.enfocat.tictactoe.view.*;

public class GameController implements ActionListener {

	private VisualInterface view;
	private GameLogic model;

	public GameController(VisualInterface view, GameLogic model) {
		this.view = view;
		this.model = model;
	}

	// resolve events from the view
	public void actionPerformed(ActionEvent event) {
		// begin a new game
		if (event.getActionCommand().equals(VisualInterface.NEW_GAME)) {
			this.model.newGame();
			this.view.updateCurrentPlayer(this.model.getNameCurrentPlayer());
			this.view.newGame();
		} else if (event.getActionCommand().equals(VisualInterface.ONE_PLAYER_GAME)) {
			this.model.startGame(GameLogic.ONE_PLAYER, this.view.getNamePlayerOne(), "Computer");
			this.view.newGame();
		} else if (event.getActionCommand().equals(VisualInterface.TWO_PLAYERS_GAME)) {
			this.model.startGame(GameLogic.TWO_PLAYERS, this.view.getNamePlayerOne(), this.view.getNamePlayerTwo());
			this.view.newGame();
		} else { // make a move
			try {
				int position = Integer.parseInt(event.getActionCommand());
				if (position > 0 && position <= 9) {
					// make move if it is possible
					if (this.model.getMap().positionIsFree(position - 1)) {
						this.model.move(position - 1);
					} else // position is not free
					{
						String message = "Sorry, this cell is not free. Please, try again.\n";
						this.view.error(message);
					}

					// check if the game is over
					this.gameOver();

					// make extra move for the computer
					if (this.model.getMode() == GameLogic.ONE_PLAYER && !this.model.getMap().isFull()) {
						this.model.move(position - 1);
						// and check again if the game is over
						this.gameOver();
					}

				} else // position is out of bounds
				{
					String message = "Sorry, your index is out of bounds. Please, try again.\n";
					this.view.error(message);
				}

			} catch (NumberFormatException e) {
				String message = "Sorry, your input is incorrect. Please, try again.\n";
				this.view.error(message);
			}
		}
		this.view.updateCurrentPlayer(this.model.getNameCurrentPlayer());
		this.view.update(this.model.getMap());

	}

	// makes actions when game is over
	private void gameOver() {
		if (this.model.winner() == 1) {
			this.view.draw(this.model.getMap());
			this.view.congrats(this.model.getNameOfPlayer(1));

		} else if (this.model.winner() == 2) {
			this.view.draw(this.model.getMap());
			this.view.congrats(this.model.getNameOfPlayer(2));

		} else if (this.model.getMap().isFull()) {
			this.view.draw(this.model.getMap());
			this.view.finalWords();
		}
	}
}
