package javaproj.chess.board;

import javaproj.chess.player.MoveStatus;

public class MoveTransition {

	private final Board transitionBoard;
	private final Move move;
	private final MoveStatus moveStatus;

	public MoveTransition(Board transitionBoard, Move move, MoveStatus moveStatus) {
		this.transitionBoard = transitionBoard;
		this.move = move;
		this.moveStatus = moveStatus;
	}

	public MoveStatus getMoveStatus() {
		return this.moveStatus;
	}
	
	public Board getTransitionBoard() {
		return this.transitionBoard; 
	}
	 public Board getToBoard() {
         return this.transitionBoard;
    }
	 
	 public Move getTransitionMove() {
	        return this.move;
	    }
}
