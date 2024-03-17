package automate;

import org.openqa.selenium.By;

public class xpathreg extends Base {
public static void main(String[]args) {
	precondition();
	test.get("https://demowebshop.tricentis.com/");
	test.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("testop15191@yopmail.com");
	test.findElement(By.xpath("  "));
}

}
