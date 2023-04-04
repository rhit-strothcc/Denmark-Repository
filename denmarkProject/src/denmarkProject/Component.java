package denmarkProject;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Component extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ArrayList<Page> pages;
	int currentpage = 0;
	JFrame frame;
	
	public Component(JFrame frame) {
		this.frame = frame;
		pages = new ArrayList<Page>();
		pages.add(new HomeScreen(this));
		pages.add(new AllHolidaysScreen(10,this));
		
	}
	
	public void nextPage() {
		this.currentpage++;
	}
	
	public void paintComponent(Graphics g) {
//		BufferedImage img = null;
//		try {
//			img = ImageIO.read(new File("C://Users//dowdelmm//OneDrive - Rose-Hulman Institute of Technology//Documents//Pictures/header_image_cold_toleration-400x300.jpg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		super.paintComponent(g);
//		g.drawImage(img, 0, 0, this);
	}
	
	public void update() {
		pages.get(currentpage).drawPage(frame);
	}

}
