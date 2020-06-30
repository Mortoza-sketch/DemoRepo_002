package WalmartTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class WalmartTestDemo_P1 {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver ();
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
	driver.get("https://www.walmart.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	String Title = driver.getTitle();
	System.out.println(Title); //It prints the Title of the entire page, not a specific part
	
	if (Title.equals("Walmart.com | Save Money. Live Better."))
		
	{
		System.out.println("The Title is correct accordingly ^_^");
	}
	
	else
		
	{
		System.out.println("The Title is not correct :/");
	}
    	
	driver.findElement(By.id("global-search-input")).sendKeys("Watches for Men");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='global-search-submit']//span[@class='g_b']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[contains(text(),'Fashion savings')]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//li[2]//div[1]//div[2]//div[5]//div[1]//a[1]")).click();  
    Thread.sleep(3000);
    
	}

}

