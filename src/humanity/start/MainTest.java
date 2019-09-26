package humanity.start;

import humanity.page.tests.HumanityAddNewEmployeeTest;
import humanity.page.tests.HumanityEditStaffTest;
import humanity.page.tests.HumanityLoginTest;
import humanity.page.tests.HumanitySettingsTest;

public class MainTest {

	public static void main(String[] args) {
				
		try {
		//testing the page entrance
		HumanityLoginTest.testHumanity();
			
		//Testing adding new employees
		HumanityAddNewEmployeeTest.testHumanity();
			
		//testing if we can change nickname and add picture for an employee
		HumanityEditStaffTest.testHumanity();
			
		//test Settings page
		HumanitySettingsTest.testHumanity();

	} catch (Exception ex) {
		ex.printStackTrace();
	} finally {
		System.out.println("Testing is over :)");
	}
	}
}