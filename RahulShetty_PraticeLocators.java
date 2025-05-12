package Udemy.Java.Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RahulShetty_PraticeLocators {
      
	public static void main (String[] args) throws InterruptedException {
		
		//implicit wait -5 seconds 
		System.setProperty("webdriver.gecko.driver", "G:\\Softwares\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Antosteve");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademyy");
		driver.findElement(By.className("submit")).click();
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jhon");
	    //Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@gmail.com");
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("jhon@gmail.com"); 
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    Thread.sleep(1000);
	    //driver.findElement(By.xpath("//form/div/button[2]")).click();
	    System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector(".error")).getText());
	    
	    driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	    
	}
	
}
