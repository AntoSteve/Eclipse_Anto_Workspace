package Inmatecr01.SystemTest.InmateAutomation;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver new1 = new ChromeDriver();
        new1.get("https://inmatecr01.sgssys.info");

        try {
            // Take a screenshot
            File srcFile = ((TakesScreenshot) new1).getScreenshotAs(OutputType.FILE);
            
            // Specify the destination
            File destFile = new File("G:\\Screenshot-Check\\example_screenshot1.png");
            
            // Copy the file to the destination
            FileUtils.copyFile(srcFile, destFile);
            
            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        } finally {
            // Close the browser
            new1.quit();
        }
    }
}
