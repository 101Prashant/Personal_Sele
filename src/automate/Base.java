package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	 public static WebDriver test;
	// public static String link ="https://demowebshop.tricentis.com/";
 public static void precondition() {
	 test = new ChromeDriver();
	 test.manage().window().maximize();
 }
 public static void postcondition() {
	 test.close();
 }
 public static void precondition1() {
	 test = new EdgeDriver();
 }
 public static void postcondition1() {
	 test.quit();
 }
 //public static void Excellent() {
	// test.findElement(By.id("pollanswers-1")).click();
 }

