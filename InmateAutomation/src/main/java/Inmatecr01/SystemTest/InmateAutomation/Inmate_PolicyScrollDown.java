package Inmatecr01.SystemTest.InmateAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inmate_PolicyScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://inmatecr01.sgssys.info");
		
		driver.findElement(By.xpath("(//a[text()='Sign Up']) [2]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href='/Common/Termsofservice.aspx']")).click();
		
	
		   Set<String> window = driver.getWindowHandles();
			
			Iterator<String> I1 = window.iterator();
			
			String parent = I1.next();
			String child  = I1.next();
			
			driver.switchTo().window(parent);
			driver.switchTo().window(child);
		
		
		driver.findElement(By.xpath("//button[@class='btnclose']")).click();
		
		driver.switchTo().window(parent);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//a[@href='/Common/PrivacyPolicy.aspx']")).click();
		
		
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		
		driver.switchTo().window(child);
		
	/*	JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");  */
		
	
	

		
	/*		driver.findElement(By.xpath("//button[@class='btnclose']")).click(); */

		
		
		

	}

}
