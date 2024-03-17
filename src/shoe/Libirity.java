package shoe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Libirity {
 @Test()
 public void liberty() {
	 WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.libertyshoesonline.com/");
	  driver.quit();
 }
}
