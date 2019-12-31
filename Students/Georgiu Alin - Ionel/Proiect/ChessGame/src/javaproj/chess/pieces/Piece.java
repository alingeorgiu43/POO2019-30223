 package javaproj.chess.pieces;

import java.util.Collection;

import javaproj.chess.board.Board;
import javaproj.chess.board.Move;

public abstract class Piece {

	protected final int piecePosition;
	protected final Alliance pieceAlliance;
	protected final boolean isFirstMove;

	Piece(final int piecePosition, final Alliance pieceAlliance) {
		this.piecePosition = piecePosition;
		this.pieceAlliance = pieceAlliance;
		this.isFirstMove = false;
	}

	public abstract Collection<Move> calculateLegalMoves(final Board board);

	public boolean isFirstMove() {
		return this.isFirstMove;
	}

	public Alliance getPieceAlliance() {
		return this.pieceAlliance;
	}

	public int getPiecePosition() {
		return this.piecePosition;
	}

	public enum PieceType {

		PAWN("P"), KNIGHT("N"), BISHOP("B"), ROOK("R"), QUEEN("Q"), KING("K");

		private String pieceName;

		PieceType(String pieceName) {
			this.pieceName = pieceName;
		}

		@Override
		public String toString() {
			return this.pieceName;
		}
	}
}
