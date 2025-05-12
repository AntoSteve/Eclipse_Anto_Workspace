package Udemy.Java.Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit Wait (Declared globally)
		 driver.get("https://inmatecr01.sgssys.info/");
		 System.out.println(driver.getTitle());
		
		
		for(int i=0; i<=10; i++) {
		driver.findElement(By.cssSelector("#txtLoginUserName")).sendKeys("antosteve"); //Username
		driver.findElement(By.cssSelector("#txtLoginpassword")).sendKeys("Steve@123"); //Password
		driver.findElement(By.cssSelector("#btnlogin")).click(); //Login Button
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-circle pointer']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
		
		}
		
		System.out.println("Logged In & Out about 10 times");

	}

}
