package TitleTestOrangeHRM_P1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class TitleTestOrangeHRM_P1 {
public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    Thread.sleep(3000);
    
    driver.findElement(By.id("btnLogin")).click();
    
    String act_title = driver.getTitle();
    String exp_title = "OrangeHRM";
    
    if (act_title.equals(exp_title))
    	
    {
    	System.out.println("Test Passed");
    }
    
    else
    	
    {
    	System.out.println("Test Failed");
    }
    

	}

}
