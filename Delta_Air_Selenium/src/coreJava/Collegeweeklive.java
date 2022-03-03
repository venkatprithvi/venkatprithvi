package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Collegeweeklive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Opening Collegeweeklive url
		driver.get("https://collegeweeklive.com/go-signup");
		// sleeping thread
		Thread.sleep(6000);
		System.out.println("6s");
		//selection
		WebElement staticDropDownIAM = driver.findElement(By.xpath("//select[@name=\"attendeeType\"]"));
		Select selIAM = new Select(staticDropDownIAM);
		selIAM.selectByValue("Graduate");
		System.out.println("selected graduate value");
		Thread.sleep(6000);
		//closing
		driver.close();
		driver.quit();
		
	}

}
