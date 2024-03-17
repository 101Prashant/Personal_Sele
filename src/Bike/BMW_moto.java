package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMW_moto {
 @Test(groups = "Smoke" )
 public void bmwmote() {
	 WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.bmw-motorrad.in/en/home.html#/filter-all");
	  driver.quit();
 }
}
