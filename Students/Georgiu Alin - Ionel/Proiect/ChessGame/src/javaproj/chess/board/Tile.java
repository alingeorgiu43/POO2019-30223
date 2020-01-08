
package javaproj.chess.board;

import java.util.Collections;

import java.util.HashMap;
import java.util.Map;

import javaproj.chess.pieces.Piece;


/**
 * 
 * @author Alin
 * Clasa Tile este clasa pe care am definit-o pentru a reprezenta un patrat al tablei 
 * In aceasta clasa se stabileste daca o anumita locatie este sau nu ocuapta (isTileOccupied),
 * ce piesa se afla pe un patrat al tablei(getPiece),
 * care sunt locatiile libere unde se pot efectua mutari (createAllPossibleEmptyTiles)
 *
 */
public abstract class Tile {
	protected final int titleId;
	private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = createAllPossibleEmptyTiles();

	private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
		final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
		for (int i = 0; i < BoardUtils.NUM_TILES; i++) {
			emptyTileMap.put(i, new EmptyTile(i));
		}
		return Collections.unmodifiableMap(emptyTileMap);
	}

	public static Tile createTile(int tileCoordinate, final Piece piece) {
		if (piece != null) {
			return new OccupiedTile(tileCoordinate, piece);
		} else {
			return EMPTY_TILES_CACHE.get(tileCoordinate);
		}
	}

	public int getTileCoordinate() {
		return this.titleId;
	}

	private Tile(final int tileCoordinate) {
		this.titleId = tileCoordinate;
	}

	public abstract boolean isTileOccupied();
	public abstract Piece getPiece();

	public static final class EmptyTile extends Tile {
		private EmptyTile(final int coordinate) {
			super(coordinate);
		}

		@Override
		public String toString() {
			return "-";
		}

		@Override
		public boolean isTileOccupied() {
			return false;
		}

		@Override
		public Piece getPiece() {
			return null;
		}
	}

	public static final class OccupiedTile extends Tile {

		private final Piece pieceOnTile;

		private OccupiedTile(int tileCoordinate, final Piece pieceOnTile) {
			super(tileCoordinate);
			this.pieceOnTile = pieceOnTile;
		}

		@Override
		public String toString() {

			if (getPiece().getPieceAlliance().isBlack())
				return getPiece().toString().toLowerCase();
			else
				return getPiece().toString();
		}

		@Override
		public boolean isTileOccupied() {
			return true;
		}

		@Override
		public Piece getPiece() {
			return this.pieceOnTile;
		}
	}
}
