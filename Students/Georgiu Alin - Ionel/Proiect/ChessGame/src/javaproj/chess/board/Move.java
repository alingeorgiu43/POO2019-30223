package javaproj.chess.board;

import javaproj.chess.board.Board.Builder;
import javaproj.chess.pieces.Pawn;
import javaproj.chess.pieces.Piece;
import javaproj.chess.pieces.Rook;

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

		final Builder builder = new Builder();
		for (Piece piece : this.board.currentPlayer().getActivePieces()) {
			// to do hashcode for pieces , equals
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

	public int getCurrentCoordinate() {
		return this.getMovedPiece().getPiecePosition();
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
		public Board execute() {
			// TODO Auto-generated method stub
			return null;
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

	public static class PawnJump extends Move {

		public PawnJump(Board board, Piece movedPiece, int destinationCoordinate) {
			super(board, movedPiece, destinationCoordinate);
		}

		@Override
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
			Pawn movedPawn = (Pawn) this.movedPiece.movePiece(this);
			builder.setPiece(movedPawn);
			builder.setEnPassantPawn(movedPawn);
			builder.setMoveMaker(this.board.currentPlayer().getOpponent().getAlliance());
			return builder.build();
		}
	}

	static abstract class CastleMove extends Move {

		protected Rook castleRook;
		protected int castleRookStart;
		protected int castleRookDestination;

		public CastleMove(Board board, Piece movedPiece, int destinationCoordinate, Rook castleRook,
				int castleRookStart, int castleRookDestination) {
			super(board, movedPiece, destinationCoordinate);
			this.castleRook = castleRook;
			this.castleRookStart = castleRookStart;
			this.castleRookDestination = castleRookDestination;
		}

		public Rook getCastleRook() {
			return this.getCastleRook();
		}

		@Override
		public boolean isCastlingMove() {
			return true;
		}

		@Override
		public Board execute() {

			Builder builder = new Builder();
			for (Piece piece : this.board.currentPlayer().getActivePieces()) {
				if (!this.movedPiece.equals(piece) && !this.castleRook.equals(piece)) {
					builder.setPiece(piece);
				}
			}
			for (Piece piece : this.board.currentPlayer().getOpponent().getActivePieces()) {
				builder.setPiece(piece);
			}
			builder.setPiece(this.movedPiece.movePiece(this));
			builder.setPiece(new Rook(this.castleRookDestination, this.castleRook.getPieceAlliance()));
			// to do first move on pieces
			builder.setMoveMaker(this.board.currentPlayer().getOpponent().getAlliance());
			return builder.build();
		}

	}

	public static class KingSideCastleMove extends CastleMove {

		public KingSideCastleMove(Board board, Piece movedPiece, int destinationCoordinate, Rook castleRook,
				int castleRookStart, int castleRookDestination) {
			super(board, movedPiece, destinationCoordinate, castleRook, castleRookStart, castleRookDestination);
		}

		@Override
		public String toString() {
			return "0-0";
		}

	}

	public static class QueenSideCastleMove extends CastleMove {

		public QueenSideCastleMove(Board board, Piece movedPiece, int destinationCoordinate, Rook castleRook,
				int castleRookStart, int castleRookDestination) {
			super(board, movedPiece, destinationCoordinate, castleRook, castleRookStart, castleRookDestination);
		}

		@Override
		public String toString() {
			return "0-0-0";
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.destinationCoordinate;
		result = prime * result + this.movedPiece.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Move)) {
			return false;
		}
		Move otherMove = (Move) other;
		return getDestinationCoordinate() == otherMove.getDestinationCoordinate()
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

	public boolean isCastlingMove() {
		return false;
	}

	public Piece getAttackedPiece() {
		return null;
	}

}
