package shoe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adidas {
  @Test(groups = "regression")
  public void adidas() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.adidas.co.in/");
	  driver.quit();
	  
  }
}
