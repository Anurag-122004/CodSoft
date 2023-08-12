package rd.counter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class WordCounter {

	private JFrame frame;
	private JTextField textField;
	private final Action action = new SwingAction();
	private JScrollPane scrollpane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCounter window = new WordCounter();
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
	public WordCounter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91639\\Dropbox\\PC\\Desktop\\wc.jpg"));
		lblNewLabel.setBounds(0, 0, 300, 300);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(300, 0, 400, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\91639\\Pictures\\211652_close_icon.png"));
		btnNewButton.setBounds(352, 0, 48, 40);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Word Counter Tool");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(33, 38, 357, 40);
		panel.add(lblNewLabel_1);
		
		final JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 15));
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBounds(47, 82, 343, 105);
		panel.add(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(294, 261, 96, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("No. of Words :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(142, 261, 142, 29);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Count");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] arr = textArea.getText().split("\\s");
				int count = arr.length;
				
				textField.setText(String.valueOf(count));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(166, 197, 109, 35);
		panel.add(btnNewButton_1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		
		public void actionPerformed(ActionEvent e) {
		}
	}
}
