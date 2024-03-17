package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertMethods {
 
	@Test
	public void dws() {
		WebDriver driver = new ChromeDriver();
		String expected_URL = "https://demowebshop.tricentis.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String Actual_URL = driver.getCurrentUrl();
		assertEquals(expected_URL,Actual_URL);
	//	assertNotEquals(expected_URL,Actual_URL);
		System.out.println("My Script is successfull...");
	WebElement Community_pool = driver.findElement(By.id("pollanswers-1"));
	Community_pool.click();
	assertTrue(Community_pool.isSelected());
	System.out.println("my script is successfull...Pool");
	WebElement Community_pool1 = driver.findElement(By.id("pollanswers-2"));
	assertFalse(Community_pool1.isSelected());
	System.out.println("Not Selected");
	
	
	
	
}
	}