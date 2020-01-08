package javaproj.chess.gui;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import javaproj.chess.board.Board;
import javaproj.chess.board.BoardUtils;
import javaproj.chess.board.Move;
import javaproj.chess.board.MoveTransition;
import javaproj.chess.board.Move.MoveFactory;
import javaproj.chess.pieces.Piece;

import javax.swing.SwingUtilities;

public final class Table {
	private final JFrame gameFrame;
	private final BoardPanel boardPanel;
	private Board chessBoard;

	private Piece sourceTile;
	private Piece humanMovedPiece;

	private final MoveLog moveLog;

	private final static Dimension FRAME_DIMENSION = new Dimension(600, 600);
	private final static Dimension BOARD_PANEL_DIMENSION = new Dimension(400, 350);
	private final static Dimension TILE_PANEL_DIMENSION = new Dimension(10, 10);
	private static String defaultPieceImagesPath = "ChessPieces/";

	private final static Color lightTileColor = Color.WHITE;
	private final static Color darkTileColor = Color.LIGHT_GRAY;

	private static final Table brandNewTable = new Table();

	public Table() {
		this.gameFrame = new JFrame("Chess Game");
		this.gameFrame.setLayout(new BorderLayout());
		this.moveLog = new MoveLog();
		this.gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.chessBoard = Board.createStandardBoard();
		final JMenuBar tableMenuBar = createTableMenuBar();
		this.gameFrame.setJMenuBar(tableMenuBar);
		this.gameFrame.setSize(FRAME_DIMENSION);
		this.boardPanel = new BoardPanel();
		this.gameFrame.add(this.boardPanel, BorderLayout.CENTER);
		this.gameFrame.setVisible(true);
	}

	public static Table get() {
		return brandNewTable;
	}

	private Board getGameBoard() {
		return this.chessBoard;
	}

	private BoardPanel getBoardPanel() {
		return this.boardPanel;
	}

	public void show() {
		Table.get().getMoveLog().clear();
		Table.get().getBoardPanel().drawBoard(Table.get().getGameBoard());
	}

	private MoveLog getMoveLog() {
		return this.moveLog;
	}

	private JMenuBar createTableMenuBar() {
		final JMenuBar tableMenuBar = new JMenuBar();
		tableMenuBar.add(createFileMenu());
		return tableMenuBar;
	}

	private JMenu createFileMenu() {
		final JMenu menu = new JMenu("File");

		final JMenuItem exitMenuItem = new JMenuItem("EXIT");
		exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(exitMenuItem);
		return menu;
	}

	public static class MoveLog {

		private final List<Move> moves;

		MoveLog() {
			this.moves = new ArrayList<>();
		}

		public List<Move> getMoves() {
			return this.moves;
		}

		void addMove(final Move move) {
			this.moves.add(move);
		}

		public int size() {
			return this.moves.size();
		}

		void clear() {
			this.moves.clear();
		}

		Move removeMove(final int index) {
			return this.moves.remove(index);
		}

		boolean removeMove(final Move move) {
			return this.moves.remove(move);
		}

	}

	private class BoardPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		final List<TilePanel> boardTiles;

		BoardPanel() {
			super(new GridLayout(8, 8));
			this.boardTiles = new ArrayList<>();
			for (int i = 0; i < BoardUtils.NUM_TILES; i++) {
				final TilePanel tilePanel = new TilePanel(this, i);
				this.boardTiles.add(tilePanel);
				add(tilePanel);
			}
			setPreferredSize(BOARD_PANEL_DIMENSION);
			validate();
		}

		public void drawBoard(Board board) {

			removeAll();
			for (TilePanel tilePanel : boardTiles) {
				tilePanel.drawTile(board);
				add(tilePanel);
			}
			validate();
			repaint();
		}
	}

	private class TilePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		private final int titleId;

		TilePanel(final BoardPanel boardPanel, final int titleId) {
			super(new GridBagLayout());
			this.titleId = titleId;
			setPreferredSize(TILE_PANEL_DIMENSION);
			assignTileColor();
			assignTilePieceIcon(chessBoard);

			addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(final MouseEvent event) {
					if (SwingUtilities.isRightMouseButton(event)) {
						sourceTile = null;
						humanMovedPiece = null;
					} else if (SwingUtilities.isLeftMouseButton(event)) {
						if (sourceTile == null) {
							sourceTile = chessBoard.getTile(titleId).getPiece();
							humanMovedPiece = sourceTile;
							if (humanMovedPiece == null) {
								sourceTile = null;
							}
						} else {
							final Move move = MoveFactory.createMove(chessBoard, sourceTile.getPiecePosition(),
									titleId);
							final MoveTransition transition = chessBoard.currentPlayer().makeMove(move);
							if (transition.getMoveStatus().isDone()) {
								chessBoard = transition.getToBoard();
								moveLog.addMove(move);
							}
							sourceTile = null;
							humanMovedPiece = null;
						}
					}
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							boardPanel.drawBoard(chessBoard);
						}
					});
				}

				@Override
				public void mouseExited(final MouseEvent e) {
				}

				@Override
				public void mouseEntered(final MouseEvent e) {
				}

				@Override
				public void mouseReleased(final MouseEvent e) {
				}

				@Override
				public void mousePressed(final MouseEvent e) {
				}
			});
			validate();
		}

		public void drawTile(Board board) {
			assignTileColor();
			assignTilePieceIcon(board);
			validate();
			repaint();
		}

		private void assignTileColor() {
			if (BoardUtils.FIRST_ROW[this.titleId] || BoardUtils.THIRD_ROW[this.titleId]
					|| BoardUtils.FIFTH_ROW[this.titleId] || BoardUtils.SEVENTH_ROW[this.titleId]) {

				setBackground(this.titleId % 2 == 0 ? lightTileColor : darkTileColor);
			} else if (BoardUtils.SECOND_ROW[this.titleId] || BoardUtils.FOURTH_ROW[this.titleId]
					|| BoardUtils.SIXTH_ROW[this.titleId] || BoardUtils.EIGHTH_ROW[this.titleId]) {
				setBackground(this.titleId % 2 != 0 ? lightTileColor : darkTileColor);
			}
		}

		private void assignTilePieceIcon(Board board) {
			this.removeAll();
			if (board.getTile(this.titleId).isTileOccupied()) {

				try {
					BufferedImage image = ImageIO.read(new File(defaultPieceImagesPath
							+ board.getTile(this.titleId).getPiece().getPieceAlliance().toString().substring(0, 1)
							+ board.getTile(this.titleId).getPiece().toString() + ".gif"));
					add(new JLabel(new ImageIcon(image)));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
