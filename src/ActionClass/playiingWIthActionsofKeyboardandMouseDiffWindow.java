package ActionClass;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class playiingWIthActionsofKeyboardandMouseDiffWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 //Maximize 
		 driver.manage().window().maximize();
		 // Enter the DWS Webpage
		 driver.navigate().to("https://demowebshop.tricentis.com/");
//	List<WebElement> link = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
	List<WebElement> link = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]/li/a"));
	 
	Actions act = new Actions(driver);
	for (WebElement web : link) {
		//Here we are  opening each tab on different window.
		act.keyDown(Keys.SHIFT).click(web).build().perform();
		Thread.sleep(4000);
	}
	//Now here we are getting handles of the windows
	Set<String> handles = driver.getWindowHandles();
	System.out.println(handles);
//	driver.close();
//	driver.quit();
  
	}

}
