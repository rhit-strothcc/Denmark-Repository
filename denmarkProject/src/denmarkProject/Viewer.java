package denmarkProject;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Viewer {

	public Viewer() {
		JFrame frame = new JFrame();

		frame.setSize(500, 500);
		frame.setTitle("Welcome to Stars, Stripes, and Celebrations");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Component component = new Component(frame);
		component.update();
		frame.setVisible(true);
	}
	
	

}