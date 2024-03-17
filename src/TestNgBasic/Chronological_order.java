package TestNgBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chronological_order {
       @BeforeSuite()
       public void BeforeSuite(){
    	   System.out.println("Before Suit");
       }
     @BeforeTest()
       public void BeforeTest(){
    	   System.out.println("Before Test");
       }
     @BeforeClass()
    public void BeforeClass() {
    	System.out.println("BeforeClass"); 
     }
    @BeforeMethod()
    public void Beforemethod() {
    	System.out.println("Before Method");
    }
    @Test()
    public void test() {
    	System.out.println("Test");
    }
    @AfterMethod()
    public void Aftermethod() {
    	System.out.println("AfterMethod");
    }
    @AfterClass()
    public void afterclass() {
    	System.out.println("AfterClass");
    }
    @AfterTest()
    public void AfterTest() {
    	System.out.println("AfterTest");
    }
    @AfterSuite()
    public void Aftersuite() {
    	System.out.println("AfterSUite");
    }
     
       
      
}
