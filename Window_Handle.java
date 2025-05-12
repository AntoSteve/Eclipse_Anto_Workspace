package Udemy.Java.Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//a[@href='https://rahulshettyacademy.com/documents-request'] - href link 
		
		driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> IT1 = windows.iterator();
		
	         String parent = IT1.next();
	         String child  = IT1.next();
		
	         
	         driver.switchTo().window(child);
	         
	   System.out.println(driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/p[2]")).getText());
	      
	 //  driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/p[2]")).getText();
	 String element = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/p[2]")).getText().split("at")[1].trim().split(" ")[0];

	 driver.switchTo().window(parent);
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(element);
	 
	}

}
