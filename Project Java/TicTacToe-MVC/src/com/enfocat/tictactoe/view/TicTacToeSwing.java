package com.enfocat.tictactoe.view;

import javax.swing.JFrame;

import com.enfocat.tictactoe.controller.GameController;
import com.enfocat.tictactoe.model.GameBoard;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TicTacToeSwing extends JFrame implements VisualInterface {
	private JTextField playerOne;
	private JTextField playerTwo;
	private JButton btnPlayerVsComputer;
	private JButton btnPlayerVsPlayer;
	private JLabel lableOne;
	private JLabel lableTwo;
	private JLabel lableThree;
	private JButton[] buttons;
	private JButton newGame;

	final static int SIZE_OF_BUTTON = 125;

	private String currentPlayer;
	private boolean flagTheEnd;

	public TicTacToeSwing() {
		super("Tic Tac Toe");
		getContentPane().setLayout(null);
		setPreferredSize(new Dimension(470, 350));
		setResizable(false);

		btnPlayerVsComputer = new JButton("Player vs Computer");
		btnPlayerVsComputer.setBounds(50, 190, 150, 70);
		btnPlayerVsComputer.setActionCommand(VisualInterface.ONE_PLAYER_GAME);
		getContentPane().add(btnPlayerVsComputer);

		btnPlayerVsPlayer = new JButton("Player vs Player");
		btnPlayerVsPlayer.setBounds(250, 190, 150, 70);
		btnPlayerVsPlayer.setActionCommand(VisualInterface.TWO_PLAYERS_GAME);
		getContentPane().add(btnPlayerVsPlayer);

		newGame = new JButton("New Game");
		newGame.setBounds(480 / 2 - 75, 470, 150, 70);
		newGame.setActionCommand(VisualInterface.NEW_GAME);
		getContentPane().add(newGame);

		playerOne = new JTextField();
		playerOne.setText("Player 1");
		playerOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		playerOne.setBounds(50, 40, 350, 35);
		getContentPane().add(playerOne);
		playerOne.setColumns(10);

		playerTwo = new JTextField();
		playerTwo.setText("Player 2");
		playerTwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		playerTwo.setColumns(10);
		playerTwo.setBounds(50, 125, 350, 35);
		getContentPane().add(playerTwo);

		lableOne = new JLabel("Name of the first player:");
		lableOne.setHorizontalAlignment(SwingConstants.CENTER);
		lableOne.setHorizontalTextPosition(SwingConstants.CENTER);
		lableOne.setBounds(50, 15, 350, 14);
		getContentPane().add(lableOne);

		lableTwo = new JLabel("Name of the second player:");
		lableTwo.setHorizontalTextPosition(SwingConstants.CENTER);
		lableTwo.setHorizontalAlignment(SwingConstants.CENTER);
		lableTwo.setBounds(50, 100, 350, 14);
		getContentPane().add(lableTwo);

		lableThree = new JLabel("Wellcome to the game of Tic Tac Toe!");
		lableThree.setHorizontalTextPosition(SwingConstants.CENTER);
		lableThree.setHorizontalAlignment(SwingConstants.CENTER);
		lableThree.setBounds(0, 30, 480, 25);
		lableThree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lableThree.setVisible(false);
		getContentPane().add(lableThree);

		this.buttons = new JButton[9];
		this.createMap();
	}

	@Override
	public void setController(GameController c) {
		this.btnPlayerVsComputer.addActionListener(c);
		this.btnPlayerVsPlayer.addActionListener(c);
		for (JButton btn : this.buttons) {
			btn.addActionListener(c);
		}
		this.newGame.addActionListener(c);
	}

	@Override
	public void start() {
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void update(GameBoard map) {
		this.draw(map);
		if (!this.flagTheEnd) {
			this.lableThree.setText(this.currentPlayer + ", now is your turn!");
		}
	}

	@Override
	public void error(String message) {
		// it is impossible to get an error here
	}

	@Override
	public void congrats(String name) {
		this.finalActions("Congratulations!!! " + name + " wins!!!");
	}

	@Override
	public void finalWords() {
		this.finalActions("The game  is over! Nobody wins...");
	}

	@Override
	public void newGame() {
		this.btnPlayerVsComputer.setVisible(false);
		this.btnPlayerVsPlayer.setVisible(false);
		this.playerOne.setVisible(false);
		this.playerTwo.setVisible(false);
		this.lableOne.setVisible(false);
		this.lableTwo.setVisible(false);
		lableThree.setVisible(true);
		setMinimumSize(new Dimension(490, 600));
		setLocationRelativeTo(null);
		for (JButton btn : this.buttons) {
			btn.setEnabled(true);
			btn.setVisible(true);
		}
		this.flagTheEnd = false;
	}

	@Override
	public String getNamePlayerOne() {
		return this.playerOne.getText();
	}

	@Override
	public String getNamePlayerTwo() {
		return this.playerTwo.getText();
	}

	@Override
	public void updateCurrentPlayer(String name) {
		this.currentPlayer = name;

	}

	@Override
	public void draw(GameBoard map) {
		for (int i = 0; i < map.length(); i++) {
			this.buttons[i].setText(map.getSymbolAt(i));
		}
	}

	private void createMap() {
		this.buttons = new JButton[9];
		int positionX = 50;
		int positionY = 70;
		for (int i = 0; i < 9; i++) {
			JButton btn = new JButton("");
			btn.setActionCommand(String.valueOf(i + 1));
			btn.setBounds(positionX, positionY, SIZE_OF_BUTTON, SIZE_OF_BUTTON);
			btn.setBackground(Color.WHITE);
			btn.setVisible(false);
			btn.setFont(new Font("Tahoma", Font.BOLD, 72));
			this.buttons[i] = btn;
			getContentPane().add(this.buttons[i]);
			positionX += SIZE_OF_BUTTON;
			if (i % 3 == 2) {
				positionX = 50;
				positionY += SIZE_OF_BUTTON;
			}
		}
	}

	private void finalActions(String text) {
		this.lableThree.setText(text);
		for (JButton btn : this.buttons) {
			btn.setEnabled(false);
		}
		this.flagTheEnd = true;
	}

}
