package Assignments2Java;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectable {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.navigate().to("http://leafground.com/pages/selectable.html");
	
	WebElement I1 = driver.findElementByXPath("//li[text()='Item 1']");
	WebElement I3 = driver.findElementByXPath("//li[text()='Item 3']");
	WebElement I5 = driver.findElementByXPath("//li[text()='Item 5']");
	
	
	
	driver.manage().window().maximize();
	
	Actions builder = new Actions(driver);
	builder.keyDown(Keys.CONTROL).perform();
	I1.click();
	I3.click();
	I5.click();
	builder.keyUp(Keys.CONTROL).perform();
	Thread.sleep(1000);
	
	driver.close();
	
}
}
