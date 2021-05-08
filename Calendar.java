package Assignments2Java;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Calendar.html");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	
	driver.findElementByXPath("//input[@id='datepicker']").click();
	
	//add to the List and click the 10th date
	
	
	List<WebElement> all = driver.findElementsByXPath("//a[@class='ui-state-default']");
	WebElement Day = all.get(8);
	Day.click();
	
	System.out.println("The Date is selected : " +Day.getText());
	
	
	
	
	
	
}
}
