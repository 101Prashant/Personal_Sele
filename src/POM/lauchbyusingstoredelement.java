package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lauchbyusingstoredelement {
@Test
public void launch() {
	WebDriver driver = new ChromeDriver();
	String expected_URL = "https://demowebshop.tricentis.com/";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://demowebshop.tricentis.com/");
	DWS_Elements dws = new DWS_Elements(driver);
	//dws.Searh_field.sendKeys("Books");
	dws.search_filed("CAR");
	dws.Search_button();
	Header hh = new Header(driver);
	hh.Book();
	hh.Computer();
	
}
}
