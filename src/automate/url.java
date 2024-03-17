package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {
    public void link() throws InterruptedException {
    	ChromeDriver Demo1=  new ChromeDriver();
    	Demo1.manage().window().maximize();
    	Demo1.get("http://itsm.qa.icyberpro.in/rits/userLogin");
    //Demo1.wait(5000);
     Demo1.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("its.dhiren.h@icyberpro.in");
    // Demo1.wait(5000);
    Demo1.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Abcd@1234");
 //Demo1.wait(5000);
   Demo1.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
   
	public static void main (String[]args) throws InterruptedException {
		 
    }
}
