package javaproj.chess.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import javaproj.chess.board.BoardUtils;

public class Table {
	private final JFrame gameFrame;
	private final BoardPanel boardPanel;
	private final static Dimension FRAME_DIMENSION = new Dimension(600, 600);
	private final static Dimension BOARD_PANEL_DIMENSION = new Dimension(400, 350);
	private final static Dimension TILE_PANEL_DIMENSION = new Dimension(10, 10);

	private final static Color lightTileColor = Color.WHITE;
	private final static Color darkTileColor = Color.LIGHT_GRAY;

	public Table() {
		this.gameFrame = new JFrame("Chess Game");
		this.gameFrame.setLayout(new BorderLayout());
		this.gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JMenuBar tableMenuBar = createTableMenuBar();
		this.gameFrame.setJMenuBar(tableMenuBar);
		this.gameFrame.setSize(FRAME_DIMENSION);
		this.boardPanel = new BoardPanel();
		this.gameFrame.add(this.boardPanel, BorderLayout.CENTER);
		this.gameFrame.setVisible(true);
	}

	private JMenuBar createTableMenuBar() {
		final JMenuBar tableMenuBar = new JMenuBar();
		tableMenuBar.add(createFileMenu());
		return tableMenuBar;
	}

	private JMenu createFileMenu() {
		final JMenu menu = new JMenu("File");

		final JMenuItem openPGN = new JMenuItem("Load PGN File");
		openPGN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("Open up that PGN file");
			}
		});
		menu.add(openPGN);
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

	private class BoardPanel extends JPanel {
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
	}

	private class TilePanel extends JPanel {
		private final int titleId;

		TilePanel(final BoardPanel boardPanel, final int titleId) {
			super(new GridBagLayout());
			this.titleId = titleId;
			setPreferredSize(TILE_PANEL_DIMENSION);
			assignTileColor();
			validate();
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
	}
}
