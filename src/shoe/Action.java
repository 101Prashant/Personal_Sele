package shoe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Action {
@Test( groups = "regression")
public void action() {
	 WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://actionestore.com/");
	  driver.quit();
}
}
