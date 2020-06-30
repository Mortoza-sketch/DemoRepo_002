package Mentoring_Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRMTitleTest_P1 {
public static void main(String[] args) throws InterruptedException {


	
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver ();
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

   driver.get("https://opensource-demo.orangehrmlive.com/");
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
   driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
   driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
   Thread.sleep(3000);
   
   driver.findElement(By.id("btnLogin")).click();
   Thread.sleep(3000);
   
   String act_title = driver.getTitle();
   System.out.println(act_title);
   
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
