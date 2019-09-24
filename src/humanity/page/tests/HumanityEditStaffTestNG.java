//package humanity.page.tests;
//
//import org.testng.annotations.Test;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import humanity.page.objects.HumanityHome;
//import humanity.page.objects.HumanityMenu;
//
//public class HumanityEditStaffTestNG {
//  @Test
//  public void testThe() {
//	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");  
//		WebDriver driver = new ChromeDriver();
//		
//try {
//			
//	driver.get(HumanityHome.HUMANITY_HOME_URL);
//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//	HumanityHome.clickLoginButton(driver);
//
//	HumanityHome.sendKeysEmailField(driver, "dixeg@247web.net");
//	HumanityHome.sendKeysPasswordField(driver, "Petardoo");
//	HumanityHome.clickLoginButton(driver);
//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//	
//	
//	HumanityHome.getStaffButton();
//	
////			System.out.println(driver.getCurrentUrl());
////			Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
//	Thread.sleep(4000);
//		}catch(Exception e) {
//			System.out.println(e.toString());
//		}	
//		
//		
//		driver.quit();
//  }
//}
