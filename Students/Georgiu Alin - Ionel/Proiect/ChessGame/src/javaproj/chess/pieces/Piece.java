package javaproj.chess.pieces;

import java.util.Collection;

import javaproj.chess.board.Board;
import javaproj.chess.board.Move;

public abstract class Piece {

	protected final int piecePosition;
	protected final Alliance pieceAlliance;
	protected final boolean isFirstMove;
	protected final PieceType pieceType;
	private final int cachedHashCode;

	Piece(final int piecePosition, final Alliance pieceAlliance, PieceType pieceType) {
		this.piecePosition = piecePosition;
		this.pieceAlliance = pieceAlliance;
		// to do work here
		this.isFirstMove = false;
		this.pieceType = pieceType;
		this.cachedHashCode = computeHashCode();
	}

	private int computeHashCode() {

		int result = pieceType.hashCode();
		result = 31 * result + pieceAlliance.hashCode();
		result = 31 * result + piecePosition;
		result = 31 * result + (isFirstMove ? 1 : 0);
		return result;
	}

	@Override
	public boolean equals(Object other) {

		if (this == other) {
			return true;
		}
		if (!(other instanceof Piece)) {
			return false;
		}
		Piece otherPiece = (Piece) other;
		return piecePosition == otherPiece.getPiecePosition() && pieceType == otherPiece.getPieceType()
				&& pieceAlliance == otherPiece.getPieceAlliance() && isFirstMove == otherPiece.isFirstMove();
	}

	@Override
	public int hashCode() {

		return this.cachedHashCode;
	}

	public abstract Collection<Move> calculateLegalMoves(final Board board);

	public abstract Piece movePiece(Move move);

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

			@Override
			public boolean isRook() {
				return false;
			}
		},
		KNIGHT("N") {
			@Override
			public boolean isKing() {
				return false;
			}
			@Override
			public boolean isRook() {
				return false;
			}
		},
		BISHOP("B") {
			@Override
			public boolean isKing() {
				return false;
			}
			@Override
			public boolean isRook() {
				return false;
			}
		},
		ROOK("R") {
			@Override
			public boolean isKing() {
				return false;
			}
			@Override
			public boolean isRook() {
				return true;
			}
		},
		QUEEN("Q") {
			@Override
			public boolean isKing() {
				return true;
			}
			@Override
			public boolean isRook() {
				return false;
			}
		},
		KING("K") {
			@Override
			public boolean isKing() {
				return false;
			}
			@Override
			public boolean isRook() {
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
		
		public abstract boolean isRook();
		
	}
}
