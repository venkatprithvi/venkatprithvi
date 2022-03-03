package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HydWeather {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/weather/india");
		Thread.sleep(5000);
		String cityName = driver.findElement(By.xpath("//a[contains(text(),'Hyderabad')]")).getText();
		System.out.println(cityName);
		
		String cityDT = driver.findElement(By.id("p139")).getText();
		System.out.println(cityDT);
		
		String cityTemp = driver.findElement(By.xpath("//tbody/tr[14]/td[8]")).getText();
		System.out.println(cityTemp);
		driver.close();
	}

}
