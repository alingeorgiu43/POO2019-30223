package javaproj.chess.pieces;

import java.util.ArrayList;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javaproj.chess.board.Board;
import javaproj.chess.board.BoardUtils;
import javaproj.chess.board.Move;
import javaproj.chess.board.Tile;

public class Queen extends Piece {

	private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = { -9, -8, -7, -1, 1, 7, 8, 9 };

	public Queen(int piecePosition, Alliance pieceAlliance) {
		super(piecePosition, pieceAlliance, PieceType.QUEEN, true);
	}

	public Queen(int piecePosition, Alliance pieceAlliance, boolean isFirstMove) {
		super(piecePosition, pieceAlliance, PieceType.QUEEN, isFirstMove);
	}

	@Override
	public Collection<Move> calculateLegalMoves(Board board) {
		final List<Move> legalMoves = new ArrayList<>();
		for (final int candidateCoordinateOffset : CANDIDATE_MOVE_VECTOR_COORDINATES) {
			int candidateDestinationCoordinate = this.piecePosition;

			while (true) {

				if (isFirstColumnExclusion(candidateCoordinateOffset, candidateDestinationCoordinate)
						|| isEightColumnExclusion(candidateCoordinateOffset, candidateDestinationCoordinate)) {
					break;
				}

				candidateDestinationCoordinate += candidateCoordinateOffset;

				if (!BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {
					break;
				} else {

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
		return BoardUtils.FIRST_COLUMN[candidateOffset]
				&& (currentPosition == -1 || currentPosition == -9 || currentPosition == 7);
	}

	private static boolean isEightColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.EIGHTH_COLUMN[candidateOffset]
				&& (currentPosition == 1 || currentPosition == -7 || currentPosition == 9);
	}

	@Override
	public String toString() {
		return PieceType.QUEEN.toString();
	}

	@Override
	public Queen movePiece(Move move) {

		return new Queen(move.getDestinationCoordinate(), move.getMovedPiece().getPieceAlliance(), false);
	}

}