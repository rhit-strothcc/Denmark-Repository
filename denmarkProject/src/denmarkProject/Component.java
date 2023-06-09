package denmarkProject;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	ArrayList<String> holidayNames;
	ArrayList<String> holidayDates;
	ArrayList<String> holidayHistory;
	ArrayList<String> howtoCelebrate;
	ArrayList<String> celebratedInBoth;
	ArrayList<String> whatToWear;
	ArrayList<String> foodAndDrinks;

	public Component() {
		// initializes ArrayLists
		holidayNames = new ArrayList<String>();
		holidayDates = new ArrayList<String>();
		holidayHistory = new ArrayList<String>();
		howtoCelebrate = new ArrayList<String>();
		celebratedInBoth = new ArrayList<String>();
		whatToWear = new ArrayList<String>();
		foodAndDrinks = new ArrayList<String>();
		pages = new ArrayList<Page>();
		pages.add(new HomeScreen(this));
		pages.add(new AllHolidaysScreen(16, this, false));

	}

	public void parseFile() {
		BufferedReader br = null;
		try {
			// turns excel file into something Java can read
			br = new BufferedReader(new FileReader("src/denmarkProject/holidays.csv"));
			String line;

			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				for (String s : values) {
//					System.out.println(s);
				}
//				System.out.println(values);

				// assigns info in excel sheet to respective ArrayList
				holidayNames.add(values[0]);
				holidayDates.add(values[1]);
				holidayHistory.add(values[2]);
				// System.out.println(values[2]);
				howtoCelebrate.add(values[3]);
				celebratedInBoth.add(values[6]);
				whatToWear.add(values[5]);
				foodAndDrinks.add(values[4]);

			}

//			System.out.println(holidayNames);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void nextPage() {
		this.currentpage++;
	}

	public void paintComponent(Graphics g) {

	}

	public void update() {
		parseFile();
		pages.get(currentpage).drawPage();
	}

}
