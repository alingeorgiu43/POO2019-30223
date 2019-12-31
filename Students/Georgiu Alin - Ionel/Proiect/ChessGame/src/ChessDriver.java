import javaproj.chess.board.Board;
import javaproj.chess.gui.Table;

public class ChessDriver {

	public static void main(String[] args) {

		//Table table = new Table();
		
		Board board=Board.createStandardBoard();
		System.out.println(board);
	}
}
