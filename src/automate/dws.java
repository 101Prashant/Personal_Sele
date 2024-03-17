package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open browser
 WebDriver Demo = new ChromeDriver();
 //Maximize 
 Demo.manage().window().maximize();
 // Enter the DWS Webpage
 Demo.get("https://demowebshop.tricentis.com/");
   WebElement Shoppingcart = Demo.findElement(By.className("cart-label"));
   Shoppingcart.click();
	}

}
