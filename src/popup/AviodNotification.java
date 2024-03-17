package popup;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AviodNotification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ch_options = new ChromeOptions();
		ch_options.addArguments("--diable--notifications");
		WebDriver driver = new ChromeDriver(ch_options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.easemytrip.com/");
		Thread.sleep(3000);
		
	}

}
