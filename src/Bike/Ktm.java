package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ktm {
@Test()
public void ktm() {
	 WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.ktm.com/en-in.html");
	  driver.quit();
}
}
