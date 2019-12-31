package javaproj.chess.pieces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

import javaproj.chess.board.Board;
import javaproj.chess.board.Move;
import javaproj.chess.board.Tile;
import javaproj.chess.pieces.Piece.PieceType;
import javaproj.chess.board.BoardUtils;

public class Knight extends Piece {

	private final static int[] CANDIDATE_MOVE_COORDINATES = { -17, -15, -10, -6, 6, 10, 15, 17 };

	public Knight(final int piecePosition, final Alliance pieceAlliance) {
		super(piecePosition, pieceAlliance);
	}

	@Override
	public Collection<Move> calculateLegalMoves(Board board) {

		final List<Move> legalMoves = new ArrayList<>();

		for (final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATES) {
			int candidateDestionationCoordinate = this.piecePosition + currentCandidateOffset;

			if (BoardUtils.isValidTileCoordinate(candidateDestionationCoordinate)) {

				if (isFirstColumnExclusion(this.piecePosition, currentCandidateOffset)
						|| isSecondColumnExclusion(this.piecePosition, currentCandidateOffset)
						|| isSeventhColumnExclusion(this.piecePosition, currentCandidateOffset)
						|| isEighthColumnExclusion(this.piecePosition, currentCandidateOffset)) {
					continue;
				}

				final Tile candidateDestionationTile = board.getTile(candidateDestionationCoordinate);
				if (!candidateDestionationTile.isTileOccupied()) {
					legalMoves.add(new Move.MajorMove(board, this, candidateDestionationCoordinate));
				} else {
					final Piece pieceAtDestination = candidateDestionationTile.getPiece();
					final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();
					if (this.pieceAlliance != pieceAlliance) {
						legalMoves.add(
								new Move.AttackMove(board, this, candidateDestionationCoordinate, pieceAtDestination));
					}
				}
			}
		}
		//return ImmutableList.copyOf(legalMoves);
		 return Collections.unmodifiableList(legalMoves);
	}

	private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.FIRST_COLUMN[currentPosition] && ((candidateOffset == -17) || (candidateOffset == -10)
				|| (candidateOffset == 6) || (candidateOffset == 15));

	}

	private static boolean isSecondColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.SECOND_COLUMN[currentPosition] && ((candidateOffset == -10) || (candidateOffset == 6));
	}

	private static boolean isSeventhColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.SEVENTH_COLUMN[currentPosition] && ((candidateOffset == -6) || (candidateOffset == 10));
	}

	private static boolean isEighthColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.EIGHTH_COLUMN[currentPosition] && ((candidateOffset == -15) || (candidateOffset == -6)
				|| (candidateOffset == 17) || (candidateOffset == 10));
	}
	
	@Override
	public String toString() {
		return 	PieceType.KNIGHT.toString();
	}
}
