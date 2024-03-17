package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertMethod {

	@Test
	public void dws() {
		WebDriver driver = new ChromeDriver();
		String expected_URL = "https://demowebshop.tricentis.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String Actual_URL = driver.getCurrentUrl();
		SoftAssert as = new SoftAssert();
		assertEquals(expected_URL,Actual_URL, "Its not matching");
	//	assertNotEquals(expected_URL,Actual_URL);
		System.out.println("My Script is successfull...");
		driver.close();
		as.assertAll();
	
	
	}
}
