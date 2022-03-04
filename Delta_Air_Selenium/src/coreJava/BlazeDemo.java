package coreJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Assignment-12 (Xpath) ------------ https://blazedemo.com/ Choose your
		 * departure city: Choose your destination city: Click on FindFlights button(3rd
		 * one) Click on 'Choose This Flight' (any button) Fill all the
		 * data(Valid/Invalid) then click on 'Purchase' Flight button Get the message
		 * "Thank you for your purchase today!" Get all the other details
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://blazedemo.com");
		Thread.sleep(3000);
		
		// Dropdown selecting departure city
		WebElement departure_DropDown_City = driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]"));
		Select deptSelect = new Select(departure_DropDown_City);
		deptSelect.selectByValue("Paris");
		System.out.println(deptSelect);
		Thread.sleep(2000);
		
		// Dropdown selecting destination city
		WebElement destination_DropDown_City = driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]"));
		Select destSelect = new Select( destination_DropDown_City);
		destSelect.selectByValue("Berlin");
		System.out.println(destSelect);
		Thread.sleep(2000);
		
		//Submiting form
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		// Next page selecting airlines
		driver.findElement(By.xpath("//tbody//tr[1]//td[1]//input[1]")).click();
		
		//filling name input text field
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Prithvi");
		
		//filling address input text field
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Naidu Thota, Visakhapatnam");
		Thread.sleep(3000);
		
		// purchasing ticket submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String finalText = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("******"+finalText+"*******");
		Thread.sleep(3000);
		/*------------Web Driver Close --------*/
		driver.close();
		driver.quit();
	}

}
