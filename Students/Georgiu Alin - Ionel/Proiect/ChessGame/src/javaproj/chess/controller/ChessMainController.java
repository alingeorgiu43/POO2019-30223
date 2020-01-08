package javaproj.chess.controller;

import javaproj.chess.board.Board;
import javaproj.chess.gui.Table;

public class ChessMainController {

	public static void main(String[] args) {
		Table.get().show();
		Board board = Board.createStandardBoard();
		System.out.println(board);
	}
}
