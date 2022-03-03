package coreJava;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;

public class Streams_vegg_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(2000);

		// print text of webelements in a table
		List<WebElement> elementsList = driver.findElements(By.xpath("//table//td[1]"));

		System.out.println("Count of elements : " + elementsList.size());
		for (WebElement columnData : elementsList) {
			System.out.println(columnData.getText());
		}
		
		/* ------------------------------------------------------------
		 * -----------------Sorting Original lisy-------------------------------------------
		 */
		List<WebElement> elementsList1 = driver.findElements(By.xpath("//table//td[1]"));
		List<WebElement> sortedElementsList = elementsList1.stream().sorted().collect(Collectors.toList());
		for (WebElement columnData1 : sortedElementsList) {
			System.out.println(columnData1.getText());
		}
		driver.close();
	}

}
