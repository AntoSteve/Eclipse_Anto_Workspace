import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Chromedriver.exe 
		//System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		// FireFoxdriver
		//System.setProperty("webdriver.gecko.driver", "G:\\Softwares\\drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge
		System.setProperty("webdriver.edge.driver", "G:\\Softwares\\drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulsheetyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.close(); //latest window close 
        //driver.quit();  //associated window close 
	
	}

}
