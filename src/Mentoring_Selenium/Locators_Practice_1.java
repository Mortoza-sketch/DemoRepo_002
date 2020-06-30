package Mentoring_Selenium;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_Practice_1 {
public static void main(String[] args) throws InterruptedException, IOException {


	
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver ();
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

   driver.get("https://www.facebook.com/");
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
   driver.findElement(By.id("u_0_m")).sendKeys("Arafath");
   Thread.sleep(3000);
   driver.findElement(By.cssSelector("#u_0_o")).sendKeys("Khan");	  
   Thread.sleep(3000);
   driver.findElement(By.id("u_0_r")).sendKeys("265 670 9855");
   Thread.sleep(3000);
   driver.findElement(By.name("reg_passwd__")).sendKeys("@bcD1234");
   Thread.sleep(3000);	
   
   Select drop1 = new Select(driver.findElement(By.id("month")));
   drop1.selectByVisibleText("Feb");
   Select drop2 = new Select(driver.findElement(By.id("day")));
   drop2.selectByVisibleText("10");
   Select drop3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
   drop3.selectByVisibleText("1992");
   Thread.sleep(3000);
    
   driver.findElement(By.cssSelector("#u_0_7")).click();
   Thread.sleep(3000);

   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(src, new File ("C:/Users/tamji/eclipse-workspace/Mentoring_Selenium/src/Mentoring_Selenium/FbReg_4.png")); 
   Thread.sleep(5000);
   
   driver.close();
	
	}

}
