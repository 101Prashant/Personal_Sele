package JavaScriptExcecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
	WebElement window64 = driver.findElement(By.xpath("//a[text()='jdk-11.0.21_windows-x64_bin.zip']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false);", window64);
	window64.click();
	WebElement disabled_button = driver.findElement(By.xpath("//a[text()='Download jdk-11.0.21_windows-x64_bin.zip']"));
	js.executeScript("arguments[0].click();", disabled_button);
	
	
}
}

