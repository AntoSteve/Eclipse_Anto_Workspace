package Inmatecr01.SystemTest.InmateAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WindowType;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_TestHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://inmatecr01.sgssys.info/");
		
		driver.switchTo().newWindow(WindowType.TAB);  // To access/ open new TAB 
		driver.get("https://inmates3.sgssys.info/");
		
	    Set<String> window = driver.getWindowHandles();
		
		Iterator<String> I1 = window.iterator();
		
		String parent = I1.next();
		String child  = I1.next();
		
		driver.switchTo().window(parent);
		
		//driver.switchTo().window(child);

	}

}
