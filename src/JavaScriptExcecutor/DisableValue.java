package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.navigate().to("https://www.facebook.com/signup");
  JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement hidden_textfield = driver.findElement(By.xpath("//input[@name='custom_gender']"));
    js.executeScript("arguments[0].value='Test User'", hidden_textfield);
	}

}
