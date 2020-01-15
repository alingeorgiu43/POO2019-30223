package javaproj.chess.pieces;

import java.util.Collection;
import javaproj.chess.board.Board;
import javaproj.chess.board.Move;

/**
 * 
 * Clasa Piece este abstracta si va fi mostenita de fiecare clasa care descrie piesele de sah
 * Clasa stabileste:
 *  -piecePosition: pozitia piesei pe tabla ce este calculata precum pentru o matrice 8x8 si poate avea valori intre 0 si 63
 *  -pieceAlliance: culoarea piesei 
 *  -isFirstMove: daca este prima mutare a piesei respective 
 *  -pieceType: tipul piecei care va fi descris printr-un enum unde sunt implementate toate tipurile de piese si metode care returneaza daca sunt de un anume tip 
 *  -cachedHashCode: pentru fiecare piesa s-a stabilit un cod unic prin functia computeHashCode() la crearea tablei de sah 
 *  @author Alin
 */

public abstract class Piece {
	protected final int piecePosition;
	protected final Alliance pieceAlliance;
	protected final boolean isFirstMove;
	protected final PieceType pieceType;
	private final int cachedHashCode;

	Piece(final int piecePosition, final Alliance pieceAlliance, PieceType pieceType,boolean isFirstMove) {
		this.piecePosition = piecePosition;
		this.pieceAlliance = pieceAlliance;
		this.isFirstMove = isFirstMove;
		this.pieceType = pieceType;
		this.cachedHashCode = computeHashCode();
	}

	private int computeHashCode() {
		int result = this.pieceType.hashCode();
        result = 31 * result + this.pieceAlliance.hashCode();
        result = 31 * result + this.piecePosition;
        result = 31 * result + (this.isFirstMove ? 1 : 0);
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
	public abstract Collection<Move> calculateLegalMoves(final Board board);
	public abstract Piece movePiece(Move move);

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

			@Override
			public boolean isPawn() {
				return true;
			}

			@Override
			public boolean isBishop() {
				return false;
			}

			@Override
			public boolean isKnight() {
				return false;
			}

			@Override
			public boolean isQueen() {
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
			@Override
			public boolean isPawn() {
				return false;
			}
			@Override
			public boolean isBishop() {
				return false;
			}
			@Override
			public boolean isKnight() {
				return true;
			}
			@Override
			public boolean isQueen() {
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
			@Override
			public boolean isPawn() {
				return false;
			}
			@Override
			public boolean isBishop() {
				return true;
			}
			@Override
			public boolean isKnight() {
				return false;
			}
			@Override
			public boolean isQueen() {
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
			@Override
			public boolean isPawn() {
				return false;
			}
			@Override
			public boolean isBishop() {
				return false;
			}
			@Override
			public boolean isKnight() {
				return false;
			}
			@Override
			public boolean isQueen() {
				return false;
			}
		},
		QUEEN("Q") {
			@Override
			public boolean isKing() {
				return false;
			}
			@Override
			public boolean isRook() {
				return false;
			}
			@Override
			public boolean isPawn() {
				return false;
			}
			@Override
			public boolean isBishop() {
				return false;
			}
			@Override
			public boolean isKnight() {
				return false;
			}
			@Override
			public boolean isQueen() {
				return true;
			}
		},
		KING("K") {
			@Override
			public boolean isKing() {
				return true;
			}
			@Override
			public boolean isRook() {
				return false;
			}
			@Override
			public boolean isPawn() {
				return false;
			}
			@Override
			public boolean isBishop() {
				return false;
			}
			@Override
			public boolean isKnight() {
				return false;
			}
			@Override
			public boolean isQueen() {
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
		 public abstract boolean isPawn();
	     public abstract boolean isBishop();
	     public abstract boolean isRook();
	     public abstract boolean isKing();
	     public abstract boolean isKnight();
	     public abstract boolean isQueen();
	}
}
