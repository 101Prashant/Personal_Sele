package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
     Actions act = new Actions(driver);
      WebElement double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
      Thread.sleep(3000);
      act.doubleClick(double_click).build().perform();
      try {
  		System.out.println("My Script is Unsuccessfull");

	} catch (Exception e) {
		System.out.println("My Script is Successfull");
	}
     
	}

}
