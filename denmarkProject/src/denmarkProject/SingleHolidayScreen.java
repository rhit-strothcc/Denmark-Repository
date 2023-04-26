package denmarkProject;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class SingleHolidayScreen extends Page {

	int holidayId; 
	public SingleHolidayScreen(Component c, int holidayId) {
		super(c);
		this.holidayId = holidayId;
	
	}
	
	@Override
	public void drawPage() {
		frame = new JFrame();
		frame.setSize(600,600);
		System.out.print(component.holidayNames.get(holidayId));
		frame.setTitle(component.holidayNames.get(holidayId));
		frame.setLayout(new GridLayout(5,1) );
		frame.add(new JLabel(component.holidayNames.get(holidayId)) );
		frame.add(new JLabel("Date: "+component.holidayDates.get(holidayId)));
		frame.add(new JLabel("History: "+component.holidayHistory.get(holidayId)));
		frame.setVisible(true);
		
		// TODO Auto-generated method stub
		
	}
	
}
