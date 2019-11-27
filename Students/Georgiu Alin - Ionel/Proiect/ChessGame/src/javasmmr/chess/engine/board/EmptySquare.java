package javasmmr.chess.engine.board;

import javasmmr.chess.engine.pieces.Piece;

public final class EmptySquare extends Square {
	EmptySquare(final int coordinate) {
		super(coordinate);
	}

	@Override
	public boolean isSquareOccupied() {
		return false;
	}

	@Override
	public Piece getPiece() {
		return null;
	}
}