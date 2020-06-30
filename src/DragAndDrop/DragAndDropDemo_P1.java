package DragAndDrop;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropDemo_P1 {
public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();	
	
	WebElement source_element1 = driver.findElement(By.id("box6"));
	WebElement target_element1 = driver.findElement(By.id("box106"));
	Actions act1 = new Actions(driver);
	act1.dragAndDrop(source_element1, target_element1).build().perform();
    Thread.sleep(5000); 
	
    WebElement source_element2 = driver.findElement(By.id("box7"));
	WebElement target_element2 = driver.findElement(By.id("box107"));
	Actions act2 = new Actions(driver);
	act2.dragAndDrop(source_element2, target_element2).build().perform(); 
	Thread.sleep(5000); 
	
    WebElement source_element3 = driver.findElement(By.id("box5"));
	WebElement target_element3 = driver.findElement(By.id("box105"));
	Actions act3 = new Actions(driver);
	act3.dragAndDrop(source_element3, target_element3).build().perform(); 
	Thread.sleep(5000); 
	
    WebElement source_element4 = driver.findElement(By.id("box4"));
	WebElement target_element4 = driver.findElement(By.id("box104"));
	Actions act4 = new Actions(driver);
	act4.dragAndDrop(source_element4, target_element4).build().perform(); 
	Thread.sleep(5000); 
	
	WebElement source_element5 = driver.findElement(By.id("box3"));
	WebElement target_element5 = driver.findElement(By.id("box103"));
	Actions act5 = new Actions(driver);
	act5.dragAndDrop(source_element5, target_element5).build().perform(); 
	Thread.sleep(5000);  
	
	WebElement source_element6 = driver.findElement(By.id("box2"));
	WebElement target_element6 = driver.findElement(By.id("box102"));
	Actions act6 = new Actions (driver);
	act6.dragAndDrop(source_element6, target_element6).build().perform();
	Thread.sleep(5000); 
	
	WebElement source_element7 = driver.findElement(By.id("box1"));
	WebElement target_element7 = driver.findElement(By.id("box107"));
	Actions act7 = new Actions (driver);
	act7.dragAndDrop(source_element7, target_element7).build().perform();
    Thread.sleep(5000);
	
	}

}
