	import java.awt.Color;
	import java.awt.Container;
	import java.awt.EventQueue;

	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenuBar;
	import javax.swing.JMenu;
	import javax.swing.JMenuItem;

	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.awt.event.ActionEvent;
	import javax.swing.JButton;
	import java.awt.BorderLayout;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import java.awt.Font;
	import javax.swing.JScrollPane;
	import javax.swing.JTextPane;



import javax.swing.JScrollBar;

	import java.awt.GridLayout;
	import java.awt.CardLayout;
	import javax.swing.BoxLayout;
public class Portfolio_UI extends JFrame {
	public Portfolio_UI() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 400, 400);
		panel.setIcon();
		getContentPane().add(panel);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio_UI frame = new Portfolio_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	}

	