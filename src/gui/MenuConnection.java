package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class MenuConnection extends BaseFenetre {

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public MenuConnection() {
		
		
		super();
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(322, 209, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("test");
		lblNewLabel.setBounds(10, 21, 200, 50);
		lblNewLabel.setVisible(true);
		getContentPane().add(lblNewLabel);
		
		JLabel lblTest = new JLabel("test");
		lblTest.setBounds(10, 109, 200, 50);
		getContentPane().add(lblTest);

	}
}
