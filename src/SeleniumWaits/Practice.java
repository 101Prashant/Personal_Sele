package SeleniumWaits;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 WebDriver driver  = new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://demo.automationtesting.in/Register.html");
         driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
         driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("User");
         driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Test Data");
         driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test@yopmil.com");
         driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("909090");
         driver.findElement(By.xpath("//input[@value='Male']")).click();
      List<WebElement> hobbies = driver.findElements(By.xpath("//input[@type='checkbox']"));
      for (WebElement sel : hobbies) {
		   sel.click();
		   Thread.sleep(2000);
	}
          driver.findElement(By.xpath("//div[@id='msdd']")).click();
          driver.findElement(By.xpath("//a[text()='Danish']")).click();
          driver.findElement(By.xpath("//a[text()='English']")).click();
      WebElement  skill = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
      Select sel = new Select(skill);
      sel.selectByValue("Client Server");
     driver.findElement(By.xpath("//span[@role='combobox']")).click();
     driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
       Robot rbt = new Robot();
       rbt.keyPress(KeyEvent.VK_ENTER);
    WebElement year = driver.findElement(By.id("yearbox"));
    Select sel_year = new Select(year);
    sel_year.selectByValue("1928");
    
  WebElement month  = driver.findElement(By.xpath("//select[@placeholder='Month']"));
    Select sel_month = new Select (month);
    sel_month.selectByIndex(12);//Selecting December
    
   WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
   Select sel_day = new Select (day);
   String pass = "test@123";
   sel_day.selectByVisibleText("5");
   driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pass);
   driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(pass);
   driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("E:\\Quality Analyst Test 26.10.2023_01 - Test summary.pdf");
   
   
   
     
	}
}
