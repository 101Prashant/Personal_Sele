package TestNgBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class HelpherMehod_threadpoolsize {
	
	
	// threadpoolsize count show how many browser will get open but it is based on the invocaton count means if invocation count is 2 and threadpoolssize is 3 thne the it will open only 2 browser and will not show any error
	// thread pool size can be lower then the invocation count 
	
	public class Launch {
		
		   @Test (priority = 3)
		   public void Browser_lauch() {
			   WebDriver driver = new ChromeDriver();
			   driver.navigate().to("https://demowebshop.tricentis.com/");
			   driver.close();
			   Reporter.log("Hi hello",true); 
		   }
		   @Test (priority = 11, invocationCount = 3 , threadPoolSize = 0)
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
		   @Test (priority = 0 , invocationCount =2 )
		   public void redbus1() {
			   WebDriver driver = new ChromeDriver();
			   driver.navigate().to("https://www.redbus.in/");
			   driver.close();
			   Reporter.log("Hi hello22",true); 
		   }
		}

}


