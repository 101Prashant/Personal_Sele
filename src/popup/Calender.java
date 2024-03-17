package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.agoda.com/");
Thread.sleep(7000);
driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//Span[@data-selenium-date='2024-03-19']")).click();
Thread.sleep(2000);
for(; ;) {
	try {
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-07-27']")).click();
		break;
	} catch (Exception e) {
		driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
	}
}

	}

}
