package Categories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class IT_ACT extends Login { 

		public static void main(String[] args) throws InterruptedException {
			// TO DO Auto-generated method stub
	          driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.navigate().to("http://itsm.qa.icyberpro.in/rits/userLogin");
	//  Using Method of Child class  Login 
	         Login log = new Login();
	         log.log_in();
	        
	         // now implement Explicte wait with waithing condtn till the targerted element is clickable
	         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[text()='edit']"))).click();
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Incident']"))).click();
	         driver.findElement(By.xpath("//input[@value='individual']")).click();
	         driver.findElement(By.xpath("(//button[@type=\"button\"] )[3]")).click();
	         
	         driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("ind123@icyberpro.in");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']"))).click();
	       //  driver.findElement(By.xpath("")).click();
	         
		}
	
	}
