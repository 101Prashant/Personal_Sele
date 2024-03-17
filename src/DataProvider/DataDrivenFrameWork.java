package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrameWork {
	public class StoreDataByUsingDataProvider {
		   @Test(dataProvider = "login")
		   public void receiver(String email , String password) {
			   WebDriver driver = new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			   driver.navigate().to("https://demowebshop.tricentis.com/login");
			   driver.findElement(By.id("Email")).sendKeys(email);
			   driver.findElement(By.id("Password")).sendKeys(password);
			   driver.findElement(By.id("RememberMe")).click();
			   driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();   
			   driver.close();
		}
		   @DataProvider (name="login")
		   public Object[][] sender() throws EncryptedDocumentException, IOException{
			   //Storing the file path
				   File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Book1.xlsx");
				   // Creating a connect between Eclipse and the file path   
				   //Now Here we are using FileInputStream = to fetch the data from file
				   //Now if we want to enter data in the file use  FileOutputStream
		          FileInputStream fis = new FileInputStream(file);
		          //Now to fecth the file we use method Workbookfactory which is present in ApachePOI 
		          //Now Creating Object of Workbook class to use methods like .create , .getsheet , to perform action 
		          Workbook wb = WorkbookFactory.create(fis);
		          Sheet sheet = wb.getSheet("Sheet1");
		          int row = sheet.getPhysicalNumberOfRows();
		          int colon = sheet.getRow(0).getPhysicalNumberOfCells();
		          Object[][]obj = new Object [row][colon];
		          for (int i = 0 ; i<row ; i++) {
		        	  for (int j =0 ; j<colon;j++) {
		        		  obj[i][j]=sheet.getRow(i).getCell(j).toString();
		        	  }
		          }
		          return obj;  
		   }	       
		   
}
}