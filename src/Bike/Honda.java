package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Honda {
  @Test()
  public void honda() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.honda2wheelersindia.com/");
	  driver.quit();
	  
  }
}
