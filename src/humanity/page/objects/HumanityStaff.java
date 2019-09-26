package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	private static final String ADD_EMPLOYEE_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String FIRST_NAME_FIELD_XPATH = "//input[@id='_asf";
	private static final String LAST_NAME_FIELD_XPATH = "//input[@id='_asl";
	private static final String EMAIL_FIELD_XPATH = "//input[@id='_ase";
	private static final String XPATH_END="']";
	private static final String SAVE_EMPLOYEES_BUTTON_XPATH = "//button[@id='_as_save_multiple']";

	private static final String EMPLOYEES_POSSITION_XPATH = "//a[contains(text(),'";
	private static final String EMPLOYEES_POSSITION_XPATH_END = "')]";
	private static final String PUNO_IME_MENADZERA= "Petar Petrovic";

	public static WebElement getEmployeesPossition(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEES_POSSITION_XPATH+PUNO_IME_MENADZERA+EMPLOYEES_POSSITION_XPATH_END));
	}

	public static void clickEmployeesPossition(WebDriver driver) {
		getEmployeesPossition(driver).click();
	}

	public static WebElement getAddEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_BUTTON_XPATH));
	}

	public static void clickAddEmployeeButton(WebDriver driver) {
		getAddEmployeeButton(driver).click();
	}

	public static WebElement getFirstNameField(WebDriver driver, int number) {
		return driver.findElement(By.xpath(FIRST_NAME_FIELD_XPATH+number+XPATH_END));
	}

	public static void clickFirstNameField(WebDriver driver, int number) {
		getFirstNameField(driver, number).click();
	}

	public static void sendKeysFirstNameField(WebDriver driver, int number, String data) {
		getFirstNameField(driver, number).sendKeys(data);
	}

	public static WebElement getLastNameField(WebDriver driver, int number) {
		return driver.findElement(By.xpath(LAST_NAME_FIELD_XPATH+number+XPATH_END));
	}

	public static void clickLastNameField(WebDriver driver, int number) {
		getLastNameField(driver, number).click();
	}

	public static void sendKeysLastNameField(WebDriver driver, int number, String data) {
		getLastNameField(driver, number).sendKeys(data);
	}

	public static WebElement getEmailField(WebDriver driver, int number) {
		return driver.findElement(By.xpath(EMAIL_FIELD_XPATH+number+XPATH_END));
	}

	public static void clickEmailField(WebDriver driver, int number) {
		getEmailField(driver, number).click();
	}

	public static void sendKeysEmailField(WebDriver driver, int number, String data) {
		getEmailField(driver, number).sendKeys(data);
	}

	public static WebElement getSaveEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEES_BUTTON_XPATH));
	}

	public static void clickSaveEmployeesButton(WebDriver driver) {
		getSaveEmployeesButton(driver).click();
	}
	public static WebElement getPunoImeMenadzera(WebDriver driver) {
		return driver.findElement(By.xpath(PUNO_IME_MENADZERA));
	}
}
