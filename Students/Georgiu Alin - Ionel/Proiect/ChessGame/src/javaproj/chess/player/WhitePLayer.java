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

	@Override
	protected Collection<Move> calculateKingCastles(Collection<Move> playerLegals, Collection<Move> opponentLegals) {

		List<Move> kingCastles = new ArrayList<>();

		if (this.playerKing.isFirstMove() && !this.isInCheck()) {

			if (!this.board.getTile(61).isTileOccupied() && !this.board.getTile(62).isTileOccupied()) {
				// white king side castle
				Tile rookTile = this.board.getTile(63);
				if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()) {
					if (Player.calculateAttacksOnTile(61, opponentLegals).isEmpty()
							&& Player.calculateAttacksOnTile(62, opponentLegals).isEmpty()
							&& rookTile.getPiece().getPieceType().isRook()) {

						kingCastles.add(new Move.KingSideCastleMove(this.board, this.playerKing, 62,
								(Rook) rookTile.getPiece(), rookTile.getTileCoordinate(), 61));
					}

				}
			}
			if (!this.board.getTile(59).isTileOccupied() && !this.board.getTile(58).isTileOccupied()
					&& !this.board.getTile(57).isTileOccupied()) {
				Tile rookTile = this.board.getTile(56);
				if (rookTile.isTileOccupied() && rookTile.getPiece().isFirstMove()) {
					kingCastles.add(new Move.QueenSideCastleMove(this.board, this.playerKing, 58,
							(Rook) rookTile.getPiece(), rookTile.getTileCoordinate(), 59));
				}
			}
		}

		return Collections.unmodifiableList(kingCastles);
	}

}
