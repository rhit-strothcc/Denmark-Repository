package denmarkProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HomeScreen extends Page{
	
	public HomeScreen() {
		
	}
	
	
	JPanel startp = new JPanel();
	JPanel closep = new JPanel();
	JPanel bigt = new JPanel();
	JPanel smallt = new JPanel();
	JButton startb = new JButton("Start");
	JButton xb = new JButton("Close");
	JLabel bigtext = new JLabel("Welcome to Stars, Stripes, and Celebrations");
	JLabel smalltext = new JLabel("By Madeleine Klee & Chase Strother");
	
	
	@Override
	public void drawPage(JFrame g) {
	g.add(startp);
	g.add(bigt, BorderLayout.NORTH);
	g.add(smallt, BorderLayout.SOUTH);
	g.add(startp, BorderLayout.CENTER);
	
	bigt.add(bigtext);
	smallt.add(smalltext);
	startp.add(startb);
	
	}

}
