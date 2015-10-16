package gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class BaseFenetre extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public BaseFenetre() {
		super();
		setVisible(true);
		setTitle("capteur temperature");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocation(200, 200);
		contentPane.setLayout(null);
		panel.setBounds(0, 0, 444, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
	}
}
