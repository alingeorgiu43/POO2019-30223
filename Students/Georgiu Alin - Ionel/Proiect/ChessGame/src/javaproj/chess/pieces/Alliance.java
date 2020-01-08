package javaproj.chess.pieces;

import javaproj.chess.player.BlackPlayer;
import javaproj.chess.player.Player;
import javaproj.chess.player.WhitePLayer;

/**
 * 
 * @author Alin
 * Enum Alliance va returna directia in care o piesa este mutata,
 * daca piesa este alba sau neagra 
 * si alege tipul jucatorului (WhitePlayer sau BlackPlayer)
 * Toate metodele au fost declarate abstract si vor fi implementate pentru fiecare din cele doua tipuri enum (WHITE si BLACK)
 */

public enum Alliance {
	WHITE {
		@Override
		public int getDirection() {
			return -1;
		}
		@Override
		public boolean isWhite() {
			return true;
		}
		@Override
		public boolean isBlack() {
			return false;
		}
		@Override
		public Player choosePlayer(WhitePLayer whitePlayer, BlackPlayer blackPlayer) {
			return whitePlayer;
		}
	},
	BLACK {
		@Override
		public int getDirection() {
			return 1;
		}
		@Override
		public boolean isWhite() {
			return false;
		}
		@Override
		public boolean isBlack() {
			return true;
		}
		@Override
		public Player choosePlayer(WhitePLayer whitePlayer, BlackPlayer blackPlayer) {
			return blackPlayer;
		}
	};
	public abstract int getDirection();
	public abstract boolean isWhite();
	public abstract boolean isBlack();
	public abstract Player choosePlayer(WhitePLayer whitePlayer, BlackPlayer blackPlayer);

}
