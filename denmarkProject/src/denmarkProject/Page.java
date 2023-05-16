package denmarkProject;

import java.awt.Graphics2D;

import javax.swing.JFrame;

public abstract class Page {
	// creates blank template for new Pages

	String title;
	Component component;
	JFrame frame;

	public Page(Component component) {
		this.component = component;
	}

	public abstract void drawPage();

}
