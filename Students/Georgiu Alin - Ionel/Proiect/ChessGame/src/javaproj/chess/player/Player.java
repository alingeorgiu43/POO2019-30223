package javaproj.chess.player;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

import javaproj.chess.board.Board;
import javaproj.chess.board.Move;
import javaproj.chess.pieces.Alliance;
import javaproj.chess.pieces.King;
import javaproj.chess.pieces.Piece;

public abstract class Player {

	protected final Board board;
	protected final King playerKing;
	protected final Collection<Move> legalMoves;
	private final boolean isInCheck;

	Player(final Board board, final Collection<Move> legalMoves, final Collection<Move> opponentMoves) {
		this.board = board;
		this.playerKing = establishKing();
		this.legalMoves = Collections.unmodifiableCollection(legalMoves);
		this.isInCheck = !Player.calculateAttacksOnTile(this.playerKing.getPiecePosition(), opponentMoves).isEmpty();
	}

	protected static Collection<Move> calculateAttacksOnTile(int piecePosition, Collection<Move> moves) {

		List<Move> attackMoves = new ArrayList<>();
		for (Move move : moves) {
			if (piecePosition == move.getDestinationCoordinate()) {
				attackMoves.add(move);
			}
		}
		return Collections.unmodifiableList(attackMoves);
	}

	private King establishKing() {

		for (final Piece piece : getActivePieces()) {
			if (piece.getPieceType().isKing()) {
				return (King) piece;
			}
		}
		throw new RuntimeException("This is not an allowed chess table");
	}

	public boolean isMoveLegal(final Move move) {
		return this.legalMoves.contains(move);
	}

	public boolean isInCheck() {
		return this.isInCheck;
	}

	public boolean isInCheckMate() {
		return this.isInCheck && !hasEscapeMoves();
	}

	private boolean hasEscapeMoves() {

		for (Move move : this.legalMoves) {
			MoveTransition transition = makeMove(move);
			if (transition.getMoveStatus().isDone()) {
				return true;
			} else
				return false;
		}
		return false;
	}

	public boolean isInStaleMate() {
		return !this.isInCheck && !hasEscapeMoves();
	}

	public boolean isCastled() {
		return false;
	}

	public MoveTransition makeMove(Move move) {

		if (!isMoveLegal(move)) {
			return new MoveTransition(this.board, move, MoveStatus.ILLEGAL_MOVE);
		}
		Board transitionBoard = move.execute();
		Collection<Move> kingAttacks = Player.calculateAttacksOnTile(
				transitionBoard.currentPlayer().getOpponent().getPlayerKing().getPiecePosition(),
				transitionBoard.currentPlayer().getLegalMoves());

		if (!kingAttacks.isEmpty()) {
			return new MoveTransition(this.board, move, MoveStatus.LEAVES_PLAYER_IN_CHECK);
		}
		return new MoveTransition(transitionBoard, move, MoveStatus.DONE);
	}

	public Collection<Move> getLegalMoves() {
		return this.legalMoves;
	}

	public King getPlayerKing() {
		return this.playerKing;
	}

	public abstract Collection<Piece> getActivePieces();

	public abstract Alliance getAlliance();

	public abstract Player getOpponent();

	protected abstract Collection<Move> calculateKingCastles(Collection<Move> playerLegals,
			Collection<Move> opponentLegals);

}
