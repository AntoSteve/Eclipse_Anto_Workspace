package Udemy.Java.Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Locators2 {

    @Test
    public void testBrowser() {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    }
}