package dragBall;

import javax.swing.*;

public class dragDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("Drag Demo");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new dragBallPanel());
		window.pack();
		window.show();
	}

}