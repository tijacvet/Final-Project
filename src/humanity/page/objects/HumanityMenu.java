package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {

	private static final String DASHBOARD_BUTTON_XPATH = "//p[contains(text(),'Dashboard')]";
	private static final String SHIFT_PLANNING_BUTTON_XPATH = "//i[@class='primNavQtip__icon icon-shiftPlanning']";
	private static final String TIME_CLOCK_BUTTON_XPATH = "//i[@class='primNavQtip__icon icon-timeclock']";
	private static final String LEAVE_BUTTON_XPATH = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_BUTTON_XPATH = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF_BUTTON_XPATH = "//i[@class='primNavQtip__icon icon-user']";
	private static final String PAYROLL_BUTTON_XPATH = "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static final String REPORTS_BUTTON_XPATH = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	private static final String SETTINGS_BUTTON_XPATH= "//i[@class='primNavQtip__icon icon-gear']";
	
	public static WebElement getDashboardButton(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_BUTTON_XPATH));
	}

	public static void clickDashboardButton(WebDriver driver) {
		getDashboardButton(driver).click();
	}

	public static WebElement getShiftPlanningButton(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING_BUTTON_XPATH));
	}

	public static void clickShiftPlanningButton(WebDriver driver) {
		getShiftPlanningButton(driver).click();
	}

	public static WebElement getTimeClockButton(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK_BUTTON_XPATH));
	}

	public static void clickTimeClockButton(WebDriver driver) {
		getTimeClockButton(driver).click();
	}

	public static WebElement getLeaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_BUTTON_XPATH));
	}

	public static void clickLeaveButton(WebDriver driver) {
		getLeaveButton(driver).click();
	}

	public static WebElement getTrainingButton(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_BUTTON_XPATH));
	}

	public static void clickTrainingButton(WebDriver driver) {
		getTrainingButton(driver).click();
	}

	public static WebElement getStaffButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_BUTTON_XPATH));
	}

	public static void clickStaffButton(WebDriver driver) {
		getStaffButton(driver).click();
	}

	public static WebElement getPayrollButton(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_BUTTON_XPATH));
	}

	public static void clickPayrollButton(WebDriver driver) {
		getPayrollButton(driver).click();
	}

	public static WebElement getReportsButton(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_BUTTON_XPATH));
	}

	public static void clickReportsButton(WebDriver driver) {
		getReportsButton(driver).click();
	}
	
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON_XPATH));
	}

	public static void clickSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}
}
