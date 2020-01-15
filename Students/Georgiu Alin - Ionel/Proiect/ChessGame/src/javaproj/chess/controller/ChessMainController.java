package javaproj.chess.controller;

import javaproj.chess.board.Board;
/**
 * Bibliografie
 * https://medium.com/@abhinav.sagar/how-to-write-a-chess-game-from-scratch-in-java-e14c69161493
 * https://www.geeksforgeeks.org/design-a-chess-game/
 * https://codereview.stackexchange.com/questions/71790/design-a-chess-game-using-object-oriented-principles
 * https://github.com/amir650/BlackWidow-Chess/tree/master/art/fancy
 */
import javaproj.chess.gui.Table;

public class ChessMainController {

	public static void main(String[] args) {
		Table.get().show();
		Board board = Board.createStandardBoard();
		System.out.println(board);
	}
}
