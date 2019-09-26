package humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import humanity.page.objects.HumanityEditStaff;
import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityStaff;

public class HumanityEditStaffTest {
	public static boolean testHumanity() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// go to the website
		driver.get(HumanityHome.HUMANITY_HOME_URL);
		// wait for the page to load
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// max the browser for the unchanged HTML elements
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

		HumanityHome.clickLoginButton(driver);

		HumanityHome.sendKeysEmailField(driver, "tena@net1mail.com");
		HumanityHome.sendKeysPasswordField(driver, "Petardoo");
		HumanityHome.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		HumanityMenu.getStaffButton(driver);
		HumanityMenu.clickStaffButton(driver);
		
		HumanityStaff.getEmployeesPossition(driver);
		HumanityStaff.clickEmployeesPossition(driver);
		
		HumanityEditStaff.getEditDetailsButton(driver);
		HumanityEditStaff.clickEditDetailsButton(driver);
		
		HumanityEditStaff.getNicknameField(driver);
		HumanityEditStaff.sendKeysNicknameField(driver, "Comrad");
		HumanityEditStaff.getUploadPictureButton(driver);
		HumanityEditStaff.sendImage(driver);
		HumanityEditStaff.getSaveUpdatedEmployeeInfoButton(driver);
		HumanityEditStaff.clickSaveUpdatedEmployeeInfoButton(driver);
		HumanityMenu.getStaffButton(driver);
		HumanityMenu.clickStaffButton(driver);
		
		Thread.sleep(2000);
		driver.quit();
		return true;
	}
}
