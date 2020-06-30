package ImplicityAndExplicityWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityAndExplicityWaitDemo_P2 {

public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");		
    ChromeDriver driver = new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
    WebElement firstname = driver.findElement(By.name("firstname"));
    WebElement lastname = driver.findElement(By.name("lastname"));
    WebElement email = driver.findElement(By.name("reg_email__"));
    WebElement password = driver.findElement(By.name("reg_passwd__"));

	}

}
