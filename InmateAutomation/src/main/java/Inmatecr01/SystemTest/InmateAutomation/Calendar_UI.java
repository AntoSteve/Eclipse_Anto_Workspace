package Inmatecr01.SystemTest.InmateAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class Calendar_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String month = "4";
		
		String date = "4";              //react-calendar__year-view__months  //react-calendar__tile react-calendar__year-view__months__month
		
		String year = "2025";
		
		String[] expected = {month, date, year};
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		
		driver.findElement(By.xpath("//button[text()='" +year+ "']")).click();
		Thread.sleep(2000l);
		driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(month)-2).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//abbr[text()='"+date+ "']")).click();
		Thread.sleep(2000l);
		
       List<WebElement> valueee = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
       
       for(int i=0; i<valueee.size();i++) {
    	   
     	    String actualresult = valueee.get(i).getAttribute("value");
    	    System.out.println("The actual result: "    +  actualresult);
    	    System.out.println("The expected result: "  +   expected[i]);
    	    
    	    Assert.assertEquals(actualresult, expected[i]);
    	    
       }
		driver.quit();

	}

}
