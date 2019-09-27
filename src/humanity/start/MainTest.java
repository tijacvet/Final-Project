package humanity.start;

import java.util.Scanner;

import humanity.page.tests.HumanityAddNewEmployeeTest;
import humanity.page.tests.HumanityEditStaffTest;
import humanity.page.tests.HumanityLoginTest;
import humanity.page.tests.HumanitySettingsTest;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("*** Testing www.humanity.com *** \n");
		System.out.println("           Test choice:\n");
		System.out.println("1 - For testing the Login page.\n");
		System.out.println("2 - For Add New Employees test.\n");
		System.out.println("3 - For Edit Staff Data test.\n"); 
		System.out.println("4 - For testing the Settings page.\n");
		System.out.println("5 - For test it all at once.\n");
		System.out.println("0 - EXIT \n");
		try {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			do {
				switch (num) {
				case 1:
					// testing the page entrance
					HumanityLoginTest.testHumanity();
					break;
				case 2:
					// Testing adding new employees
					HumanityAddNewEmployeeTest.testHumanity();
					break;
				case 3:
//!!!!!!!!!!!!!!!!ovaj test se iz nekog razloga vrti beskonacno, odradi se test, pa se opet radi....
					// testing if we can change nickname and add picture for an employee
					HumanityEditStaffTest.testHumanity();
					break;
				case 4:
					// test Settings page
					HumanitySettingsTest.testHumanity();
					break;
				case 5:
					// run all tests one after the other
					HumanityLoginTest.testHumanity();
					HumanityAddNewEmployeeTest.testHumanity();
					HumanityEditStaffTest.testHumanity();
					HumanitySettingsTest.testHumanity();
					break;
				default:
					System.out.println("Please choose again.\n");
					break;
				}
			} while (num != 0);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Testing is over :)");
		}
	}
}