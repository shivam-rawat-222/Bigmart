package winbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class First {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
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
	public First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(100, 100, 1167, 801);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO BIG MART");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 41));
		lblNewLabel.setBounds(196, 64, 694, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sir What You Want To Do");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(330, 208, 467, 68);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 0, 175, 778);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(119, 136, 153));
		panel_1.setBounds(946, 0, 207, 764);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Add Product");
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(238, 360, 192, 195);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnShop = new JButton("Shop");
		btnShop.setRequestFocusEnabled(false);
		btnShop.setRolloverEnabled(false);
		btnShop.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnShop.setBounds(698, 360, 192, 195);
		frame.getContentPane().add(btnShop);
	}
}
