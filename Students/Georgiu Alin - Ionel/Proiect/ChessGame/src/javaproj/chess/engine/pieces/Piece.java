package javaproj.chess.engine.pieces;

import java.util.List;

import javaproj.chess.engine.board.Board;
import javaproj.chess.engine.board.Move;

public abstract class Piece {
	protected final int piecePosition;
	protected final Alliance pieceAlliance;

	Piece(int piecePosition, final Alliance pieceAlliance) {
		this.piecePosition = piecePosition;
		this.pieceAlliance = pieceAlliance;
	}

	public abstract List<Move> calculateLegalMoves(final Board board);

}
