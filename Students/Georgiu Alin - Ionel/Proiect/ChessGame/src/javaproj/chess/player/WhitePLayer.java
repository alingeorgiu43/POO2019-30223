package javaproj.chess.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javaproj.chess.board.Board;
import javaproj.chess.board.Move;
import javaproj.chess.board.Tile;
import javaproj.chess.pieces.Alliance;
import javaproj.chess.pieces.Piece;
import javaproj.chess.pieces.Rook;

public class WhitePLayer extends Player {

	public WhitePLayer(Board board, Collection<Move> whiteStandardLegalMoves,
			Collection<Move> blackStandardLegalMoves) {

		super(board, whiteStandardLegalMoves, blackStandardLegalMoves);

	}

	@Override
	public Collection<Piece> getActivePieces() {

		return this.board.getWhitePieces();
	}

	@Override
	public Alliance getAlliance() {
		return Alliance.WHITE;
	}

	public Player getOpponent() {
		return this.board.whitePlayer();
	}
}
