package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void facebookLogintest() {
		
		 System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver();
        //creating obj for webdriver
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("12345");
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		}
@Test
	public void forgotPasswordTest() {
		
	 System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook .com/login/");
		driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[1]")).click();
		 }

public void getData() {
	
}
}
