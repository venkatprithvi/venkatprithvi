package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.justrechargeit.com/");
Thread.sleep(3000);
//Limiting webdriver scope to footer only
 WebElement footerDriver = driver.findElement(By.className("footerBg"));
 System.out.println(footerDriver.findElements(By.tagName("a")).size());
 //WebElement columnDriver = (WebElement) footerDriver.findElements(By.xpath("//div[@class=\"operatorPanelStyle\"]/div")); 
 for(int i =1 ; i < footerDriver.findElements(By.xpath("//div[@class=\"operatorPanelStyle\"]/div")).size() ; i++) 
    {
	 WebElement columnDriver = footerDriver.findElement(By.xpath("//div[@class=\"operatorPanelStyle\"]/div[i]")); 
	 int counta = columnDriver.findElements(By.tagName("a")).size();
	 for(int j =1; j<=counta;j++) 
	    {
		 System.out.println(columnDriver.findElements(By.tagName("a[j]")));
	    }
    }


 // Clicking on all links
 driver.close();
	}

}
