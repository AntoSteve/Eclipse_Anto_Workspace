package Udemy.Java.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertions_TestNG {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "G:\\Softwares\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		////input[id='ctl00_mainContent_chk_friendsandfamily']
	
		 Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		 System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	     driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	     Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	     System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	     
	    
	     System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	     //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	     driver.findElement(By.id("divpaxinfo")).click();
	     Thread.sleep(2000L);
	     
	     System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
         
	        /*int i =1;
	          while(i<=5) {
	        	driver.findElement(By.id("hrefIncAdt")).click();
	        	i++;
	        }*/
	     
	        
	        for(int i=1; i<5; i++) {
	        	
	        	driver.findElement(By.id("hrefIncAdt")).click();
	        	
	        }
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
	}

}
