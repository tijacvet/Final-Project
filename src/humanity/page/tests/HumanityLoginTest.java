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

public class HumanityLoginTest {

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
		wbe.close();
		driver.quit();
		return true;
	}
}