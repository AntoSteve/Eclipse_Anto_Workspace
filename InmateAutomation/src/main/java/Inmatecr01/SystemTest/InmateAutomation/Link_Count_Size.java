package Inmatecr01.SystemTest.InmateAutomation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Link_Count_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	    System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
	   System.out.println(footer.findElements(By.tagName("a")).size());
	   
	   WebElement subfooter = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
	   
	      System.out.println(subfooter.findElements(By.tagName("a")).size());
		
		for(int i=1; i<subfooter.findElements(By.tagName("a")).size();i++) {
			
			String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			subfooter.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
			
			
		}
		
		 Set<String> window = driver.getWindowHandles();
			
			Iterator<String> I1 = window.iterator();
			
			while (I1.hasNext()) 
			
			{
				
				driver.switchTo().window(I1.next());
				System.out.println(driver.getTitle());
			}
			
	
	}

}
