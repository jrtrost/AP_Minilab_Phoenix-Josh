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
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JScrollPane;

public class UITest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITest frame = new UITest();
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
	public UITest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1162, 806);
        java.awt.Image image = new ImageIcon("img/APCS1.PNG").getImage();
        
        // Content Panel to add Label and Image
        //https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
        Container content = getContentPane();
        content.setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(null);
        
        // click this
        JButton text = new JButton("CLICK ME");
      
        text.setForeground(Color.WHITE);
        text.setBackground(new Color(0, 128, 0));
        text.setFont(new Font("Tahoma", Font.PLAIN, 27));
        text.setBounds(180, 663, 159, 61);
        getContentPane().add(text);
        
        JLabel lblNewLabel = new JLabel("PAIR SHARE PORTFOLIO");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(670, 206, 305, 53);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Members: Lucy Gao, Anthony Chin,");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(670, 236, 327, 53);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel(" Joshua Trost, Phoenix Dimagiba");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(670, 269, 327, 39);
        getContentPane().add(lblNewLabel_2);
        
        // JLabel with image  
        JLabel pic = new JLabel("");
        pic.setBackground(Color.WHITE);
        pic.setIcon(new ImageIcon(image));
        pic.setBounds(0, 0, 1148, 769);
        content.add(pic);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(140, 262, 284, 218);
        getContentPane().add(scrollPane);
        //
        JTextPane display = new JTextPane();
        scrollPane.setViewportView(display);
        display.setBackground(Color.BLACK);
        display.setFont(new Font("Tahoma", Font.PLAIN, 15));
        display.setForeground(Color.WHITE);
        display.setEditable(false);
        
        text.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		display.setText(CircleQueueDriver.main(null));
        	}
        });
        
        JButton btnNewButton = new JButton("GRASS");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		display.setText(GrassTypePokemon.main(null));
        	}
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 100, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.setBounds(167, 81, 85, 21);
        getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("FIRE");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		display.setText(FireTypePokemon.main(null));
        	}
        });
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(255, 0, 0));
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_1.setBounds(262, 81, 85, 21);
        getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("WATER");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		display.setText(WaterTypePokemon.main(null));
        	}
        });
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setBackground(new Color(0, 0, 255));
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_2.setBounds(357, 81, 85, 21);
        getContentPane().add(btnNewButton_2);
 
	}
}
