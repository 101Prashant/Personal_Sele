package SeleniumWaits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explictewaitpract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		 WebDriver driver  = new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://omayo.blogspot.com/");
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(9));
         
         // Disable BUtton 
         //Element is clickable
      WebElement timer_button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Button3']")));
      timer_button.click();
      Alert art = driver.switchTo().alert();
      art.accept();
      driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
    WebElement flipkart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
    flipkart.click();
           
	}

}
