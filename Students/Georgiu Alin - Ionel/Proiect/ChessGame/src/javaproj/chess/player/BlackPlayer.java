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

	@Override
	protected Collection<Move> calculateKingCastles(Collection<Move> playerLegals, Collection<Move> opponentLegals) {
		List<Move> kingCastles = new ArrayList<>();

		if (this.playerKing.isFirstMove() && !this.isInCheck()) {

			if (!this.board.getTile(5).isTileOccupied() && !this.board.getTile(6).isTileOccupied()) {
				// black king side castle
				Tile rookTile = this.board.getTile(7);
				if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()) {
					// TO DO a CastleMove
					if (Player.calculateAttacksOnTile(5, opponentLegals).isEmpty()
							&& Player.calculateAttacksOnTile(6, opponentLegals).isEmpty()
							&& rookTile.getPiece().getPieceType().isRook()) {

						kingCastles.add(new Move.KingSideCastleMove(this.board, this.playerKing, 6,
								(Rook) rookTile.getPiece(), rookTile.getTileCoordinate(), 5));
					}

				}
			}
			if (!this.board.getTile(1).isTileOccupied() && !this.board.getTile(2).isTileOccupied()
					&& !this.board.getTile(3).isTileOccupied()) {
				Tile rookTile = this.board.getTile(0);
				if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()) {
					kingCastles.add(new Move.QueenSideCastleMove(this.board, this.playerKing, 2,
							(Rook) rookTile.getPiece(), rookTile.getTileCoordinate(), 3));
				}
			}
		}

		return Collections.unmodifiableList(kingCastles);
	}

}
