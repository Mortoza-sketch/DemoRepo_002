package WalmartTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartCountingLinksDemo_P1 {
public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	List <WebElement> links= driver.findElements(By.tagName("a"));
	System.out.println(links.size());

	for (WebElement e:links)    //used an array over here to scan
		
	{
		System.out.println(e.getText());
	}
	
	}

}
