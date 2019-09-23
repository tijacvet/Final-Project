package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String HUMANITY_HOME_URL = "https://www.humanity.com/app/";
	private static final String EMAIL_XPATH = "//input[@id='email']";
	private static final String PASSWORD_XPATH = "//input[@id='password']";
	private static final String LOGIN_BUTTON_XPATH = "//button[contains(text(),'Log in')]";
	private static final String START_MY_FREE_TRIAL_BUTTON_XPATH = "//a[@class='button pale']";
	private static final String FULL_NAME_FIELD_XPATH = "//div[@class='form-group']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL_FIELD_XPATH = "//div[@class='form-group']//input[@placeholder='Work Email']";
	private static final String START_MY_FREE_TRIAL_MANY_BUTTON_XPATH = "//input[@id='popup-free-trial-link']";
	private static final String START_PAGE_FULL_NAME_FIELD_XPATH ="//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String START_PAGE_WORK_EMAIL_FIELD_XPATH ="//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String START_PAGE_START_MY_FREE_TRIAL_MANY_BUTTON_XPATH = "//input[@id='free-trial-link-01']";
	private static final String ABOUT_US_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_XPATH));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}
	
	public static WebElement getEmailField(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmailField(WebDriver driver) {
		getEmailField(driver).click();
	}

	public static void sendKeysEmailField(WebDriver driver, String data) {
		getEmailField(driver).sendKeys(data);
	}

	public static WebElement getPasswordField(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}

	public static void clickPasswordField(WebDriver driver) {
		getPasswordField(driver).click();
	}

	public static void sendKeysPasswordField(WebDriver driver, String data) {
		getPasswordField(driver).sendKeys(data);
	}

	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

	public static WebElement getStartMyFreeTrialButton(WebDriver driver) {
		return driver.findElement(By.xpath(START_MY_FREE_TRIAL_BUTTON_XPATH));
	}

	public static void clickStartMyFreeTrialButton(WebDriver driver) {
		getStartMyFreeTrialButton(driver).click();
	}

	public static WebElement getFullNameField(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME_FIELD_XPATH));
	}

	public static void clickFullNameField(WebDriver driver) {
		getFullNameField(driver).click();
	}

	public static void sendKeysFullNameField(WebDriver driver, String data) {
		getFullNameField(driver).sendKeys(data);

	}

	public static WebElement getWorkEmailField(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL_FIELD_XPATH));
	}

	public static void clickWorkEmailField(WebDriver driver) {
		getWorkEmailField(driver).click();
	}

	public static void sendKeysWorkEmailField(WebDriver driver, String data) {
		getWorkEmailField(driver).sendKeys(data);
	}

	public static WebElement getStartMyFreeTrialManyButton(WebDriver driver) {
		return driver.findElement(By.xpath(START_MY_FREE_TRIAL_MANY_BUTTON_XPATH));
	}

	public static void clickStartMyFreeTrialManyButton(WebDriver driver) {
		getStartMyFreeTrialManyButton(driver).click();
	}

	public static WebElement getStartPageFullNameField(WebDriver driver) {
		return driver.findElement(By.xpath(START_PAGE_FULL_NAME_FIELD_XPATH));
	}

	public static void clickStartPageFullNameField(WebDriver driver) {
		getStartPageFullNameField(driver).click();
	}

	public static void sendKeysStartPageFullNameField(WebDriver driver, String data) {
		getStartPageFullNameField(driver).sendKeys(data);

	}

	public static WebElement getStartPageWorkEmailField(WebDriver driver) {
		return driver.findElement(By.xpath(START_PAGE_WORK_EMAIL_FIELD_XPATH));
	}

	public static void clickStartPageWorkEmailField(WebDriver driver) {
		getStartPageWorkEmailField(driver).click();
	}

	public static void sendKeysStartPageWorkEmailField(WebDriver driver, String data) {
		getStartPageWorkEmailField(driver).sendKeys(data);
	}

	public static WebElement getStartPageStartMyFreeTrialManyButton(WebDriver driver) {
		return driver.findElement(By.xpath(START_PAGE_START_MY_FREE_TRIAL_MANY_BUTTON_XPATH));
	}

	public static void clickStartPageStartMyFreeTrialManyButton(WebDriver driver) {
		getStartPageStartMyFreeTrialManyButton(driver).click();
	}
}
