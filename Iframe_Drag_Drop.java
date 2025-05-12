package Udemy.Java.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe_Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
           
			//driver.switchTo().frame(0);
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
			
			WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
			
			Actions act = new Actions(driver);
			
			act.dragAndDrop(drag, drop).build().perform();
			
			driver.switchTo().defaultContent();

	}

}
