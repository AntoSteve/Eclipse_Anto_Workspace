package Inmatecr01.SystemTest.InmateAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame2_ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://jqueryui.com/droppable/");
	     
	     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	     
	     Actions act = new Actions(driver);
	     
	     WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	     
	     WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	     
	     act.dragAndDrop(drag, drop).build().perform();
	     
	     driver.switchTo().defaultContent();
	     

	}

}
