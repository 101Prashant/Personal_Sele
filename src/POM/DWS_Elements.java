package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Elements { 
	 public DWS_Elements(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }
    @FindBy(xpath = "//input[@type='text']")
    WebElement Searh_field;
    
    @FindBy(xpath = "//input[@value='Search']")
    WebElement Search_button;
    
    public void search_filed(String Value) {
    	Searh_field.sendKeys(Value);
    }
     public void Search_button() {
    	 Search_button.click();
     }
     
     
}
