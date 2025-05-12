package Udemy.Java.Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sibling_Xpath_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//header/div/button[1]/following-sibling::button[1]
		
		//System.setProperty("webdriver.edge.driver","G:\\Softwares\\drivers\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//Sibling with xpath traverse
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		System.out.println(driver.findElement(By.xpath("//header/a[2]")).getText());
		//driver.findElement(By.xpath("//header/a[2]")).click();
		//child element to parent element with xpath traverse 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}
}

