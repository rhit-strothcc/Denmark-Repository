package denmarkProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AllHolidaysScreen extends Page {

	public AllHolidaysScreen(int numEntries, Component c, boolean bothMode) {
		super(c);
		this.numEntries = numEntries;
		this.title = "All";
		this.frame = new JFrame();
		this.bothMode = bothMode;
	}

	int numEntries;
	boolean bothMode = false;
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	JButton bothButton = new JButton("Show only countries celebrated in both Denmark and the USA");

	public void drawPage() {

		frame.setSize(1100, 900);
		frame.setVisible(true);
		System.out.println("here");
		JPanel container = new JPanel();
		container.setLayout(new GridLayout((((numEntries) / 3) + 1), 3));
		frame.add(container);
		System.out.println(numEntries);
		System.out.println(numEntries);

//	System.out.println("here");
		for (int i = 1; i < numEntries; i++) {
			System.out.println(component.celebratedInBoth.get(i));
			if (!bothMode | component.celebratedInBoth.get(i).equals("TRUE")) {
				JPanel k = new JPanel();
				container.add(k);
				k.setLayout(new GridLayout(2, 1));
				String url = "src/denmarkProject/" + i + ".png";
				JLabel img = new JLabel(new ImageIcon(url));
				JButton j = new JButton(component.holidayNames.get(i));
				k.add(img);
				img.setMaximumSize(new Dimension(150, 100));
				img.setPreferredSize(new Dimension(150, 100));
				j.addActionListener(new HolidayBListener(frame, i));
				k.add(j);
			}

		}

		container.add(new JPanel());
		container.add(bothButton);
		bothButton.addActionListener(new BothBListener(bothMode, component));

		JScrollPane scroll = new JScrollPane(container);
		frame.add(scroll);

	}

	public void toggleBothMode() {
		this.bothMode = !this.bothMode;
	}

	public class BothBListener implements ActionListener {
		boolean bothMode;
		Component c;

		public BothBListener(boolean bothMode, Component c) {
			this.bothMode = bothMode;
			this.c = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			AllHolidaysScreen next = new AllHolidaysScreen(numEntries, c, !bothMode);
			next.drawPage();
		}
	}

	public class HolidayBListener implements ActionListener {

		JFrame frame;
		int holidayId;

		HolidayBListener(JFrame f, int holidayId) {
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
