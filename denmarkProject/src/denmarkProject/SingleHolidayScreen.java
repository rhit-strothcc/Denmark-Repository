package denmarkProject;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class SingleHolidayScreen extends Page {

	int holidayId; 
	public SingleHolidayScreen(Component c, int holidayId) {
		super(c);
		this.holidayId = holidayId;
	
	}
	
	@Override
	public void drawPage() {
		frame = new JFrame();
		
		JPanel container = new JPanel();
		frame.setLayout(new GridLayout(2,1));
		System.out.print(component.holidayNames.get(holidayId));
		frame.setTitle(component.holidayNames.get(holidayId));

		container.setLayout(new GridLayout(6,1));
		String url = "src/denmarkProject/" + holidayId +".png";
		JLabel img = new JLabel(new ImageIcon(url));
		frame.add(img);
		frame.add(container);
		ArrayList<JTextArea> areas = new ArrayList<JTextArea>();
		areas.add(new JTextArea(component.holidayNames.get(holidayId)) );
		areas.add(new JTextArea("Date: "+component.holidayDates.get(holidayId)));
		areas.add(new JTextArea("History: "+component.holidayHistory.get(holidayId)));
		areas.add(new JTextArea("What to Wear: "+component.whatToWear.get(holidayId)));
		areas.add(new JTextArea("Food and Drinks: "+component.foodAndDrinks.get(holidayId)));
		areas.add(new JTextArea("How to Celebrate: "+component.howtoCelebrate.get(holidayId)));
		for(JTextArea area : areas) {
			container.add(area);
			area.setWrapStyleWord(false);
			area.setLineWrap(true);
			area.setEditable(false);
			area.setOpaque(false);
			area.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		}
		frame.setSize(600,600);

		frame.setVisible(true);
		
		// TODO Auto-generated method stub
		
	}
	
}
