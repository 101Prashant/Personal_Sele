package Categories ;
import static org.testng.Assert.assertEquals;

import java.beans.Visibility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Login {
@Test
public void login() throws IOException {
	String Dashboard_URL = "http://itsm.qa.icyberpro.in/rits/dashboard";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("http://itsm.qa.icyberpro.in/rits/userLogin");
	Elements lg = new Elements(driver);
	lg.EMail("its.sumank@icyberpro.in");
	lg.pass("Abcd@1234");
	lg.submit();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.urlToBe(Dashboard_URL));
    String Dashboard = driver.getCurrentUrl();
    assertEquals(Dashboard_URL, Dashboard);
	TakesScreenshot tk = (TakesScreenshot) driver;
	 File from = tk.getScreenshotAs(OutputType.FILE);
	 File to = new File("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Dashboard1.png");
	 FileHandler.copy(from,to);
	 
	
	
	
	
}
}
