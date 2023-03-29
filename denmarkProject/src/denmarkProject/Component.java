package denmarkProject;

import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

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
		pages.add(new HomeScreen());
		
	}
	
	public void update() {
		pages.get(currentpage).drawPage(frame);
	}

}
