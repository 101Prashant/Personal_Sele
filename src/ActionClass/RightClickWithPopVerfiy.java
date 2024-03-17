package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickWithPopVerfiy {
   public static void main(String[]args) throws InterruptedException {
	   WebDriver Driver = new ChromeDriver();
	   Driver.manage().window().maximize();
	   Driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
	   Actions act = new Actions(Driver);
	   Thread.sleep(2000);
	  
	WebElement right_click = Driver.findElement(By.xpath("//span[text()='right click me']"));
	if (right_click.isDisplayed()) {
		System.out.println("Demo page has been successfully verified using webElement by .isDisplayed method");
	act.contextClick(right_click).build().perform();
	Thread.sleep(2000);
	Driver.findElement(By.xpath("//span[text()='Cut']")).click();
	Thread.sleep(2000);
	try {
		right_click.click();
		System.out.println("Script is UnSuccessfull");
	} catch (Exception e) {
		System.out.println("Script is Successfull");

	}
   }
   }
}
