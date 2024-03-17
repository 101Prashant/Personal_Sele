package TestNgParameter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Parameters({"URL", "URL1"})
	   @Test
	   public void launch(String DURL , String DURL1) {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.navigate().to(DURL);
		   driver.navigate().to(DURL1);
		   
	   }
}
    



// Cross Browser complete the task 
//Then to the login for dws 