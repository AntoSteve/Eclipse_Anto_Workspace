package Udemy.Java.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_Click_Checkbox {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 for(WebElement box:checkboxes) {
		    	
		    	if(!box.isSelected()) {
		    		box.click();
		    	}
		    }
		System.out.println("All checkbox are selected");
		
		
		

	}

}
