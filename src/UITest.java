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
        
        JTextPane txtpnYeet = new JTextPane();
        txtpnYeet.setBackground(Color.BLACK);
        txtpnYeet.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtpnYeet.setForeground(Color.WHITE);
        txtpnYeet.setText("yeet");
        txtpnYeet.setEditable(false);
        txtpnYeet.setBounds(140, 262, 284, 218);
        getContentPane().add(txtpnYeet);
        
        // JLabel with image 
        JLabel pic = new JLabel("");
        pic.setBackground(Color.WHITE);
        pic.setIcon(new ImageIcon(image));
        pic.setBounds(0, 0, 1148, 769);
        content.add(pic);
        
 
	}
}
