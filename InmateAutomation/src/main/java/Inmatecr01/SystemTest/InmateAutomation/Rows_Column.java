package Inmatecr01.SystemTest.InmateAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rows_Column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeOptions ssl = new ChromeOptions();
		 ssl.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ssl);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.xpath("//table[@name='courses']"));
		
	   System.out.println(table.findElements(By.tagName("tr")).size());
	   
	   System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	   
	   List<WebElement> secondrow =table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	   
   System.out.println(secondrow.get(0).getText());
   System.out.println(secondrow.get(1).getText());
   System.out.println(secondrow.get(2).getText());

	}

}
