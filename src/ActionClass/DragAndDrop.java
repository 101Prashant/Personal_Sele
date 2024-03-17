package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
  Actions act = new Actions(driver);
  Thread.sleep(3000);
  //For Rome and Italy
    WebElement rome = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
    WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
    Thread.sleep(2000);
    act.dragAndDrop(rome, italy).build().perform();

    //For Oslo and Norway
    WebElement Oslo = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
    WebElement Norway = driver.findElement(By.xpath("//div[@id='box101']"));
    Thread.sleep(2000);
    act.dragAndDrop(Oslo, Norway).build().perform();
    
    //For 
	}

}
