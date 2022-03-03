package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBaccountCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Opening FB Page
		driver.get("https://www.facebook.com/");
		// sleeping thread
		Thread.sleep(1000);
		// clicking on create new account
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		System.out.println("Create New Account");
		// date selection
		Thread.sleep(1000);
		WebElement staticDropDownD = driver.findElement(By.xpath("//select[@id='day']"));
		Select selD = new Select(staticDropDownD);
		selD.selectByValue("18");
		System.out.println("date click");
		// month selection
		WebElement staticDropDownM = (WebElement) driver.findElement(By.xpath("//select[@id='month']"));
		Select selM = new Select(staticDropDownM);
		System.out.println("month click 1");
		selM.selectByVisibleText("Mar");
		System.out.println("month click");
		// year selection
		WebElement staticDropDownY = (WebElement) driver.findElement(By.xpath("//select[@id='year']"));
		Select selY = new Select(staticDropDownY);
		selY.selectByVisibleText("1984");
		System.out.println("year click");

		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

	
	}


