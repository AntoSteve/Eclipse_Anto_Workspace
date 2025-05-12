package Udemy.Java.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UI_DisableorEnable_Attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
   System.setProperty("wedriver.gecko.driver","G:\\Softwares\\drivers\\geckodriver-v0.35.0-win64\\geckodriver.exe");
   WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    
    
    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
    
    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
    
    {
    	
    	System.out.println("its enabled");
    	Assert.assertTrue(true);
    }
    
    else{
    	
    	Assert.assertFalse(false);
    	System.out.println("wrong value");
    }
    

	}

}
