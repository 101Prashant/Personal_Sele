package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertConfimrationAlertPromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Name = "prashant";
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.automationtesting.in/Alerts.html");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//Thread.sleep(3000);
//Alert art = driver.switchTo().alert();
//Thread.sleep(3000);
//art.accept();

//  for OK & Cancel
//driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
//driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
//Thread.sleep(3000);
//Alert art1 = driver.switchTo().alert();
//Thread.sleep(3000);
//art1.dismiss() ; 

//Text field and Confirm 

driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
Thread.sleep(3000);
Alert art2 = driver.switchTo().alert();
Thread.sleep(2000);
art2.sendKeys(Name);
  //art2.getText();
art2.accept();
  String a = driver.findElement(By.id("demo1")).getText();
  if (a.contains(Name)) {
	  System.out.println("pass");
  }
  else {
	  System.out.println("fail");

  }
	}
}
