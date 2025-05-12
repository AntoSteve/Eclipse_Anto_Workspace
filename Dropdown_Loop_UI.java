package Udemy.Java.Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdown_Loop_UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.setProperty("webdriver.edge.driver","G:\\Softwares\\drivers\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        
        System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
          
        int i =1;
          while(i<=5) {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	i++;
        }
        
        /*for(int i=1; i<5; i++) {
        	
        	driver.findElement(By.id("hrefIncAdt")).click();
        	
        }*/
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
	}

}
