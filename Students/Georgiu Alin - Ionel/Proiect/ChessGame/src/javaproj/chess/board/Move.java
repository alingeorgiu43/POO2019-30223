package javaproj.chess.board;

import javaproj.chess.board.Board.Builder;
import javaproj.chess.pieces.Piece;

/** 
 * 
 *	In clasa Move se executa mutari ale pieselor pe tabla
 *	Exista doua mari tipuri de mutari implementate in doua clase separate care mostenesc din clasa principala Move:
 * 	1. Mutare pe o locatie goala (MajorMove)
 * 	2. Mutare pe o locatie ocupata de o piesa a oponentului (AttackMove)
 *  @author Alin
 *
 */
public abstract class Move {
	final Board board;
	final Piece movedPiece;
	final int destinationCoordinate;
	public static final Move NULL_MOVE = new NullMove();

	private Move(Board board, Piece movedPiece, int destinationCoordinate) {
		this.board = board;
		this.movedPiece = movedPiece;
		this.destinationCoordinate = destinationCoordinate;
	}

	public Board execute() {
		Builder builder = new Builder();
		for (Piece piece : this.board.currentPlayer().getActivePieces()) {
			if (!this.movedPiece.equals(piece)) {
				builder.setPiece(piece);
			}
		}
		for (Piece piece : this.board.currentPlayer().getOpponent().getActivePieces()) {
			builder.setPiece(piece);
		}
		builder.setPiece(this.movedPiece.movePiece(this));
		builder.setMoveMaker(this.board.currentPlayer().getOpponent().getAlliance());
		return builder.build();
	}

	public static class MajorMove extends Move {
		public MajorMove(Board board, Piece movedPiece, int destinationCoordinate) {
			super(board, movedPiece, destinationCoordinate);
		}
	}

	public static class AttackMove extends Move {
		final Piece attackedPiece;

		public AttackMove(Board board, Piece movedPiece, int destinationCoordinate, Piece attackedPiece) {
			super(board, movedPiece, destinationCoordinate);
			this.attackedPiece = attackedPiece;
		}

		@Override
		public boolean isAttack() {
			return true;
		}

		@Override
		public Piece getAttackedPiece() {
			return this.attackedPiece;
		}

		@Override
		public int hashCode() {
			return this.attackedPiece.hashCode() + super.hashCode();
		}

		@Override
		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof AttackMove)) {
				return false;
			}
			AttackMove otherAttackMove = (AttackMove) other;
			return super.equals(otherAttackMove) && getAttackedPiece().equals(otherAttackMove.getAttackedPiece());
		}
	}

	public static class PawnMove extends Move {

		public PawnMove(Board board, Piece movedPiece, int destinationCoordinate) {
			super(board, movedPiece, destinationCoordinate);
		}
	}

	public static class PawnAttackMove extends AttackMove {

		public PawnAttackMove(Board board, Piece movedPiece, int destinationCoordinate, Piece attackedPiece) {
			super(board, movedPiece, destinationCoordinate, attackedPiece);
		}
	}

	public static class PawnEnPassantAttackMove extends PawnAttackMove {

		public PawnEnPassantAttackMove(Board board, Piece movedPiece, int destinationCoordinate, Piece attackedPiece) {
			super(board, movedPiece, destinationCoordinate, attackedPiece);
		}
	}

	public static class NullMove extends Move {

		public NullMove() {
			super(null, null, -1);
		}

		@Override
		public Board execute() {
			throw new RuntimeException("You cannot do a nullMove");
		}
	}

	public int getCurrentCoordinate() {
		return this.getMovedPiece().getPiecePosition();
	}

	public static class MoveFactory {
		private MoveFactory() {
			throw new RuntimeException("Not instantiable");
		}

		public static Move createMove(Board board, int currentCoordinate, int destinationCoordinate) {
			for (Move move : board.getAllLegalMoves()) {
				if (move.getCurrentCoordinate() == currentCoordinate
						&& move.getDestinationCoordinate() == destinationCoordinate) {
					return move;
				}
			}
			return NULL_MOVE;
		}
	}

	@Override
	public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Move)) {
			return false;
		}
		final Move otherMove = (Move) other;
		return getCurrentCoordinate() == otherMove.getCurrentCoordinate()
			&& getDestinationCoordinate() == otherMove.getDestinationCoordinate()
			&& getMovedPiece().equals(otherMove.getMovedPiece());
	}

	public int getDestinationCoordinate() {
		return this.destinationCoordinate;
	}

	public Piece getMovedPiece() {
		return this.movedPiece;
	}

	public boolean isAttack() {
		return false;
	}
	
	public Piece getAttackedPiece() {
		return null;
	}
}
