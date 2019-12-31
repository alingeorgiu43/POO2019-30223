package javaproj.chess.pieces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

import javaproj.chess.board.Board;
import javaproj.chess.board.BoardUtils;
import javaproj.chess.board.Move;
import javaproj.chess.board.Tile;
import javaproj.chess.pieces.Piece.PieceType;

public class King extends Piece {

	private final static int[] CANDIDATE_MOVE_COORDINATE = { -9, -8, -7, -1, 1, 7, 8, 9 };

	public King(int piecePosition, Alliance pieceAlliance) {
		super(piecePosition, pieceAlliance);
	}

	@Override
	public Collection<Move> calculateLegalMoves(Board board) {

		final List<Move> legalMoves = new ArrayList<>();

		for (int currentCandidateOffset : CANDIDATE_MOVE_COORDINATE) {

			int candidateDestinationCoordinate = this.piecePosition + currentCandidateOffset;

			if (isEighthColumnExclusion(this.piecePosition, currentCandidateOffset)
					|| isEighthColumnExclusion(this.piecePosition, currentCandidateOffset)) {
				continue;
			}

			if (BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {
				final Tile candidateDestionationTile = board.getTile(candidateDestinationCoordinate);
				if (!candidateDestionationTile.isTileOccupied()) {
					legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
				} else {
					final Piece pieceAtDestination = candidateDestionationTile.getPiece();
					final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();
					if (this.pieceAlliance != pieceAlliance) {
						legalMoves.add(
								new Move.AttackMove(board, this, candidateDestinationCoordinate, pieceAtDestination));
					}
				}
			}
		}

		//return ImmutableList.copyOf(legalMoves);
		 return Collections.unmodifiableList(legalMoves);
	}

	private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.FIRST_COLUMN[currentPosition]
				&& ((candidateOffset == -9) || (candidateOffset == -1) || (candidateOffset == 7));

	}

	private static boolean isEighthColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.EIGHTH_COLUMN[currentPosition]
				&& ((candidateOffset == -7) || (candidateOffset == 1) || (candidateOffset == 9));
	}
	
	@Override
	public String toString() {
		return 	PieceType.KING.toString();
	}

}
