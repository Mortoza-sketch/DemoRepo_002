package GetTableDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTableDemoPractice_3 {

public static void main(String[] args) {
	
	
      System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");	
      ChromeDriver driver = new ChromeDriver ();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      
      driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
	  int rows = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/section/div/table/tbody/tr")).size();
	  System.out.println("Number of rows: " +rows);
	  int col = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/section/div/table/tbody/tr[1]/td")).size();
      System.out.println("Number of Columns: " +col);

      WebElement element = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]"));	
      System.out.println(element.getText());
      
    //*[@id="myTable"]/tr[1]/td[2]
      
      String firstXpath = "//*[@id=\"myTable\"]/tr[";
      String secondXpath = "]/td[";
      String lastXpath = "]";
      
      for (int i =1; i <=5; i++) {
    	  for (int j =2; j<=7; j++) {
    		  
    		  String finalXpath = firstXpath+i+secondXpath+j+lastXpath;
    		  WebElement element2 = driver.findElement(By.xpath(finalXpath));
    		  System.out.println(element2.getText());
    		  
    		  
    	  }
      }
	
	
	
	
	}

}
