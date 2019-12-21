package dragBall;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimerEx extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JLabel l;
	Timer t;
	int x = 10;
	int y = 300;

	TimerEx() {
		ImageIcon img = new ImageIcon("C:\\Users\\georg\\Documents\\Facultate\\An 2\\POO\\Java workspace\\dragBall\\src\\ball.jpg");
		l = new JLabel(img);
		l.setLocation(x, y);
		this.add(l);
		setBackground(Color.white);
		t = new Timer(100, this);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
		x += 20;
		if (x > 800)
			x = 50;
		l.setLocation(x, y);
	}

	public static void main() {
		JFrame frame = new JFrame("Timer Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		TimerEx pane = new TimerEx();
		frame.setContentPane(pane);
		frame.setVisible(true);
	}
}