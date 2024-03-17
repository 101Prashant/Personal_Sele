package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandlings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_data = "https://www.facebook.com/nopCommerce";
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.navigate().to("https://demowebshop.tricentis.com/");
   Thread.sleep(2000);
 //  String parent = driver.getWindowHandle();
   driver.findElement(By.xpath("//a[text()='Twitter']")).click();
   Thread.sleep(4000);
   driver.findElement(By.xpath("//a[text()='Facebook']")).click();
   Thread.sleep(4000);
      Set<String> childs = driver.getWindowHandles();
      System.out.println(childs);
      for (String str : childs) {
		driver.switchTo().window(str);
		Thread.sleep(4000);
		String current_data = driver.getCurrentUrl();
		if (given_data.equalsIgnoreCase(current_data)) {
			System.out.println("On Facebook");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Test@yopmai.com");
		}
		else {
			System.out.println("Failed");
		}
	//	Thread.sleep(3000);
	}
   

   
	}

}
