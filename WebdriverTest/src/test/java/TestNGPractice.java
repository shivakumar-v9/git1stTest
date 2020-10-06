import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	WebDriver driver;
	
	@BeforeTest
	public void initiation() {
		  System.setProperty("webdriver.chrome.driver", "/Eclipse workspcae/chromedriver_win32/chromedriver.exe");
			
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
	}
	

	
	
	  @Test
	  public void TestNGTester() {


			System.out.println(driver.getTitle());
		  Select countryBox = new Select(driver.findElement(By.name("country")));
			countryBox.selectByIndex(2);

	  }
	  
	  @AfterTest
	  public void end(){
		  driver.close();
		  driver.quit();
		  
	  }


}
