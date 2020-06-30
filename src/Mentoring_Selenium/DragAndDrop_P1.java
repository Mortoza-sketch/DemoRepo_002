package Mentoring_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_P1 {
public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver ();
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    WebElement source_element1 = driver.findElement(By.id("box1"));
    WebElement target_element1 = driver.findElement(By.id("box101"));
    Actions act1 = new Actions(driver);
    act1.dragAndDrop(source_element1, target_element1).build().perform();
    Thread.sleep(3000);
	
	}

}
