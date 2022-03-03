package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v95.network.model.CookieSourceScheme;

public class Justrecharge_webdriver_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Opening FB Page
		driver.get("https://www.justrechargeit.com/");
		// title
		System.out.println(driver.getTitle());
		//url
		System.out.println(driver.getCurrentUrl());
		// clicking create new account
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		//refresh
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.close();
	}

}
