package humanity.page.tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import humanity.page.objects.HumanityEditStaff;
import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanitySettings;
import humanity.page.objects.HumanityStaff;

public class HumanityTestNG {
	//testing the Login feature with extracted data from Excel sheet
	@Test
	public void LoginTestPOI() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// go to the website
		driver.get(HumanityHome.HUMANITY_HOME_URL);
		// wait for the page to load
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// max the browser for the unchanged HTML elements
		driver.manage().window().maximize();

		HumanityHome.clickLoginButton(driver);

		String srcFile = "Data.xls";
		File src = new File(srcFile);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wbe = new HSSFWorkbook(fis);
		HSSFSheet sheet0 = wbe.getSheetAt(0);
		HSSFRow r = sheet0.getRow(2);
		String emailOrUsername = r.getCell(0).getStringCellValue();
		String password = r.getCell(1).getStringCellValue();

		HumanityHome.sendKeysEmailField(driver, emailOrUsername);
		HumanityHome.sendKeysPasswordField(driver, password);

		HumanityHome.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		assertEquals(driver.getCurrentUrl(), HumanityHome.getHumanityHomeUrl(driver));
		wbe.close();
		driver.quit();
	}
	//on Profile page we check if we can change one's profile picture and nickname, and check if it is all saved
	@Test
	public void profilePageTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.HUMANITY_HOME_URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(HumanityEditStaff.getNicknameField(driver), "Comrad");
		System.out.println();
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void TestAddingNewEmployeesPOI() throws IOException {
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

		// new code
		HumanityMenu.clickStaffButton(driver);

		HumanityStaff.clickAddEmployeeButton(driver);

//		//This is an example for adding only one new employee
//		HumanityStaff.sendKeysFirstNameField(driver, "Mahatma");
//		HumanityStaff.sendKeysLastNameField(driver, "Gandi");
//		HumanityStaff.sendKeysEmailField(driver, "peace_out@gmail.com");

		// this is an example for adding multiple employees listed from Excel file
		String srcFile = "Data.xls";
		File src = new File(srcFile);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wbe = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wbe.getSheetAt(1);
		int rowcount = sheet1.getLastRowNum();

		try {
			for (int i = 1; i <= rowcount; i++) {
				HSSFRow r = sheet1.getRow(i);
				if (r != null) {
					String firstName = r.getCell(0).getStringCellValue();
					String lastName = r.getCell(1).getStringCellValue();
					String email = r.getCell(2).getStringCellValue();

					HumanityStaff.sendKeysFirstNameField(driver, i, firstName);
					HumanityStaff.sendKeysLastNameField(driver, i, lastName);
					HumanityStaff.sendKeysEmailField(driver, i, email);
				}

				else {
					HumanityStaff.clickSaveEmployeesButton(driver);
				}
				wbe.close();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			HumanityStaff.clickSaveEmployeesButton(driver);
			HumanityMenu.clickStaffButton(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		driver.quit();
	}

	@Test
	public void testTheSettings() {

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

	}

}