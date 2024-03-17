package TestNgBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch {
   @Test (priority = 3)
   public void Browser_lauch() {
	   WebDriver driver = new ChromeDriver();
	   driver.navigate().to("https://demowebshop.tricentis.com/");
	   driver.close();
	   Reporter.log("Hi hello",true); 
   }
   @Test (priority = 11)
   public void easymytrip() {
	   WebDriver driver = new ChromeDriver();
	   driver.navigate().to("https://www.easemytrip.com/");
	   driver.close();
	   Reporter.log("Hi hello",true); 
   }
   @Test (priority = -2)
   public void redbus2() {
	   WebDriver driver = new ChromeDriver();
	   driver.navigate().to("https://www.redbus.in/");
	   driver.close();
	   Reporter.log("Hi hello",true); 
	    
   }
   @Test (priority = 0)
   public void redbus1() {
	   WebDriver driver = new ChromeDriver();
	   driver.navigate().to("https://www.redbus.in/");
	   driver.close();
	   Reporter.log("Hi hello22",true); 
   }
}
