package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searhfiled {
public static void main (String[]args) {
	WebDriver Demo = new ChromeDriver();
	Demo.get("https://demowebshop.tricentis.com/");
	Demo.findElement(By.id("small-searchterms")).click();
	
	
}
}
