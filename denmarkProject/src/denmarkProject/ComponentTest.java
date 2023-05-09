package denmarkProject;

import static org.junit.Assert.assertEquals;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Before;
import org.junit.Test;

public class ComponentTest {

	private Component component; // declaring an instance of Component class
	private File file; // declaring an instance of File class

	@Before
	public void setUp() throws Exception {
		component = new Component(); // initializing the Component instance
		file = new File("src/denmarkProject/holidays.csv"); // initializing the File instance with the given file path
	}

	@Test
	public void testParseFile() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(file)); // initializing the BufferedReader instance
																			// with FileReader instance to read the file
		String line = null;
		while ((line = reader.readLine()) != null) { // reads the file line by line
			String[] values = line.split(","); // splits the line into values based on the comma separator

			// The following code tests if the values in the input file match the values in
			// the lists of the component instance
			if (!component.holidayNames.isEmpty()) {
				assertEquals(values[0], component.holidayNames.get(component.holidayNames.size() - 1));
			}
			if (!component.holidayDates.isEmpty()) {
				assertEquals(values[1], component.holidayDates.get(component.holidayDates.size() - 1));
			}
			if (!component.holidayHistory.isEmpty()) {
				assertEquals(values[2], component.holidayHistory.get(component.holidayHistory.size() - 1));
			}
			if (!component.howtoCelebrate.isEmpty()) {
				assertEquals(values[3], component.howtoCelebrate.get(component.howtoCelebrate.size() - 1));
			}
			if (!component.foodAndDrinks.isEmpty()) {
				assertEquals(values[4], component.foodAndDrinks.get(component.foodAndDrinks.size() - 1));
			}
			if (!component.whatToWear.isEmpty()) {
				assertEquals(values[5], component.whatToWear.get(component.whatToWear.size() - 1));
			}
			if (!component.whatToWear.isEmpty()) {
				assertEquals(values[6], component.celebratedInBoth.get(component.celebratedInBoth.size() - 1));
			}
		}
		reader.close(); // close the file
	}
}
