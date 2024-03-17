package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 //Maximize 
		 driver.manage().window().maximize();
		 // Enter the DWS Webpage
		 driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement Search_filed = driver.findElement(By.id("small-searchterms"));
		 Actions act = new Actions(driver);
		 act.moveToElement(Search_filed).click().sendKeys("Books").build().perform();
		 act.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
	}

}
