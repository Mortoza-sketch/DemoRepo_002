package ImplicityAndExplicityWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ImplicityAndExplicityWaitDemo_P1 {
public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");		
    ChromeDriver driver = new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    WebElement firstname = driver.findElement(By.name("firstname"));
    WebElement lastname = driver.findElement(By.name("lastname"));
    WebElement email = driver.findElement(By.name("reg_email__"));
    WebElement password = driver.findElement(By.name("reg_passwd__"));
    
    
    sendKeys (driver, firstname, 10, "Sarfaraz");
    sendKeys (driver, lastname, 5, "Khan");
    sendKeys (driver, email, 15, "abcd@gmail.com");
    sendKeys (driver, password, 11, "abcd1234");
    
    WebElement forgotaccount = driver.findElement(By.partialLinkText("Forgot accoun"));
    clickOn (driver, forgotaccount, 5);
    
   
	}
 
    public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
    new WebDriverWait (driver, timeout).until(ExpectedConditions.visibilityOf(element));   
    element.sendKeys(value);
        
}
    public static void clickOn(WebDriver driver, WebElement element, int timeout) {
    new WebDriverWait (driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
    element.click();
    
    } 
    

}
