package javasmmr.chess.engine.board;

import javasmmr.chess.engine.pieces.Piece;

public final class OccupiedSquare extends Square {
	private final Piece pieceOnSquare;

	OccupiedSquare(int squareCoordinate, Piece pieceOnSquare) {
		super(squareCoordinate);
		this.pieceOnSquare = pieceOnSquare;
	}

	@Override
	public boolean isSquareOccupied() {
		return true;
	}

	@Override
	public Piece getPiece() {
		return this.pieceOnSquare;
	}
}