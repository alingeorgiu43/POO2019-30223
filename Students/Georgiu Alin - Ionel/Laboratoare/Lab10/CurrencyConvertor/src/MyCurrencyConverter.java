import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MyCurrencyConverter {

	private JFrame frame;
	private JTextField textField;
	private JComboBox startBox;
	private JComboBox endBox;
	private JButton btnConvert;
	private JButton btnExit;
	private JButton btnReset;
	private JLabel lblResult;
	double result = 0.0;
	double input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCurrencyConverter window = new MyCurrencyConverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCurrencyConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblConvert = new JLabel("CONVERT:");
		lblConvert.setBounds(21, 10, 90, 28);
		frame.getContentPane().add(lblConvert);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setForeground(Color.BLACK);
		textField.setText("---/---");
		textField.setBounds(121, 15, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblTo = new JLabel("TO:");
		lblTo.setBounds(21, 83, 45, 13);
		frame.getContentPane().add(lblTo);

		startBox = new JComboBox();
		startBox.setBackground(Color.LIGHT_GRAY);
		startBox.setModel(new DefaultComboBoxModel(new String[] { "SELECT", "EUR", "USD", "RON" }));
		startBox.setBounds(283, 14, 173, 24);
		frame.getContentPane().add(startBox);

		endBox = new JComboBox();
		endBox.setBackground(Color.LIGHT_GRAY);
		endBox.setModel(new DefaultComboBoxModel(new String[] { "SELECT", "EUR", "USD", "RON" }));
		endBox.setBounds(121, 79, 160, 28);
		frame.getContentPane().add(endBox);

		lblResult = new JLabel("RESULT");
		lblResult.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblResult.setBounds(380, 83, 109, 24);
		frame.getContentPane().add(lblResult);

		btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(152, 251, 152));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startBox.setSelectedIndex(0);
				endBox.setSelectedIndex(0);
				lblResult.setText("0.00");
				textField.setText("---/---");
			}
		});
		btnReset.setBounds(21, 162, 90, 21);
		frame.getContentPane().add(btnReset);

		btnConvert = new JButton("CONVERT");
		btnConvert.setBackground(new Color(152, 251, 152));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					input = Double.parseDouble(textField.getText());
					if (startBox.getSelectedItem().equals("EUR") && endBox.getSelectedItem().equals("RON")) {
						result = input * 4.78;
						lblResult.setText(result + " RON");
					}

					if (startBox.getSelectedItem().equals("EUR") && endBox.getSelectedItem().equals("USD")) {
						result = input * 1.11;
						lblResult.setText(result + " USD");
					}

					if (startBox.getSelectedItem().equals("USD") && endBox.getSelectedItem().equals("EUR")) {
						result = input * 0.90;
						lblResult.setText(result + "EUR");
					}

					if (startBox.getSelectedItem().equals("USD") && endBox.getSelectedItem().equals("RON")) {
						result = input * 4.30;
						lblResult.setText(result + " RON");
					}

					if (startBox.getSelectedItem().equals("RON") && endBox.getSelectedItem().equals("USD")) {
						result = input * 0.23;
						lblResult.setText(result + "USD");
					}

					if (startBox.getSelectedItem().equals("RON") && endBox.getSelectedItem().equals("EUR")) {
						result = input * 0.21;
						lblResult.setText(result + " EUR");
					}

					if (startBox.getSelectedItem().equals("USD") && endBox.getSelectedItem().equals("USD")
							|| startBox.getSelectedItem().equals("RON") && endBox.getSelectedItem().equals("RON")
							|| startBox.getSelectedItem().equals("EUR") && endBox.getSelectedItem().equals("EUR")) {
						lblResult.setText(result + " EUR");
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(frame, "THE INPUT IS INVALID!");
				}

			}
		});
		btnConvert.setBounds(222, 162, 96, 21);
		frame.getContentPane().add(btnConvert);

		btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(152, 251, 152));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(420, 162, 90, 21);
		frame.getContentPane().add(btnExit);
	}

	private void setBackroung(Color red) {
		// TODO Auto-generated method stub
		
	}
}
