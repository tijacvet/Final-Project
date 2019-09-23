package humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTest {
	
	public static boolean testHumanity() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// go to the website
		driver.get(HumanityHome.HUMANITY_HOME_URL);
		// wait for the page to load
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// max the browser for the unchanged HTML elements
		driver.manage().window().maximize();

		HumanityHome.clickLoginButton(driver);

		HumanityHome.sendKeysEmailField(driver, "dixeg@247web.net");
		HumanityHome.sendKeysPasswordField(driver, "Petardoo");
		HumanityHome.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//new code
		HumanityMenu.clickStaffButton(driver);
		
		HumanityStaff.clickAddEmployeeButton(driver);
		
		HumanityStaff.sendKeysFirstNameField(driver, "Luka");
		HumanityStaff.sendKeysLastNameField(driver, "Belic");
		HumanityStaff.sendKeysEmailField(driver, "belac1@gmail.com");
		HumanityStaff.clickSaveEmployeesButton(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.quit();
		return true;
	}
	
}
