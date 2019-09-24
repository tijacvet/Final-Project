package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	
	private static final String PROFILE_PICTURE_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String SIGN_OUT_BUTTON_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String PROFILE_BUTTON_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_BUTTON_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_BUTTON_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String HUMANITY_APP_VERSION_XPATH= "//b[contains(text(),'9.5.5')]";
	
	public static WebElement getProfilePicture(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_PICTURE_XPATH));
	}

	public static void clickProfilePicture(WebDriver driver) {
		getProfilePicture(driver).click();
	}

	public static WebElement getSignOutButton(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT_BUTTON_XPATH));
	}
	public static void clickSignOutButton(WebDriver driver) {
		getSignOutButton(driver).click();
	}
	
	public static WebElement getProfileButton (WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_BUTTON_XPATH));
	}

	public static void clicProfileButton(WebDriver driver) {
		getProfileButton (driver).click();
	}
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON_XPATH));
	}

	public static void clickSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}
	public static WebElement getAvailabilityButton(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_BUTTON_XPATH));
	}

	public static void clickAvailabilityButton(WebDriver driver) {
		getAvailabilityButton(driver).click();
	}
	public static WebElement getHumanityAppVersion(WebDriver driver) {
		return driver.findElement(By.xpath(HUMANITY_APP_VERSION_XPATH));
	}
}
