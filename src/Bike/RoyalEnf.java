package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnf {
@Test()
public void royalEnf() {
	 WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.royalenfield.com/in/en/home");
	  driver.quit();
}
}
