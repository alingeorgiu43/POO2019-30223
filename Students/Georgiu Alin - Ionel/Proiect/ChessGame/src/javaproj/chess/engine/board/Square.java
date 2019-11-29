package javaproj.chess.engine.board;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javaproj.chess.engine.pieces.Piece;

public abstract class Square {
	protected final int squareCoordinate;
	private static final Map<Integer, EmptySquare> EMPTY_SQUARES = createAllPossibleEmptySquares();

	protected Square(int squareCoordinate) {
		this.squareCoordinate = squareCoordinate;
	}

	private static Map<Integer, EmptySquare> createAllPossibleEmptySquares() {
		final Map<Integer, EmptySquare> emptySquareMap = new HashMap<>();
		for (int i = 0; i < 64; i++) {
			emptySquareMap.put(i, new EmptySquare(i));
		}
		Collections.unmodifiableMap(emptySquareMap);
		return emptySquareMap;
		// return ImmutableMap.copyOf(emptySquareMap);
	}

	public static Square createSquare(final int squareCoordinate, final Piece piece) {
		if (piece != null)
			return new OccupiedSquare(squareCoordinate, piece);
		else
			return EMPTY_SQUARES.get(squareCoordinate);
	}

	public abstract boolean isSquareOccupied();

	public abstract Piece getPiece();

	public static final class EmptySquare extends Square {
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

}
