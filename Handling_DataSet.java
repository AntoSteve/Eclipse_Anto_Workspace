package Udemy.Java.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DataSet {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		////button[text()='ADD TO CART'] to identify web element by text using xpath 
		//h4.product-name to identify web element using  css selector
		
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<product.size(); i++) {
			
			String name = product.get(i).getText();
		
			if(name.contains("Cucumber"))	
		{
				
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
			
			}
			
		}
		
		
		

	}

}
