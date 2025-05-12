package Udemy.Java.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertions_Sample1_TestNG {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"G:\\Softwares\\drivers\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		int i = 1;
		while (i <= 3) {

			driver.findElement(By.id("hrefIncChd")).click();
			i++;

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "4 Child");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

	}

	
	}


