package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*10.2.
https://www.google.com/
Get the "I'm Feeling Lucky" button text*/

public class Google_lucky {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Opening FB Page
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		WebElement t1 = driver
				.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[2]"));
		System.out.println(t1.getAttribute("aria-label"));
		driver.close();
	}

}
