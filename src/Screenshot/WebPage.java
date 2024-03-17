 package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
               WebDriver driver = new ChromeDriver();
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
               driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
               TakesScreenshot ts = (TakesScreenshot) driver;
               File from = ts.getScreenshotAs(OutputType.FILE);
               File to = new File ("E:\\Downoad.png");
               FileHandler.copy(from, to);
               
	}

	
}
