package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframprac1 {
  public static void main (String[]args) {
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("file:///C:/Users/HP/Downloads/iframe.html");
	  driver.findElement(By.xpath("//a[@href='http://google.com']")).click();
	  driver.navigate().back();
	  driver.switchTo().frame("FR1");
	  driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Demo-search");
	  
  }
}
