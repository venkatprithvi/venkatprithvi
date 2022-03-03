package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Opening  Page
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		// Alert popup - accept
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(500);
		
		// Alert popup - click on after 5s get text and click ok
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000); 
		// must increase sleep time
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		/*
		 * click on third 'Click me' button Get the text from confirmAlert and click on
		 * OK/Cancel button If you clicked on any button on confirmAlert system will
		 * display text like below, 'You selected Ok' 'You selected Cancel' get the
		 * above text too.
		 */
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(6000); 
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		String status = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		System.out.println(status);
		
		/*
		 * 4. click on fourth 'Click me' button send "test123" data to alert editbox do
		 * click on OK button on Confirmation alert system will display text like
		 * below,Get the text like below On button click, prompt box will appear You
		 * entered test
		 */
		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Prithvi");
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		String s2 = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
		System.out.println(s2);

		//------------ close -----------
		driver.close();
	}

}
