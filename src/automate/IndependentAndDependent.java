package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given_url = "https://demowebshop.tricentis.com/digital-downloads";
	WebDriver Dem = new ChromeDriver();
	Dem.manage().window().maximize();
	Dem.get("https://demowebshop.tricentis.com/digital-downloads");
	if (given_url.equalsIgnoreCase(Dem.getCurrentUrl())) {
		System.out.println("I'm on Correct Page");
		
		// Here We are using Get
		WebElement price = Dem.findElement(By.xpath(""));
		String Gettext = price.getText();
		System.out.println(Gettext);
	}
	}

}
