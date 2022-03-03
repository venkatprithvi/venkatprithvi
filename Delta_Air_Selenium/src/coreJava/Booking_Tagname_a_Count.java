package coreJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_Tagname_a_Count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		Thread.sleep(3000);
		List<WebElement> aTagList= driver.findElements(By.tagName("a"));
		
		System.out.println(aTagList.size());
		
		for(int i=0;i<aTagList.size();i++) 
		{
			System.out.println(aTagList.get(i).getText());
		}
		
	}

}
