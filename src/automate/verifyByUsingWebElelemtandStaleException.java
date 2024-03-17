package automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifyByUsingWebElelemtandStaleException {
   public static void main (String[]args) throws InterruptedException {
	   WebDriver dev = new ChromeDriver();
	   dev.manage().window().maximize();
	   dev.get("https://demowebshop.tricentis.com/");
	  WebElement Digi_download  = dev.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
	   if (Digi_download.isDisplayed()) {
		   System.out.println("WEbElement is successfully verified");
		   if (true) {
			   Digi_download.click();
			   Thread.sleep(3000);
			   WebElement Sort_by = dev.findElement(By.xpath("//select[@name='products-orderby']"));
			  Select sort =  new Select (Sort_by);
		List<WebElement> post	=  sort.getOptions();
		System.out.println(post);
		int i = 0;
		for (WebElement set : post) {
			sort.selectByIndex(i++);
			Thread.sleep(3000);
			//TO handle STALELEMENT eXCEPTION WE HAVE AGAIN PASSED OUR TARGETED ELEMENT
			Sort_by = dev.findElement(By.xpath("//select[@name='products-orderby']"));
			 sort =  new Select (Sort_by);
			//set.click();
		}
                  
		   }
	   }
	   
   }
}
 