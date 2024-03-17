package automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Digicart extends Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    precondition();
	test.get("https://demowebshop.tricentis.com/digital-downloads");
	List<WebElement> Cart = test.findElements(By.cssSelector("input[value='Add to cart']"));
for (WebElement add :Cart) {
	add.click();
	Thread.sleep(3000);
}
Thread.sleep(3000);
test.findElement(By.linkText("Shopping cart")).click();
	}

}
