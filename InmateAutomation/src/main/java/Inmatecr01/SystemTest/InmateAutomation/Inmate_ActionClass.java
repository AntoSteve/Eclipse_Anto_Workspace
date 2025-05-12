package Inmatecr01.SystemTest.InmateAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Inmate_ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://inmatecr01.sgssys.info/");
		
		Actions clc = new Actions(driver);
		clc.moveToElement(driver.findElement(By.xpath("//input[@id='txtLoginUserName']"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("antosteve").keyUp(Keys.LEFT_SHIFT).doubleClick().build().perform();
		WebElement pass = driver.findElement(By.xpath("//input[@id='btnlogin']"));
		
	    clc.moveToElement(pass).contextClick().build().perform();

	}

}
