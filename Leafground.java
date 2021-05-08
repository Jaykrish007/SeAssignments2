package Assignments2Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	
	driver.navigate().to("http://leafground.com/pages/Window.html");
	
	driver.manage().window().maximize();
	
	driver.findElementByXPath("//button[text()='Open Home Page']").click();
	
	
	Set<String> windowHandles = driver.getWindowHandles();
	
	List<String>ListWindow = new ArrayList<String>(windowHandles);
	
	
	String SecondWindow = ListWindow.get(1);
	
	driver.switchTo().window(SecondWindow);
	
	driver.manage().window().maximize();
	
	
	
	
	driver.findElementByXPath("//h5[text()='Button']").click();
	
	String TitleOFWindow2 = driver.getTitle();
	System.out.println("Title of Window 2 is   " + TitleOFWindow2);
	
	String FirstWindow = ListWindow.get(0);
	
	driver.switchTo().window(FirstWindow);
	
	String TitleOFWindow1 = driver.getTitle();
	System.out.println("Title of Window 1 is   " + TitleOFWindow1);
	
	driver.close();
	
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
}
}
