package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

/*Assignment-10(GetTextVsGetAttribute)
--------------
10.1.
1. open the URL in Chrome browser https://www.xe.com/
2. Get the amount editbox default value using Getattribute method 
and print it into Console
3. Get the plain text "How to transfer money in 3 easy steps" 
from application by using GetText method*/

public class Xe_GetText_GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.xe.com/");
		Thread.sleep(4000);
		//get the amount editbox default value
		WebElement inputdata = driver.findElement(By.xpath("//input[@id='amount']"));
		System.out.println(inputdata.getAttribute("value"));
		//pulling data 
		WebElement textdata = driver.findElement(By.xpath("//h2[contains(text(),'How to transfer money in 3 easy steps')]"));
		System.out.println(textdata.getText());
		driver.close();
	}

}
