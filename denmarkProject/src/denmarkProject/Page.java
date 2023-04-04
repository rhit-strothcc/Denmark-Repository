package denmarkProject;

import java.awt.Graphics2D;

import javax.swing.JFrame;

public abstract class Page {
	
	String title;
	Component component;
	
	public Page(Component component) {
		this.component = component;
	}
	
	public abstract void drawPage(JFrame g);
		
	

}
