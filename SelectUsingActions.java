package Assignments2Java;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectUsingActions {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		

		Actions builder = new Actions(driver);
		
		Thread.sleep(2000);
		WebElement se = driver.findElementByXPath("(//option[text()='Selenium'])[6]");
		WebElement App = driver.findElementByXPath("(//option[text()='Appium'])[6]");
		WebElement UFt = driver.findElementByXPath("(//option[text()='UFT/QTP'])[6]");
	
	//using drag and drop
		builder.dragAndDrop(se, UFt).perform();
		/*
		 * se.click();
		App.click();
		UFt.click();
		
		using keys.up and keys down
		builder.keyUp(Keys.CONTROL).perform();
	*/
	
	
	
	
}
}
