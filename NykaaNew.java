package Assignments2Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaNew {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.nykaa.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Actions builder = new Actions(driver);
	
	WebElement Brands = driver.findElementByXPath("//a[text()='brands']");
	WebElement Popular = driver.findElementByXPath("//a[text()='Popular']");
	
	builder.moveToElement(Brands).perform();
	
	builder.moveToElement(Popular).perform();
	
	
	driver.findElementByXPath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']").click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	
	List<String> Window = new ArrayList<String>(windowHandles);
	String s0 = Window.get(0);
	
	String s1 = Window.get(1);
	
	WebDriver window2 = driver.switchTo().window(s1);
	
	String Title= window2.getTitle();
	System.out.println("Title of the Second page: " + Title);
	Thread.sleep(1000);
	
	driver.findElementByXPath("//span[text()='Sort By : ']").click();
	
	driver.findElementByXPath("//span[text()='customer top rated']").click();
	Thread.sleep(2000);
	
	driver.findElementByXPath("//div[@class='pull-right filter-options-toggle']").click();
	
	driver.findElementByXPath("//span[text()='Hair']").click();
	
	driver.findElementByXPath("//span[text()='Hair Care']").click();
	
	driver.findElementByXPath("//span[text()='Shampoo']").click();
	
	
	Thread.sleep(1000);
	
	driver.findElementByXPath("(//div[@class='m-content__product-list__title']/h2)[10]").click();
	
	Thread.sleep(1000);
	
	Set<String>shamp = driver.getWindowHandles();
	
	List<String> Allshamp = new ArrayList<String>(shamp);
	
	String Last = Allshamp.get(2);
	
	driver.switchTo().window(Last);
	
	driver.findElementByXPath("//span[text()='175ml']").click();
	
	String mrp = driver.findElementByXPath("//span[@class='post-card__content-price-offer']").getText();

	System.out.println("The MRP PRICE is : " +mrp);
	
	driver.findElementByXPath("//button[@class='combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  ']").click();
	Thread.sleep(2000);
	
	driver.findElementByXPath("//div[@class='AddBagIcon']").click();

	
	Set<String> st = driver.getWindowHandles();
	
	List<String> L = new ArrayList<String>(st);
	
	System.out.println("Size of all the Windows" + L.size());
	
	
	
		Thread.sleep(3000);


	
	
	String sham = driver.findElementByXPath("//div[@class='value medium-strong']").getText();
	System.out.println("The Grand Total is :" +sham);
	
	Thread.sleep(2000);
	

	driver.findElementByXPath("//div[@class='sticky-bottom proceed-cart-btn']//div[@class='second-col']//span").click();
	
	driver.findElementByXPath("//button[text()='CONTINUE AS GUEST']").click();
	
	System.out.println("Grand Total is Same");  
	
	
	driver.quit();
	
	
	
	
}
}
