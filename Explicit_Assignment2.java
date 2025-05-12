package Udemy.Java.Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy"); // Enter Username

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning"); // Enter Password

		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click(); // Click User radio button

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000)); // Explicit wait to 7000 milliseconds

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));

		driver.findElement(By.xpath("//button[@id='okayBtn']")).click(); // Click Okay in the pop-up

		WebElement option = driver.findElement(By.xpath("//select[@class='form-control']")); // To access dropdown &
																								// store the value

		Select dropdown = new Select(option);

		dropdown.selectByVisibleText("Teacher"); // select value by Text

		driver.findElement(By.xpath("//input[@id='terms']")).click(); // Terms click

		driver.findElement(By.xpath("//input[@id='signInBtn']")).click(); // signin button click

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List<WebElement> products = driver.findElements(By.xpath("//button[@class='btn btn-info']")); // To store all
																										// value of Add
																										// to cart in
																										// single list

		for (int i = 0; i < products.size(); i++) {

			products.get(i).click();

		}

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click(); // To checkout the all item

	}

}
