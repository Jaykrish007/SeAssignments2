package Assignments2Java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaURL {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		// URL Launched:
		driver.navigate().to("https://www.nykaa.com");

		driver.manage().window().maximize();
		//perfumes and enter
		driver.findElementByName("search-suggestions-nykaa").sendKeys("Perfumes", Keys.ENTER);
		

		List<String> perfume = new ArrayList<String>();
		List<WebElement> Perfumesnames = driver.findElementsByXPath("//div[@class='m-content__product-list__title']");
		
		
		
		//get all the perfumes names and displayed
		
		
		for (int i = 0; i < Perfumesnames.size(); i++) {
			String p = Perfumesnames.get(i).getText();
			perfume.add(p);
		}

		System.out.println("Names of the perfume is:" + perfume);
		
		Thread.sleep(1000);
		WebElement preview = driver.findElementByXPath("//button[@class='primary-btn common-btn ']");
		Actions builder = new Actions(driver);
	
		WebElement take = driver.findElementByXPath("//div[@class='m-content__product-list__btn-wrap desktop-card-wrapper']");
		builder.moveToElement(take).click().perform();
	
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement addto = driver.findElementByXPath("(//div[@class='col-xs-6 no-style'])[2]");
		builder.moveToElement(addto).click().perform();
		
		//perfume price

		List<String> Price = new ArrayList<String>();
		
		List<WebElement> PerfumePrice = driver.findElementsByXPath("//span[@class='post-card__content-price-offer']");

		for (int i = 0; i < PerfumePrice.size(); i++) {
			String j = PerfumePrice.get(i).getText().replaceAll("[^0-9A-Za-z]", " ");
			Price.add(j);
		}

		System.out.println("Price of the Perfumes" + Price);
		
		
		

		List<String> Sunglass = new ArrayList<String>();
		


		
	

	
		Thread.sleep(2000);
		
		


	///for sunglasses
		Thread.sleep(1500);
		driver.findElementByXPath("//input[@class='header__search-input form-control']").sendKeys("Sunglasses",Keys.ENTER);

		List<WebElement> Sunname = driver.findElementsByXPath("//div[@class='m-content__product-list__title']");

		for (int i = 0; i < Sunname.size(); i++) {
			String s = Sunname.get(i).getText();
			Sunglass.add(s);
		}

		System.out.println("THE Sunglasses are" + Sunglass);
		
		

		driver.findElementByXPath("//div[@class='m-content__product-list__btn-wrap desktop-card-wrapper']").click();

		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='action-text']").click();
	
		System.out.println("Products Verified Successfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Proceed = driver.findElementByXPath("//span[text()='Proceed']");
		builder.moveToElement(Proceed).click();
	
		String T = driver.findElementByXPath("//div[@class='value medium-strong']").getText();
		System.out.println(T);
}	
	}
