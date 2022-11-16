package winbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class second extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second frame = new second();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 784);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(517, 350, 162, 24);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(663, 421, 191, 22);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1_2 = new JLabel("PASSWORD :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(517, 418, 162, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setForeground(new Color(0, 0, 0));
		textArea_1.setBounds(663, 353, 191, 22);
		contentPane.add(textArea_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 286, 747);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(594, 520, 156, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Admin Please Login");
		lblNewLabel.setBounds(409, 148, 442, 62);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
