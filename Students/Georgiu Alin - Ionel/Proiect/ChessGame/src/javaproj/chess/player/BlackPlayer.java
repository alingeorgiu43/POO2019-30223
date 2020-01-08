package javaproj.chess.player;

import java.util.Collection;
import javaproj.chess.board.Board;
import javaproj.chess.board.Move;
import javaproj.chess.pieces.Alliance;
import javaproj.chess.pieces.Piece;

public class BlackPlayer extends Player {

	public BlackPlayer(Board board, Collection<Move> whiteStandardLegalMoves,
			Collection<Move> blackStandardLegalMoves) {
		super(board, blackStandardLegalMoves, whiteStandardLegalMoves);

	}

	@Override
	public Collection<Piece> getActivePieces() {

		return this.board.getBlackPieces();
	}

	@Override
	public Alliance getAlliance() {
		return Alliance.BLACK;
	}

	public Player getOpponent() {
		return this.board.blackPlayer();
	}

}
