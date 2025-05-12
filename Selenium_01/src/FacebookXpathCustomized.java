import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathCustomized {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver();
		 
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anto");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anto");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@value='1']")).click();
			
			
			
		 
		 

	}

}
