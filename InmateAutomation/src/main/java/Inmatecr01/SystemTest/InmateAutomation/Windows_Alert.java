package Inmatecr01.SystemTest.InmateAutomation;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;

public class Windows_Alert {

    public static void main(String[] args) {
        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage
        driver.get("https://inmatecr01.sgssys.info/Common/WebRegister.aspx");
        
        // Click on the "Terms of service" link
        driver.findElement(By.linkText("Terms of service")).click();
        
        // Get the window handles
        Set<String> windows = driver.getWindowHandles();
        
        // Create an iterator to iterate over the window handles
        Iterator<String> I1 = windows.iterator();
        
        // Get the parent window handle
        String parent = I1.next();
        
        // Get the child window handle
        String child = I1.next();
        
        // Switch to the child window
        driver.switchTo().window(child);
        
        // Optionally, perform any actions on the child window here
        // For example: driver.findElement(By.id("someElement")).click();
        
        // After finishing, switch back to the parent window (optional)
       // driver.switchTo().window(parent);
        
        
     WebElement  value =   driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[2]/div[1]/div[1]"));
     String getvalue = value.getText();
     
     System.out.println(getvalue);
     
     driver.switchTo().window(parent);
     
     
     WebElement address = driver.findElement(By.xpath("//input[@id='txtLocStrAddress1']"));
     address.sendKeys(getvalue);
     
        
      
       
       
        // Close the browser
       // driver.quit();
    }
}
