package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukripract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='textWrap']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='uploadAction']")).sendKeys("E:/QA/007.pdf");
		
		  
		
	}
	
}
