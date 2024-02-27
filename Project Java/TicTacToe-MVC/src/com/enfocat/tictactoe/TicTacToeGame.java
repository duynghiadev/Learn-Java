package com.enfocat.tictactoe;

import com.enfocat.tictactoe.controller.*;
import com.enfocat.tictactoe.model.*;
import com.enfocat.tictactoe.view.*;

public class TicTacToeGame {
	public static void main(String[] args) {
		// model:
		GameLogic model = new GameLogic();

		// view:
		VisualInterface view = new TicTacToeSwing();
		// VisualInterface view = new TicTacToeConsole();

		// controller:
		GameController controller = new GameController(view, model);

		// connect view controller
		view.setController(controller);

		// start to show the view:
		view.start();
	}
}
