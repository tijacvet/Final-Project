package humanity.start;

import humanity.page.tests.HumanityAddNewEmployeeTest;
import humanity.page.tests.HumanityLoginTests;

public class MainTest {

	public static void main(String[] args) {
		try {
		HumanityLoginTests.testHumanity();
		
		HumanityAddNewEmployeeTest.testHumanity();

	} catch (Exception ex) {
		ex.printStackTrace();
	} finally {
		System.out.println("Testing is over :)");
	}
	}
}