import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAutomation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.gecko.driver","E:\\Softwares\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  
		 WebDriver driver = new FirefoxDriver();
       //creating obj for webdriver
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
