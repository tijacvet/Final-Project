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
	private static final String IMAGE_PATH = "C:\\Users\\Tijana\\Desktop\\nice lady.jpg";
	private static final String SAVE_UPDATED_EMPLOYEE_INFO_BUTTON_XPATH="//input[@name='update']";

	// set image
	public static void sendImage(WebDriver driver) throws Exception {
		getUploadPictureButton(driver).sendKeys(IMAGE_PATH);
		Thread.sleep(3000);
	}
	public static WebElement getSaveUpdatedEmployeeInfoButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_UPDATED_EMPLOYEE_INFO_BUTTON_XPATH));
	}

	public static void clickSaveUpdatedEmployeeInfoButton(WebDriver driver) {
		getSaveUpdatedEmployeeInfoButton(driver).click();
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

}
