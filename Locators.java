package Udemy.Java.Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Login & Logout check
		String name = "rahul";
		//System.setProperty("webdriver.gecko.driver", "G:\\Softwares\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver","G:\\Softwares\\drivers\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = passwordGet(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " +name+",");
	    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	    driver.close();
	    System.out.println("driver closed successfully");
	}
	
	public static String passwordGet(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray= passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		System.out.println(password);
		return password;
		
		
	}

}
