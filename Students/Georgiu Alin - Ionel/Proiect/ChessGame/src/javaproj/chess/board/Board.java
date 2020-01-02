package javaproj.chess.board;

import java.util.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableList;

import javaproj.chess.pieces.*;
import javaproj.chess.player.BlackPlayer;
import javaproj.chess.player.Player;
import javaproj.chess.player.WhitePLayer;

public class Board {

	private List<Tile> gameBoard;
	private final Collection<Piece> whitePieces;
	private final Collection<Piece> blackPieces;
	private final WhitePLayer whitePlayer;
	private final BlackPlayer blackPlayer;
	private final Player currentPlayer;

	public Board(Builder builder) {
		this.gameBoard = createGameBoard(builder);
		this.whitePieces = calculateActivePieces(this.gameBoard, Alliance.WHITE);
		this.blackPieces = calculateActivePieces(this.gameBoard, Alliance.BLACK);
		final Collection<Move> whiteStandardLegalMoves = calculateLegalMoves(this.whitePieces);
		final Collection<Move> blackStandardLegalMoves = calculateLegalMoves(this.blackPieces);
		this.whitePlayer = new WhitePLayer(this, whiteStandardLegalMoves, blackStandardLegalMoves);
		this.blackPlayer = new BlackPlayer(this, whiteStandardLegalMoves, blackStandardLegalMoves);
		this.currentPlayer = null;
	}

	private Collection<Move> calculateLegalMoves(Collection<Piece> pieces) {

		List<Move> legalMoves = new ArrayList<>();
		for (Piece piece : pieces) {
			legalMoves.addAll(piece.calculateLegalMoves(this));
		}

		// return ImmutableList.copyOf(legalMoves);
		return Collections.unmodifiableList(legalMoves);
	}

	private static Collection<Piece> calculateActivePieces(final List<Tile> gameBoard, final Alliance alliance) {

		List<Piece> activePieces = new ArrayList<>();
		for (final Tile tile : gameBoard) {
			if (tile.isTileOccupied()) {
				final Piece piece = tile.getPiece();
				if (piece.getPieceAlliance() == alliance) {
					activePieces.add(piece);
				}
			}
		}
		// return ImmutableList.copyOf(activePieces);
		return Collections.unmodifiableList(activePieces);
	}

	public Collection<Piece> getBlackPieces() {
		return this.blackPieces;
	}

	public Collection<Piece> getWhitePieces() {
		return this.whitePieces;
	}

	private static List<Tile> createGameBoard(Builder builder) {

		// Tile[] tiles = new Tile[BoardUtils.NUM_TILES];
		List<Tile> tiles = new ArrayList<>();
		for (int i = 0; i < BoardUtils.NUM_TILES; i++) {

			tiles.add(Tile.createTile(i, builder.boardConfig.get(i)));
		}
		return Collections.unmodifiableList(tiles);
	}

	public Tile getTile(final int tileCoordinate) {
		return gameBoard.get(tileCoordinate);
	}

	public Player whitePlayer() {
		return this.whitePlayer;
	}

	public Player currentPlayer() {
		return this.currentPlayer;
	}

	public Player blackPlayer() {
		return this.blackPlayer;
	}

	public static Board createStandardBoard() {
		final Builder builder = new Builder();
		// BlackLayout
		builder.setPiece(new Rook(0, Alliance.BLACK));
		builder.setPiece(new Knight(1, Alliance.BLACK));
		builder.setPiece(new Bishop(2, Alliance.BLACK));
		builder.setPiece(new Queen(3, Alliance.BLACK));
		builder.setPiece(new King(4, Alliance.BLACK));
		builder.setPiece(new Bishop(5, Alliance.BLACK));
		builder.setPiece(new Knight(6, Alliance.BLACK));
		builder.setPiece(new Rook(7, Alliance.BLACK));
		builder.setPiece(new Pawn(8, Alliance.BLACK));
		builder.setPiece(new Pawn(9, Alliance.BLACK));
		builder.setPiece(new Pawn(10, Alliance.BLACK));
		builder.setPiece(new Pawn(11, Alliance.BLACK));
		builder.setPiece(new Pawn(12, Alliance.BLACK));
		builder.setPiece(new Pawn(13, Alliance.BLACK));
		builder.setPiece(new Pawn(14, Alliance.BLACK));
		builder.setPiece(new Pawn(15, Alliance.BLACK));
		// WhiteLayout
		builder.setPiece(new Pawn(48, Alliance.WHITE));
		builder.setPiece(new Pawn(49, Alliance.WHITE));
		builder.setPiece(new Pawn(50, Alliance.WHITE));
		builder.setPiece(new Pawn(51, Alliance.WHITE));
		builder.setPiece(new Pawn(52, Alliance.WHITE));
		builder.setPiece(new Pawn(53, Alliance.WHITE));
		builder.setPiece(new Pawn(54, Alliance.WHITE));
		builder.setPiece(new Pawn(55, Alliance.WHITE));
		builder.setPiece(new Rook(56, Alliance.WHITE));
		builder.setPiece(new Knight(57, Alliance.WHITE));
		builder.setPiece(new Bishop(58, Alliance.WHITE));
		builder.setPiece(new Queen(59, Alliance.WHITE));
		builder.setPiece(new King(60, Alliance.WHITE));
		builder.setPiece(new Bishop(61, Alliance.WHITE));
		builder.setPiece(new Knight(62, Alliance.WHITE));
		builder.setPiece(new Rook(63, Alliance.WHITE));

		builder.setMoveMaker(Alliance.WHITE);
		return builder.build();

	}

	public static class Builder {

		Map<Integer, Piece> boardConfig;
		Alliance nextMoveMaker;

		public Builder() {
			this.boardConfig = new HashMap<>();
		}

		public Builder setPiece(Piece piece) {
			this.boardConfig.put(piece.getPiecePosition(), piece);
			return this;

		}

		public Builder setMoveMaker(Alliance nextMoveMaker) {
			this.nextMoveMaker = nextMoveMaker;
			return this;
		}

		public Board build() {
			return new Board(this);
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < BoardUtils.NUM_TILES; i++) {
			String tileText = this.gameBoard.get(i).toString();
			builder.append(String.format("%3s", tileText));
			if ((i + 1) % BoardUtils.NUM_TILES_PER_ROW == 0) {
				builder.append("\n");
			}
		}
		return builder.toString();

	}

}
