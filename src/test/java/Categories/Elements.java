package Categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
     public Elements(WebDriver driver) {
    	 PageFactory.initElements(driver,this);
     }
     @FindBy (xpath = "//input[@name='email']")
     WebElement Email;
     public void EMail(String value) {
     	Email.sendKeys(value);
 }
     @FindBy(xpath = "//input[@name='password']")
     WebElement pass;
     public void pass(String value) {
     	pass.sendKeys(value);
     }
     @FindBy (xpath = "//button[@type='submit']")
     WebElement submit;
     public void submit() {
     	submit.click();
     }
}
