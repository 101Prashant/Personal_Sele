package automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[]value = {"Test","test@yopmail.com","test1","test1@yopmail.com"};
 WebDriver Demo = new ChromeDriver();
 Demo.manage().window().maximize();
 Demo.get("https://demowebshop.tricentis.com/");
 // Verfiy the Page by gettitle method
   String title = "Demo Web Shop";
    String currenttititle= Demo.getTitle();
    if (title.equalsIgnoreCase(currenttititle)) {
    	System.out.println("I'm on correct page");
    	Thread.sleep(3000);
    	Demo.findElement(By.xpath("(//input[@type='button'])[3]")).click();
    	int i =0;
    	Thread.sleep(3000);
    	List<WebElement>links = Demo.findElements(By.xpath("//div[@class='giftcard']/div/input"));
    	for (WebElement details : links) {
    		details.sendKeys(value[i++]);
    		
    	}
    	if(true) {
    WebElement price = Demo.findElement(By.xpath("//span[@class='price-value-2']"));
 String priceperproduct  = price.getText();
 System.out.println(priceperproduct);
 
    	}
    WebElement Qty =	Demo.findElement(By.xpath("//input[@id=\"addtocart_2_EnteredQuantity\"]"));
    Qty.clear();
    Qty.sendKeys("5"); 
    }
	}

}
