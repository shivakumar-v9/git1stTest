import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.enable.EnableTest;

public class TestNGPractice {
	WebDriver driver;
	
	@BeforeTest
	public void initiation() {
		  System.setProperty("webdriver.chrome.driver", "/Eclipse workspcae/chromedriver_win32/chromedriver.exe");
			
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://demo.guru99.com/test/newtours/register.php");
		//comment for git practice
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
	}
	

	
	
	/*  @Test
	  public void testNGTester() {


			System.out.println(driver.getTitle());
		  Select countryBox = new Select(driver.findElement(By.name("country")));
			countryBox.selectByIndex(2);

	  }*/
	  	
	  @Test(enabled = false)
	  public void webTableTesting() {
		  List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		  System.out.println("-----"+rows.size());
		  List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		  System.out.println("-----Columns---"+columns.size());
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]")).getText());
		  try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	  }
	  
	  @AfterTest
	  public void end(){
		  driver.close();
		  driver.quit();
		  
	  }


}
