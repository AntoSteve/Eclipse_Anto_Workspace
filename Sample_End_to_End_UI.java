package Udemy.Java.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Sample_End_to_End_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.gecko.driver","G:\\Softwares\\drivers\\geckodriver-v0.35.0-win64\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_0\"]")).click(); // To click the One Way
																									// Trip radio button

		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click(); // To click
																											// the From
																											// Dropdown

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']"))
				.click();
		System.out.println(driver
				.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']"))
				.getText());
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='CJB']"))
				.click();
		System.out.println(driver
				.findElement(
						By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='CJB']"))
				.getText());
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click(); // To click
																											// current
																											// date in
																											// the
																											// Calendar

		System.out.println(driver.findElement(By.id("spclearDate")).getAttribute("style"));// for check the Return Date
																							// is disable

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click(); // To Click round trip

		System.out.println(driver.findElement(By.id("spclearDate")).getAttribute("style"));// For check the Return Date
																							// is enable

		if (driver.findElement(By.id("spclearDate")).getAttribute("style").contains("block")) {

			Assert.assertTrue(true);
			System.out.println("Return Date is enabled & Value get");

		} else {
			Assert.assertFalse(false);
			System.out.println("Return Date is enabled & Value not get");
		}

		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_0\"]")).click(); // To Click One Way Radio
																								// button

		System.out.println(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()); // For
																														// to
																														// check
																														// the
																														// check
																														// box
																														// is
																														// selected
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click(); // To click the
																										// check box
		System.out.println(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()); // For
																														// to
																														// check
																														// the
																														// check
																														// box
																														// is
																														// selected

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size()); // To get the total
																								// number of check box
																								// present

		driver.findElement(By.id("divpaxinfo")).click(); // To click the passengers drop down

		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText()); // To get the current
																								// drop down text

		Thread.sleep(1000);
		int i = 1;
		while (i <= 5) {
			driver.findElement(By.id("hrefIncAdt")).click(); // To click the Adult Add button 5 Times
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click(); // To close the Passengers drop down

		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText()); // To get the current
																								// drop down text

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); // To get the
																											// Currency
																											// drop down
																											// values

		Select dropdown = new Select(staticDropdown); // To store the drop down value in an object

		dropdown.selectByIndex(3); // To select by index
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("AED"); // To select by value
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("INR"); // To select by visible text
		System.out.println(dropdown.getFirstSelectedOption().getText());

		System.out.println("Static completed thank you");

		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click(); // To click on the
																								// search button

	}

}