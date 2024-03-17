package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ducati_in {
@Test(groups = "Smoke")
public void ducati() {
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.ducati.com/in/en/home");
driver.quit();
}
}
 