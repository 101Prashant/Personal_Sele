package JavaScriptExcecutor;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SkillRary_assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.navigate().to("https://www.skillrary.com/");
WebElement Gear = driver.findElement(By.xpath("//div[@class='menu_container']"));
 Actions act = new Actions(driver);
 act.moveToElement(Gear).build().perform();
 driver.findElement(By.xpath(" //a[text()=' SkillRary Demo APP']")).click();
   Set<String> demo = driver.getWindowHandles();
   System.out.println(demo);
   for (String newwin : demo) {
	driver.switchTo().window(newwin);
   }
   JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement Sub_Id = driver.findElement(By.xpath("//input[@class='form-control']"));
   js.executeScript("arguments[0].value = 'Need to go home'",Sub_Id );
   
	}

}
