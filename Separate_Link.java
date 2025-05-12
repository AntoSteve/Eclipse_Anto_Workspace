package Udemy.Java.Basics;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Separate_Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
       System.out.println(driver.findElements(By.tagName("a")).size());
       
      WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
      
      System.out.println(footer.findElements(By.tagName("a")).size());
      
      WebElement subfooter = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]"));
      
       System.out.println(subfooter.findElements(By.tagName("a")).size());
       
      for(int i=1; i<subfooter.findElements(By.tagName("a")).size(); i++) {
    	  
    	  String strr = Keys.chord(Keys.CONTROL,Keys.ENTER);
    	  
    	  subfooter.findElements(By.tagName("a")).get(i).sendKeys(strr);
    	  
      }
    
	Set<String>	sett = driver.getWindowHandles();
	Iterator<String> I1 = sett.iterator();
		
	while(I1.hasNext()) {
		
               driver.switchTo().window(I1.next());
               System.out.println(driver.getTitle());
               
	}
		
		
	}

}
