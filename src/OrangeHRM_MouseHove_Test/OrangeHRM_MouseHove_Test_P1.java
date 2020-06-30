package OrangeHRM_MouseHove_Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_MouseHove_Test_P1 {

public static void main(String[] args) throws InterruptedException {

	  
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver ();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login"); 
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    Thread.sleep(3000);
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    Thread.sleep(3000);
    driver.findElement(By.id("btnLogin")).click();

    WebElement adminmoduel = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
    WebElement usermanagement = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
    WebElement systemuser = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
    
    Actions act = new Actions (driver);
    act.moveToElement(adminmoduel).moveToElement(usermanagement).moveToElement(systemuser).click().build().perform();
    
   
    //driver.close();
    
	}

}
