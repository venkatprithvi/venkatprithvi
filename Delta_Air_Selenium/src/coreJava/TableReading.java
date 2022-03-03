package coreJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableReading {
	public static String siteurl = "https://www.timeanddate.com/weather/india";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(siteurl);
		
		//driver.findElement(By.xpath("//body/main[1]/article[1]/section[2]/div[1]/table[1]"))
	//String data = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/article[1]/section[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).getText();
	
	
	for(int i =1;i<10;i++) 
	{
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/main[1]/article[1]/section[2]/div[1]/table[1]/tbody[1]/tr[i]/td[1]/a[1]")).getText());
	}
	driver.close();
	}

}
