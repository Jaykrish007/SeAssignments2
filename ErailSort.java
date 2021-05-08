package Assignments2Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.manage().window().maximize();

		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();

		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms",Keys.ENTER);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu",Keys.ENTER);
	
		Thread.sleep(1500);
		List<WebElement> TrainHeader = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int Count = TrainHeader.size();
	
		System.out.println("Count of the Train is : " + Count);
		List<String> Le = new ArrayList<String>();
		
		for (int i =1;i<Count;i++) {

			String k = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			Le.add(k);
			
		}
	
		
	Collections.sort(Le);
	System.out.println("The Sorted Train names are " +Le);
	
	
	
}

	

}
