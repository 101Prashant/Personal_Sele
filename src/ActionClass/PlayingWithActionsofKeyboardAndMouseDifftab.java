package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlayingWithActionsofKeyboardAndMouseDifftab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://demowebshop.tricentis.com/");
      Actions act = new Actions(driver);
    List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul[1]/li/a"));
    for (WebElement follow : links) {
    	//Here we are opening different tabs same window
    	act.keyDown(Keys.LEFT_CONTROL).click(follow).build().perform();
    	Thread.sleep(2000);
    }
      
	}

}
