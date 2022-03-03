package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// invoking browser
		// chromedriver(in chromedriver class there are predefind methods)
		// to get chromedriver we need to create object

		// Chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");

		// created object 'driver' for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.delta.com/");
		Thread.sleep(10000);

		String urlname = driver.getCurrentUrl();
		System.out.println(urlname + "  my code");
		
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"search_input\"]")).sendKeys("VTZ");
		driver.findElement(By.xpath("//input[@id=\"search_input\"]")).click();
		
		

	
	}

}
