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

public class Queen extends Piece {

	private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = { -9, -7, 7, 9 };

	public Queen(int piecePosition, Alliance pieceAlliance) {
		super(piecePosition, pieceAlliance,PieceType.QUEEN);
	}

	@Override
	public Collection<Move> calculateLegalMoves(Board board) {

		final List<Move> legalMoves = new ArrayList<>();

		for (final int candidateCoordinateOffset : CANDIDATE_MOVE_VECTOR_COORDINATES) {

			int candidateDestinationCoordinate = this.piecePosition;

			while (BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {

				if (isFirstColumnExclusion(candidateDestinationCoordinate, candidateCoordinateOffset)
						|| isEightColumnExclusion(candidateDestinationCoordinate, candidateCoordinateOffset)) {
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
		//return ImmutableList.copyOf(legalMoves);
		 return Collections.unmodifiableList(legalMoves);
	}

	private static boolean isFirstColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.FIRST_COLUMN[currentPosition]
				&& (candidateOffset == -1 || candidateOffset == -9 || candidateOffset == -7);
	}

	private static boolean isEightColumnExclusion(int currentPosition, int candidateOffset) {
		return BoardUtils.FIRST_COLUMN[currentPosition]
				&& (candidateOffset == 1 || candidateOffset == -7 || candidateOffset == 9);
	}
	
	@Override
	public String toString() {
		return 	PieceType.QUEEN.toString();
	}

}