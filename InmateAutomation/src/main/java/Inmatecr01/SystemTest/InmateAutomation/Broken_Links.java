package Inmatecr01.SystemTest.InmateAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Broken_Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		//a[@href='https://www.soapui.org/']
	   //a[href*='soap']
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	  String Url = 	driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
	  System.out.println( Url);
		
	  List<WebElement> links =  driver.findElements(By.xpath("//li[@class='gf-li']/a"));
	  
	  SoftAssert a  = new SoftAssert();
		 //li[class='gf-li'] a
		// https://rahulshettyacademy.com/brokenlink
		 for (WebElement link :links) {
			 
			  String Url1 = link.getAttribute("href");
				
			  System.out.println( Url1 );
			  
			    HttpURLConnection conc = (HttpURLConnection) new URL(Url1).openConnection();
				conc.setRequestMethod("HEAD");
				conc.connect();
				
				 int responsecode = conc.getResponseCode();
				 
				 System.out.println(responsecode);
				 
				 a.assertTrue(responsecode<400, "The Link with text"  + link.getText()+ "is broken with code"  +responsecode);
				 
		/*	 if(responsecode>400) {
				 
				 System.out.println("The Link with text"  + link.getText()+ "is broken with code"  +responsecode);
				 
				 Assert.assertTrue(false);
			 }  */
				 
		 }
		 
		 a.assertAll();
		 
		
	}

}
