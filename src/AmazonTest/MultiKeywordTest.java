package AmazonTest;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MultiKeywordTest {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();	
	
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	Actions act = new Actions (driver);
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();	
	
	

	}

}
