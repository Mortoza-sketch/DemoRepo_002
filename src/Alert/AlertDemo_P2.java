package Alert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo_P2 {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    String Title = driver.getTitle();
    System.out.println("The title of the Page is: " +Title);
    
    String URL = driver.getCurrentUrl();
    System.out.println("The URL of the Page is: " +URL);
    
    driver.findElement(By.xpath("//input[@name='proceed']")).click();
    
    Alert alert = driver.switchTo().alert();
   
    String alertmessage = driver.switchTo().alert().getText();
    System.out.println(alertmessage);
    
    alert.accept();
   

	}

}
