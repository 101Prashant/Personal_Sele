package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBYAndTO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
             driver.get("https://www.skillrary.com/");
             JavascriptExecutor js = (JavascriptExecutor) driver;
             Thread.sleep(2000);
        //   js.executeScript("window.scrollBy(0,2000);");
            js.executeScript("window.scrollTo(0,3000);");
            js.executeScript("window.scrollTo(0,-2000);");
	}

}
