package Assertion;

import static org.testng.Assert.assertEquals;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class practiceTask {

	@Test
	public void dws() {
		String URL = "https://demowebshop.tricentis.com/";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
	driver.get(URL);
	String Actual_URL = driver.getCurrentUrl();
	assertEquals(URL, Actual_URL, "URL is matched");
  WebElement Search = driver.findElement(By.id("small-searchterms"));
   SoftAssert as = new SoftAssert();
   as.assertTrue(Search.isEnabled(), "Search field is enabled");
   WebElement Search_button = driver.findElement(By.xpath("//input[@value='Search']"));
   //The Text we are pass in the method decleration it will only printed when there is an exception and it will be viisble in the Console and Report
   //Below statement is ts the example for it  
   as.assertTrue(Search_button.isSelected(), "Search button is enabled");
  as.assertAll();
  
	
	}
}
