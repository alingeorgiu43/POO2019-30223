package javaproj.chess.player;

import java.util.ArrayList;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javaproj.chess.board.Board;
import javaproj.chess.board.Move;
import javaproj.chess.board.MoveTransition;
import javaproj.chess.pieces.Alliance;
import javaproj.chess.pieces.King;
import javaproj.chess.pieces.Piece;
/**
 * 
 *  Clasa Player contine tabla de sah, mutarile legale pe care le poate face jucatorul,
 *  regele acelui jucator si daca regele este sau nu un check
 *  Metoda establishKing() parcurge toate piesele active si daca gaseste regele il returneaza 
 *  @author Alin
 *
 */
public abstract class Player {

	protected final Board board;
	protected King playerKing;
	protected final Collection<Move> legalMoves;
	private final boolean isInCheck;

	Player(final Board board, final Collection<Move> legalMoves, final Collection<Move> opponentMoves) {
		this.board = board;
		this.playerKing = establishKing();
		this.isInCheck = !Player.calculateAttacksOnTile(this.playerKing.getPiecePosition(), opponentMoves).isEmpty();
		this.legalMoves = Collections.unmodifiableCollection(legalMoves);
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
	
	public boolean isMoveLegal(final Move move) {
		return this.legalMoves.contains(move);
	}

	private King establishKing() {
		for (final Piece piece : getActivePieces()) {
			if (piece.getPieceType().isKing()) {
				return (King) piece;
			}
		}
		throw new RuntimeException("This is not an allowed chess table");
		
	}

	public boolean isInCheck() {
		return this.isInCheck;
	}

	public boolean isInCheckMate() {
		return this.isInCheck && !hasEscapeMoves();
	}
	
	public boolean isInStaleMate() {
		return !this.isInCheck && !hasEscapeMoves();
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
}
