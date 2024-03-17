package automate;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {
   public static void main(String []args) {
	   WebDriver Demo = new ChromeDriver();
	   Demo.manage().window().maximize();
	   //Opening the web app
	   Demo.get("file:///C:/Users/HP/Downloads/demo.html");
	   //Here we are storing the Target webelement in a container of type WebElement of refrence name s_ref
	WebElement s_ref  = Demo.findElement(By.id("standard_cars"));
	//Now Creating the select class reference to access the target webElement
	   Select drop = new Select(s_ref);
	   //Here we are using .getoptions(); method to get all the elements present (options) in the Dropdown list
	List<WebElement> car = drop.getOptions();
	//Now printing the elements 
	System.out.println(car);
	//Now clicking all the option in the dropdown list 
	int i = 0;
	for (WebElement sel : car) {
		//THere are two methods to select each options in the dropdown list
		  //1
	//	drop.selectByIndex(i++);
		//2.
		//sel.click();
	}
	   
	   
	   
	   
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
