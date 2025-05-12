package Udemy.Java.Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		driver.get("https://rmt21.sgssys.info/");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("prem@yopmail.com");
		driver.findElement(By.xpath("//body/app-main[1]/app-public-layout[1]/ng-component[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/fieldset[2]/div[1]/div[1]/input[1]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		

	}

}
