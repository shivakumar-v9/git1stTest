package com.qa.TestCases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
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
		
		//WebTable Testing URl ..
		//driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//MouseOverActions URL
		driver.get("https://www.qafox.com/selenium/selenium-practice/");
		
		
		
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
	
	@Test(enabled = false)
	public void mouseOverActions() {
	
		WebElement coursLink = driver.findElement(By.xpath("//*[@id=\"menu-item-1073\"]/a"));
		Actions clickCourseLink = new Actions(driver);
		Action elementClick = clickCourseLink
		.moveToElement(coursLink).click()
		.build();
		elementClick.perform();
		//clickCourseLink.perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		new Select(driver.findElement(By.id("xyz"))).selectByVisibleText("India");
		
		Select countryDrpDwn = new Select(driver.findElement(By.className("classXYZ")));
		countryDrpDwn.selectByIndex(1);
		
		*/
		
		
	}

	  @AfterTest
	  public void end(){
		  driver.close();
		  driver.quit();
		  
	  }


}
