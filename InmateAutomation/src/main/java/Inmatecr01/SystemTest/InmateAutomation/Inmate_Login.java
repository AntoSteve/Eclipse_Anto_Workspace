package Inmatecr01.SystemTest.InmateAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inmate_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //Implicit Wait
		 driver.get("https://inmatecr01.sgssys.info/");
		System.out.println(driver.getTitle());
		
		
		for(int i=1; i<=10; i++) {
		driver.findElement(By.cssSelector("#txtLoginUserName")).sendKeys("antosteve"); //Username
		driver.findElement(By.cssSelector("#txtLoginpassword")).sendKeys("Steve@123"); //Password
		driver.findElement(By.cssSelector("#btnlogin")).click(); //Login Button
		
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  //Explicit
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-user-circle pointer']")));
		
		element.click();
		//driver.findElement(By.xpath("//i[@class='fa fa-user-circle pointer']")).click();
		
		WebElement java = driver.findElement(By.xpath("//i[@class='fa fa-sign-out']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	       
        // Call the JavascriptExecutor methods
		js.executeScript("arguments[0].click();", java);
	    
		//driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
		
		System.out.println("Logged In"   +  i +  "Time");
		
		//button[text()='ADD TO CART']
		
		
		
		}
		
		
	}

}
