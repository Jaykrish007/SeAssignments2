package Assignments2Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// mouseover the men fashion//
		WebElement Textname = driver.findElementByXPath("(//span[@class='catText'])[6]");

		Actions builder = new Actions(driver);

		builder.moveToElement(Textname).perform();

		driver.findElementByXPath("//a[text()='Shirts']").click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// mouseover the firstshirt and click//
		WebElement shirts = driver.findElementByXPath("//a[@class='dp-widget-link hashAdded']");

		builder.moveToElement(shirts).click().perform();

		driver.close();

	}
}
