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

public class Bishop extends Piece {
	private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = { -9, -7, 7, 9 };

	public Bishop(int piecePosition, Alliance pieceAlliance, boolean isFirstMove) {
		super(piecePosition, pieceAlliance, PieceType.BISHOP, isFirstMove);
	}

	public Bishop(int piecePosition, Alliance alliance) {
		super(piecePosition, alliance, PieceType.BISHOP, true);
	}

	@Override
	public Collection<Move> calculateLegalMoves(Board board) {

		final List<Move> legalMoves = new ArrayList<>();

		for (final int candidateCoordinateOffset : CANDIDATE_MOVE_VECTOR_COORDINATES) {
			int candidateDestinationCoordinate = this.piecePosition;
			while (BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {

				if (isFirstColumnExclusion(candidateCoordinateOffset, candidateDestinationCoordinate)
						|| isEighthColumnExclusion(candidateCoordinateOffset, candidateDestinationCoordinate)) {
					break;
				}
				candidateDestinationCoordinate += candidateCoordinateOffset;

				if (BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {

					final Tile candidateDestionationTile = board.getTile(candidateDestinationCoordinate);
					if (!candidateDestionationTile.isTileOccupied()) {
						legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
					} else {
						final Piece pieceAtDestination = candidateDestionationTile.getPiece();
						final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();
						if (this.pieceAlliance != pieceAlliance) {
							legalMoves.add(new Move.AttackMove(board, this, candidateDestinationCoordinate,
									pieceAtDestination));
						}
						break;
					}
				}
			}
		}
		return Collections.unmodifiableList(legalMoves);
	}
	private static boolean isFirstColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.FIRST_COLUMN[candidateOffset] && (currentPosition == -9 || currentPosition == 7);
	}

	private static boolean isEighthColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.EIGHTH_COLUMN[candidateOffset] && (currentPosition == -7 || currentPosition == 9);
	}

	@Override
	public String toString() {
		return PieceType.BISHOP.toString();
	}

	@Override
	public Bishop movePiece(Move move) {
		return new Bishop(move.getDestinationCoordinate(), move.getMovedPiece().getPieceAlliance());
	}

}
