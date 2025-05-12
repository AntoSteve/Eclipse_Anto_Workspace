package Udemy.Java.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UI_DisableandEnable_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","G:\\Softwares\\drivers\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		 System.out.println(driver.findElement(By.id("spclearDate")).getAttribute("style"));//for check the Return Date is disable 
		 
		 driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click(); // To click the Round Trip radio button 
		 
		 System.out.println(driver.findElement(By.id("spclearDate")).getAttribute("style"));//for check the Return Date is enable
			 
		 if(driver.findElement(By.id("spclearDate")).getAttribute("style").contains("block")) {
			 
			Assert.assertTrue(true);
			System.out.println("Return Date is enabled & Value get");
			 
			 
		 }
		 else {
			 Assert.assertFalse(false);
			 System.out.println("Return Date is enabled & Value not get");
		 }
	}

}
