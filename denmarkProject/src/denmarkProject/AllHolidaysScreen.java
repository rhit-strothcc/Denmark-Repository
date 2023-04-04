package denmarkProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class AllHolidaysScreen extends Page {
	
	public AllHolidaysScreen(int numEntries, Component c) {
		super(c);
		this.numEntries = numEntries;
		this.title = "All";
	}
	
	
	int numEntries = 9;
	ArrayList<JButton> buttons = new ArrayList<JButton>();

	
	public void drawPage(JFrame g) {
	System.out.println("here");
	//	g.setLayout(new GridLayout(3,4) );
	//g.setContentPane(new Component(g));
	
//	g.add(new JLabel("test"));
//	System.out.println("here");
//    for(int i = 0;i<numEntries;i++) {
//        JPanel k = new JPanel();
//        g.add(k);
//        k.add(new JButton(Integer.toString(i)));
//    }

		
	}
}
