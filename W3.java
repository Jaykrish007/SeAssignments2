package Assignments2Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver =  new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt ");
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement Frame = driver.findElementByXPath("//iframe[@id='iframeResult']");
	driver.switchTo().frame(Frame);
	
	Thread.sleep(1000);
	driver.findElementByXPath("//button[text()='Try it']").click();
	
	
	// using alert in switch 
	
	Alert alert = driver.switchTo().alert();
	
	alert.sendKeys("Jayakrishna");
	
	
	alert.accept();
	
	
	System.out.println("Name Verified Successfully in alert and Frame");
	
}
}
