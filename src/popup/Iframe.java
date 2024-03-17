package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         //Implict wait ** Always add the Implicat wait just after maximize the browser if you want to add implicit wait
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
         driver.navigate().to("https://www.dream11.com/");
         // now switching to iframe 
         //1. by id/name
//         driver.switchTo().frame("send-sms-iframe");
//         driver.findElement(By.id("regEmail")).sendKeys("9876543");
         //2 by Index
//         driver.switchTo().frame(0);
//         driver.findElement(By.id("regEmail")).sendKeys("00898");
         //3. by webElelemt 
           WebElement frame = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
            driver.switchTo().frame(frame);
           driver.findElement(By.id("regEmail")).sendKeys("0766769876");
           driver.switchTo().defaultContent();
           driver.findElement(By.xpath("//div[@id='hamburger']")).click();


         
         //
	}

}
