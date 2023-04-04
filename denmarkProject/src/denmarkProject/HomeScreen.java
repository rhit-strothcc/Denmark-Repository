package denmarkProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HomeScreen extends Page{
	
	public HomeScreen(Component c) {
		super(c);
	}
	
	Icon ic = new ImageIcon("C://Users//dowdelmm//OneDrive - Rose-Hulman Institute of Technology//Documents//Pictures/header_image_cold_toleration-400x300.jpg");
	JLabel img = new JLabel();
	


	
	JPanel startp = new JPanel();
	JPanel closep = new JPanel();
	JPanel bigt = new JPanel();
	JPanel smallt = new JPanel();
	JPanel imagep = new JPanel();
	
	JButton startb = new JButton("Start");
	JButton xb = new JButton("Close");
	JLabel bigtext = new JLabel("Welcome to Stars, Stripes, and Celebrations");
	JLabel smalltext = new JLabel("By Madeleine Klee & Chase Strother");
	
	
	@Override
	public void drawPage(JFrame g) {
	//g.setContentPane(new Component(g));

	img.setIcon(ic);
	g.add(bigt, BorderLayout.NORTH);
	
	
	
	g.add(startp, BorderLayout.CENTER);
	bigt.add(bigtext);

	g.add(imagep, BorderLayout.CENTER);
	imagep.add(img);
	smallt.add(smalltext);
	g.add(smallt, BorderLayout.SOUTH);
	startp.add(startb);
	g.add(startp);
	startp.setPreferredSize(new Dimension(100, 50));
	startp.setOpaque(false);
	bigtext.setFont(new Font("Sans Serif", 25, 25));
	startb.addActionListener(new StartBListener(g));
	
	
	}
	
	public class StartBListener implements ActionListener {
		
		JFrame frame;
		
		StartBListener(JFrame g){
			this.frame = g;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			frame.removeAll();
			System.out.println("done");
			// TODO Auto-generated method stub
			component.nextPage();
			component.update();
		}
		
	}

}
