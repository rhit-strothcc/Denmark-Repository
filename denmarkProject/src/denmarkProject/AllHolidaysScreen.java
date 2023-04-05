package denmarkProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		this.frame = new JFrame();
	}
	
	
	int numEntries = 9;
	ArrayList<JButton> buttons = new ArrayList<JButton>();

	
	public void drawPage() {

	frame.setSize(500,500);
	frame.setVisible(true);
	System.out.println("here");
	frame.setLayout(new GridLayout(3,(numEntries+1)/3) );
   
	
	
//	System.out.println("here");
    for(int i = 1;i<numEntries;i++) {
        JPanel k = new JPanel();
        frame.add(k);
        frame.add(new JLabel(component.holidayNames.get(i)));
        JButton j = new JButton(component.holidayNames.get(i));
        j.addActionListener(new HolidayBListener(frame, i));
        k.add(j);
        
    }

		
	}
	
	public class HolidayBListener implements ActionListener {
		
		JFrame frame;
		int holidayId;
		
		HolidayBListener(JFrame f, int holidayId){
			this.frame = f;
			this.holidayId = holidayId;
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			component.pages.add(new SingleHolidayScreen(component, holidayId));
			component.nextPage();
			component.update();
		}
		
	}
	
	
}
