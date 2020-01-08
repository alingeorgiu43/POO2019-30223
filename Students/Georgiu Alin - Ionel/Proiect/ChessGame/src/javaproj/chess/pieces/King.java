package javaproj.chess.pieces;

import java.util.ArrayList;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javaproj.chess.board.Board;
import javaproj.chess.board.BoardUtils;
import javaproj.chess.board.Move;
import javaproj.chess.board.Tile;

/**
* 
* @author Alin
* King mosteneste din clasa Piece 
* Implementeaza metoda calculateLegalMoves pentru a calcula toate posibilele mutari pe care piesa le poate face si o alege pe cea mai buna 
* La mutarea piesei se va contrui un nou King, iar cel anterior va fi sters
* isCastled stabileste daca regele a executat miscarea unica Castling sau nu 
*
*/

public class King extends Piece{

	private final static int[] CANDIDATE_MOVE_COORDINATE = { -9, -8, -7, -1, 1, 7, 8, 9 };
	private final boolean isCastled;

	public King(int piecePosition, Alliance pieceAlliance, boolean isFirstMove, boolean isCastled) {
		super(piecePosition, pieceAlliance, PieceType.KING, isFirstMove);
		this.isCastled = isCastled;
	}

	public King(int piecePosition, Alliance pieceAlliance) {
		super(piecePosition, pieceAlliance, PieceType.KING, true);
		this.isCastled = false;
	}

	@Override
	public Collection<Move> calculateLegalMoves(Board board) {
		final List<Move> legalMoves = new ArrayList<>();
		
		for (int currentCandidateOffset : CANDIDATE_MOVE_COORDINATE) {
			if (isFirstColumnExclusion(this.piecePosition, currentCandidateOffset)
					|| isEighthColumnExclusion(this.piecePosition, currentCandidateOffset)) {
				continue;
			}
			int candidateDestinationCoordinate = this.piecePosition + currentCandidateOffset;
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

	public boolean isCastled() {
		return this.isCastled;
	}

	@Override
	public String toString() {
		return PieceType.KING.toString();
	}

	@Override
	public King movePiece(Move move) {
		return new King(move.getDestinationCoordinate(), move.getMovedPiece().getPieceAlliance(), false, false);
	}

	@Override
	public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof King)) {
			return false;
		}
		if (!super.equals(other)) {
			return false;
		}
		final King king = (King) other;
		return isCastled == king.isCastled;
	}

	@Override
	public int hashCode() {
		return (31 * super.hashCode()) + (isCastled ? 1 : 0);
	}

}
