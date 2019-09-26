package humanity.page.objects;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanitySettings {
	private static final String COUNTRY_XPATH = "//select[@id='country']";
	private static final String DEFAULT_LANGUAGE_XPATH = "//td[@class='nowrap']//select[@name='language']";
	private static final String TIME_FORMAT_XPATH = "//select[@name='pref_24hr']";
	private static final String SAVE_CHANGES_XPATH="//button[@id='_save_settings_button']";
	
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_XPATH)));
	}

	public static void inputCountry(WebDriver driver,String data) {
		getCountry(driver).selectByVisibleText(data);
	}
	
	public static Select getDefaultLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(DEFAULT_LANGUAGE_XPATH)));
	}

	public static void inputDefaultLanguage(WebDriver driver,String data) {
		getDefaultLanguage(driver).selectByVisibleText(data);
	}
	public static WebElement getSaveChanges(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_CHANGES_XPATH));
	}

	public static void clickSaveChanges(WebDriver driver) {
		getSaveChanges(driver).click();
	}
	//arrow up, or arrow down
	public static Select getTheTime(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIME_FORMAT_XPATH)));
	}

	public static void inputTheTime(WebDriver driver,String data) {
		getTheTime(driver).selectByVisibleText(data);
	}
}
