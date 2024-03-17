package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://www.ilovepdf.com/merge_pdf");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:/Abstract.pdf");
      
      
	}

}
