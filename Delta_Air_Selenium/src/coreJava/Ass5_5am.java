package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass5_5am {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final String siteUrl = "https://www.justrechargeit.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(siteUrl);
		Thread.sleep(5000);
		driver.findElement(By.id("jriTop_signin9")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("txtUserName")).sendKeys("Abcdef@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("Abcdeabcde");
		driver.findElement(By.id("txtCaptcha")).sendKeys("100");
		Thread.sleep(5000);
		driver.findElement(By.id("imgbtnSignin")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
