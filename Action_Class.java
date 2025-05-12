package Udemy.Java.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://inmatecr01.sgssys.info/");
		
		Actions key = new Actions(driver);
		
	key.moveToElement(driver.findElement(By.xpath("//input[@id='txtLoginUserName']"))).click().keyDown(Keys.SHIFT).sendKeys("antosteve").keyUp(Keys.SHIFT).build().perform();
    
	driver.findElement(By.xpath("//input[@id='txtLoginpassword']")).sendKeys("Steve@123");
    
    driver.findElement(By.xpath("//input[@id='btnlogin']")).click();

	}

}
