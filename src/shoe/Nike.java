package shoe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nike {
@Test()
public void nike() {
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.nike.com/in/");
driver.quit();
}
}
