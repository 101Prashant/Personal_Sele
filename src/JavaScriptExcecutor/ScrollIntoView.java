package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          driver.get("https://www.skillrary.com/");
       WebElement target = driver.findElement(By.xpath("//h2[text()='Our Services']"));
          JavascriptExecutor js = (JavascriptExecutor) driver;
          //"ture" means our target element will be at top
        //  js.executeScript("arguments[0].scrollIntoView(true);",target );
          //"false" means our target element will be at bottom
          js.executeScript("arguments[0].scrollIntoView(false);",target);

	}

}
