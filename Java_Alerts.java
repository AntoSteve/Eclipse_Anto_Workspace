package Udemy.Java.Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Java_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Anto Steve A";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println(driver.switchTo().alert().getText()); //switchTo() is used for handling alert 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().alert().accept(); //for accept the alert 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); // for cancel the alert 
		
	     

	}

}
