package Udemy.Java.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Checkbox_GettingSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver", "G:\\Softwares\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		////input[id='ctl00_mainContent_chk_friendsandfamily']
	
		 System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	     driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	     System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	    
	     System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	     Thread.sleep(5000);
	     
	  //  List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    
	    Thread.sleep(5000);
	 /*   for(WebElement box:checkboxes) {
	    	
	    	if(!box.isSelected()) {
	    		box.click();
	    	}
	    } */
	     
	     
		
		
	}

}
