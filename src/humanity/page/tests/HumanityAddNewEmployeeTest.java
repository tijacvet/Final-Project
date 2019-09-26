package humanity.page.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTest {

	public static boolean testHumanity() throws IOException {
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
		
		//this is an example for adding multiple employees listed from Excel file
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
		return true;
	}
}