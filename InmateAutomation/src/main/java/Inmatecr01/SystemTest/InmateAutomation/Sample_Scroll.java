package Inmatecr01.SystemTest.InmateAutomation;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Scroll {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://inmatecr01.sgssys.info");

        // Click Sign Up
        driver.findElement(By.xpath("(//a[text()='Sign Up'])[2]")).click();

        // Scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Thread.sleep(5000);

        // Click Terms of Service link
        driver.findElement(By.xpath("//a[@href='/Common/Termsofservice.aspx']")).click();

        // Handle window switching
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        
        String parentWindow = iterator.next();
        String childWindow = iterator.hasNext() ? iterator.next() : null;

        if (childWindow != null) {
            driver.switchTo().window(childWindow);
            driver.findElement(By.xpath("//button[@class='btnclose']")).click();
            driver.switchTo().window(parentWindow);
        }

        // Scroll to the bottom again
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        // Click Privacy Policy link
        driver.findElement(By.xpath("//a[@href='/Common/PrivacyPolicy.aspx']")).click();

        // Switch to Privacy Policy window if applicable
        windowHandles = driver.getWindowHandles();
        iterator = windowHandles.iterator();

        parentWindow = iterator.next();
        childWindow = iterator.hasNext() ? iterator.next() : null;

        if (childWindow != null) {
            driver.switchTo().window(childWindow);

            // Optional: Scroll in the Privacy Policy window
            js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
            Thread.sleep(5000);

            // Close the Privacy Policy window
            driver.findElement(By.xpath("//button[@class='btnclose']")).click();
            driver.switchTo().window(parentWindow);
        }

        // Cleanup
        driver.quit();
    }
}
