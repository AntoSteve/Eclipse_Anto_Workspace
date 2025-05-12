package Udemy.Java.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Calendar_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "G:\\Softwares\\drivers\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);//simple dropdown value click
	
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click(); // parent drop dwon dynamic click 
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
				
			
		//.ui-state-default.ui-state-highlight.ui-state-active  css selector or calendar
		// //a[@class='ui-state-default ui-state-highlight ui-state-active'] x path for calendar

	}

}
