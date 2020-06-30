package FacebookRegistrationTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CodeFromMohamad  {
	 WebDriver driver;
	  @Test
	   void display() throws InterruptedException {
		  
		  driver.findElement(By.id("u_0_m")).sendKeys("Mohamed");
		  Thread.sleep(3000);
		  
	  }
	  @BeforeClass
	  void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		   
		  }

	  @AfterClass
	  void afterClass() {
		  driver.quit();
	  }	
	  
	}


