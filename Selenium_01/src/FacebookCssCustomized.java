import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCssCustomized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver();
		 
			driver.get("https://www.facebook.com/");
			driver.findElement(By.cssSelector("#email")).sendKeys("anto008");
			driver.findElement(By.cssSelector("	input[type='password']")).sendKeys("anto008");
			
			driver.findElement(By.cssSelector("._42ft. _4jy0. _6lth. _4jy6. _4jy1. selected. _51sy")).click();
			
			
			
		
			
			
		

	}

}
