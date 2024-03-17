package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicteWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver  = new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://www.shoppersstack.com/");
         
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
         //Visibility of Element
      WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
      login.click();
      
      //Elementto be clickable
         WebElement Create_btun = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
         Create_btun.click();
         
	}

}
