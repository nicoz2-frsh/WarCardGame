package warcardgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Warcardgamewindow {

	private JFrame frame;
	private Deck deck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warcardgamewindow window = new Warcardgamewindow();
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
	public Warcardgamewindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("lblNewLabel");
		lblNewLabel.setBounds(139, 27, 135, 210);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Card randomCard;
				randomCard = deck.drawCard();
				lblNewLabel.setIcon(randomCard.getImg());
			}
		});
		btnNewButton.setBounds(24, 122, 85, 21);
		frame.getContentPane().add(btnNewButton);
		deck = new Deck();
		deck.createDeck();
		deck.shuffle();
		
		
	}
}
