package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	public Header(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
   @FindBy (xpath = "//a[@href='/books'])[1]")
   WebElement Book;
   public void Book() {
	   Book.click();
   }
   
   @FindBy(xpath = "//a[@href='/computers'])[1]" )
   WebElement Computer;
   public void Computer() {
	   Computer.click();
   }
   @FindBy(xpath = "//a[@href='/electronics'])[1]")
   WebElement Electronics;
   public void Electronics() {
	   Electronics.click();
   }
   
}
