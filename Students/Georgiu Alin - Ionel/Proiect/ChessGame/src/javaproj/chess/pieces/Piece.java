package javaproj.chess.pieces;

import java.util.Collection;

import javaproj.chess.board.Board;
import javaproj.chess.board.Move;

public abstract class Piece {

	protected final int piecePosition;
	protected final Alliance pieceAlliance;
	protected final boolean isFirstMove;
	protected final PieceType pieceType;

	Piece(final int piecePosition, final Alliance pieceAlliance, PieceType pieceType) {
		this.piecePosition = piecePosition;
		this.pieceAlliance = pieceAlliance;
		this.isFirstMove = false;
		this.pieceType = pieceType;
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

	public PieceType getPieceType() {
		return this.pieceType;
	}

	public enum PieceType {

		PAWN("P") {
			@Override
			public boolean isKing() {
				return false;
			}
		},
		KNIGHT("N") {
			@Override
			public boolean isKing() {
				return false;
			}
		},
		BISHOP("B") {
			@Override
			public boolean isKing() {
				return false;
			}
		},
		ROOK("R") {
			@Override
			public boolean isKing() {
				return false;
			}
		},
		QUEEN("Q") {
			@Override
			public boolean isKing() {
				return true;
			}
		},
		KING("K") {
			@Override
			public boolean isKing() {
				return false;
			}
		};

		private String pieceName;

		PieceType(String pieceName) {
			this.pieceName = pieceName;
		}

		@Override
		public String toString() {
			return this.pieceName;
		}

		public abstract boolean isKing();
	}
}
