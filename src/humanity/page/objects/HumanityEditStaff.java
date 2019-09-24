package humanity.page.objects;

//import java.io.File;
//import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	private static final String EDIT_DETAILS_BUTTON_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String NICKNAME_FIELD_XPATH = "//input[@id='nick_name']";
	private static final String UPLOAD_PICTURE_BUTTON_XPATH = "//input[@id='fileupload']";
	private static final String IMAGE_PATH = "nice lady.jpg";
	private static final String SAVE_EMPLOYEE_BUTTON_XPATH="//button[@id='act_primary']";

//	File picture1 = new File("nice lady.jpg");
//	FileInputStream fis = new FileInputStream(picture1);

	public static WebElement getSaveEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_BUTTON_XPATH));
	}

	public static void clickSaveEmployeeButton(WebDriver driver) {
		getSaveEmployeeButton(driver).click();
	}
	public static WebElement getUploadPictureButton(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_PICTURE_BUTTON_XPATH));
	}

	public static void clickUploadPictureButton(WebDriver driver) {
		getUploadPictureButton(driver).click();
	}

	public static WebElement getNicknameField(WebDriver driver) {
		return driver.findElement(By.xpath(NICKNAME_FIELD_XPATH));
	}

	// set image
	public static void sendImage(WebDriver driver) throws Exception {
		getUploadPictureButton(driver).sendKeys(IMAGE_PATH);
		Thread.sleep(3000);
	}

	public static void clickNicknameField(WebDriver driver) {
		getNicknameField(driver).click();
	}

	public static void sendKeysNicknameField(WebDriver driver, String data) {
		getNicknameField(driver).sendKeys(data);
	}

	public static WebElement getEditDetailsButton(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_BUTTON_XPATH));
	}

	public static void clickEditDetailsButton(WebDriver driver) {
		getEditDetailsButton(driver).click();
	}

//	public static void changeNickAndPict(WebDriver driver) {
//		Actions a = new Actions(driver);
//		a.moveToElement(HumanityStaff.getEmployeesPossition(driver));
//		a.click();
//		a.moveToElement(getEditDetailsButton(driver));
//		a.click();
//		a.moveToElement(getNicknameField(driver));
//		a.sendKeys("Che");
//		a.moveToElement(getUploadPictureButton(driver));
//		sendImage(driver);
//		a.build();
//		a.perform();
//	}

}
