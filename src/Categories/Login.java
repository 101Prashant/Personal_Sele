package Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public static WebDriver driver;
 public void log_in() {
	 driver.navigate().to("http://itsm.qa.icyberpro.in/rits/userLogin");
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("its.sumank@icyberpro.in");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@1234");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
 }
}
