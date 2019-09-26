package humanity.page.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanitySettings;

public class HumanitySettingsTest {
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

	HumanityHome.sendKeysEmailField(driver, "tena@net1mail.com");
	HumanityHome.sendKeysPasswordField(driver, "Petardoo");
	HumanityHome.clickLoginButton(driver);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	HumanityMenu.getSettingsButton(driver);
	HumanityMenu.clickSettingsButton(driver);
	
	HumanitySettings.getCountry(driver);
	HumanitySettings.inputCountry(driver, "Serbia");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	HumanitySettings.getDefaultLanguage(driver);
	HumanitySettings.inputDefaultLanguage(driver, "Croatian (machine)");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	HumanitySettings.getTheTime(driver);
	HumanitySettings.inputTheTime(driver, "12 hour");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	HumanitySettings.getSaveChanges(driver);
	HumanitySettings.clickSaveChanges(driver);
	
	driver.quit();
	return true;

}
}
