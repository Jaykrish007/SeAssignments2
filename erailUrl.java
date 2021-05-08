package Assignments2Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erailUrl {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement source = driver.findElementById("txtStationFrom");
		source.clear();
		source.sendKeys("ms", Keys.TAB);

		WebElement destination = driver.findElementById("txtStationTo");
		destination.clear();
		destination.sendKeys("mdu", Keys.TAB);

		driver.findElementById("chkSelectDateOnly").click();

		Thread.sleep(1000);
		List<WebElement> findrows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int k = findrows.size();
		System.out.println("The list of the Train count : " + k);

		List<String> list1 = new ArrayList<String>();

		for (int i = 1; i < k; i++) {
			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]//td[2]").getText();
			System.out.println("THe train names are " + text);
			list1.add(text);
		}

		Set<String> set1 = new TreeSet<String>(list1);

		if (list1 == set1) {
			System.out.println("Duplicate values");
		} else {
			System.out.println("Not a duplicate values");
		}

	}
}
