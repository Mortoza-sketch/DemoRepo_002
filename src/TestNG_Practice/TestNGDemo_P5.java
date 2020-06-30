package TestNG_Practice;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGDemo_P5 {

WebDriver driver;

@Test (priority=1)
void display() throws InterruptedException

{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.id("btnLogin")).click();
    Thread.sleep(3000);   } 


@Test (priority =2)
void print() throws InterruptedException
	
{  
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.linkText("Logout")).click();
    Thread.sleep(6000);
    
}
@BeforeClass
void BeforeMethod()
{
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
     
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
}
	
@AfterClass
void AfterMethod() 

{
	   driver.quit();
    	
}

}
