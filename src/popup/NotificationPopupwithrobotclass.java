package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopupwithrobotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.easemytrip.com/");
		Thread.sleep(3000);
		Robot rbt   = new Robot();
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		rbt.keyRelease(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
	}
}