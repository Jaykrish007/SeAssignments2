package Assignments2Java;

import java.awt.Window;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	
	driver.findElementByXPath("//button[text()='OK']").click();
	
	driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
	
 //window  handling usage://
	
	Set<String> Allwindow = driver.getWindowHandles();
	
	List<String>ListOFWindow = new ArrayList<String>(Allwindow);
	
	
	//move to second window://

	String SecondWindow = ListOFWindow.get(1);
	
	driver.switchTo().window(SecondWindow);
	
	driver.findElementByXPath("//button[@class='btn btn-md blue-gradient btn-rounded waves-effect waves-light m-0 font-14 mt-1']").click();
	
	String CustomerSupportEmail = driver.findElementByXPath("//a[text()=' flights@irctc.co.in']").getText();
	
	
	System.out.println("CustomerSuportEmail : " +CustomerSupportEmail);
	
	//move to the first window://
	
	String FirstWindow = ListOFWindow.get(0);

	driver.switchTo().window(FirstWindow);
	
	//close the  first window
	driver.close();
	
	
	// close all the windows
	driver.quit();
	
	System.out.println("Window Handling successfully");
	
}
}
