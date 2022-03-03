package coreJava;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StaticTable_FindTableHeaderEx 
{
   public static void main(String[] args) 
   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHVI\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
      driver.get("https://softwaretestingo.blogspot.com/2020/09/static-table.html");
      driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
      
      List<WebElement> allHeadersOfTable= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
      System.out.println("Headers in table are below:");
      System.out.println("Total headers found: "+allHeadersOfTable.size());
      for(WebElement header:allHeadersOfTable)
      {
         System.out.println(header.getText());
      }
   }
}