package Inmatecr01.SystemTest.InmateAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll_Check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		 
		List<WebElement>  values =  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int name =0;
		for(int i=0; i<values.size(); i++) {
			
     name =  name +  Integer.parseInt(values.get(i).getText());
			}
		
		System.out.println(name);
		
	driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
 int check = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());

System.out.println(check);

Assert.assertEquals(name, check); 

}}
