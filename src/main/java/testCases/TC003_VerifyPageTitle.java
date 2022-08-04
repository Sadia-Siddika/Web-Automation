package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverSetup;

public class TC003_VerifyPageTitle extends DriverSetup{
	
	public String baseUrl="http://automationpractice.com/index.php";
	
	
	@Test(priority=1)
	public void verifyPageTitle_shouldPass() {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		String foundTitleFromWebsite=driver.getTitle();
		
		SoftAssert softly = new SoftAssert();
		softly.assertEquals(foundTitleFromWebsite, "My Store");
		
		
		softly.assertAll();
  }
	
	@Test(priority=2)
	public static void isWebSiteSecured() {
		String url=driver.getCurrentUrl();
		
		if (url.contains("https")) {
			System.out.println("Site is secured");
		}else {
			System.out.println("Site is not secured");
		}
	}
}
