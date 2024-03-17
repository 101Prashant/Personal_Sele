package automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register extends Base {
   //This is an assignment to register on DWS
	public static void main(String[]args) throws InterruptedException {
		// first we will create instance of 
//		WebDriver test = new ChromeDriver();
//		//  first we ill maximize the Brower tab and then We will access the webpage DWS 
//		test .manage().window().maximize();
		precondition();
		test.get("https://demowebshop.tricentis.com/");
		//Now we will find the web Element of Register button 
		//Delaying the Exceution of thread by 3 secs
		//Thread.sleep(3000);
	//	test.findElement(By.className("ico-register")).click();
		//Now we are o Register screen 
		//First we will fill the Personal Details
		Thread.sleep(3000);
		//Gender selection
		//test.findElement(By.id("gender-male")).click();
		//FirstName
		//test.findElement(By.id("FirstName")).sendKeys("Test");
		//Last Name
//		test.findElement(By.id("LastName")).sendKeys("User");
//		//Email
//		test.findElement(By.name("Email")).sendKeys("testop15191@yopmail.com");
//		//Now Setting Password 
//		Thread.sleep(5000);
//		//Stroe Password in a string variable named as pass.
//		String pass = "Floortest@212" ;  
//		test.findElement(By.id("Password")).sendKeys(pass);
//		test.findElement(By.id("ConfirmPassword")).sendKeys(pass);
//		Thread.sleep(3000);
//		test.findElement(By.name("register-button")).click();
		//Logging Out of the Account
		Thread.sleep(3000);
		//test.findElement(By.cssSelector("a[href='/logout']")).click();
		//postcondition();
	//	precondition1();
	//	postcondition1();
	//	test.findElement(By.id("pollanswers-1")).click();
	//	test.findElement(By.id("pollanswers-2")).click();
		//test.findElement(By.id("pollanswers-3")).click();
List<WebElement> poll = test.findElements(By.cssSelector("input[type='radio']"));
for (WebElement web : poll) {
	web.click();
}
	}
}
