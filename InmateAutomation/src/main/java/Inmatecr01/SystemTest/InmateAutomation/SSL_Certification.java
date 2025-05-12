package Inmatecr01.SystemTest.InmateAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_Certification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     ChromeOptions ssl = new ChromeOptions();
     ssl.setAcceptInsecureCerts(true);
	 			
		 WebDriver driver = new ChromeDriver(ssl);
		driver.get("https://expired.badssl.com/");
	    System.out.println(driver.getTitle());
       
		 

	}

}
