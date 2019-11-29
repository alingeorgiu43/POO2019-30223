package javaproj.chess.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Table {
	private final JFrame gameFrame;
	private static Dimension FRAME_DIMENSION = new Dimension(500, 500);

	public Table() {
		this.gameFrame = new JFrame("Chess Game");
		this.gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JMenuBar bar = new JMenuBar();
		populateMenuBar(bar);
		this.gameFrame.setSize(FRAME_DIMENSION);
		this.gameFrame.setJMenuBar(bar);
		this.gameFrame.setVisible(true);
	}

	private void populateMenuBar(final JMenuBar tableMenuBar) {
		tableMenuBar.add(createFileMenu());
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
		return menu;
	}
}
