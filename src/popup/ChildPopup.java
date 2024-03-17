package popup;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.navigate().to("https://demowebshop.tricentis.com/");
 String parent = driver.getWindowHandle();
 Thread.sleep(4000);
 driver.findElement(By.xpath("//a[text()='Twitter']")).click();
  Thread.sleep(3000);
  Set<String> Childs = driver.getWindowHandles();
  Childs.remove(parent);
  System.out.println(Childs);
  for (String str : Childs) {
	 driver.switchTo().window(str);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='Create account']")).click();
}
	}

}
