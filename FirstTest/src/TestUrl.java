import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUrl {

  public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
  driver.manage().window().maximize();
  driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=4994866544613676040&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiAgP6PBhDmARIsAPWMq6mflYJflrPI2YK6KFwDb8wBNZUrfrbXuoOOEJP3jpYmwtJgKNRcvE8aAtIAEALw_wcB");
  
  //Thread.sleep(1000);
  
WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));
textbox.sendKeys("mobile");

WebElement search = driver.findElement(By.id("nav-search-submit-button"));
search.click();

WebElement menu = driver.findElement(By.id("nav-hamburger-menu"));
menu.click();

WebElement close = driver.findElement(By.className("nav-sprite hmenu-close-icon"));
close.click();





	}

}
