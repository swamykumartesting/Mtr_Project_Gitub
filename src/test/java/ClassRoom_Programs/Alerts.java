package ClassRoom_Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	
	public WebDriver driver;
	
  @Test
  public void doingalert() throws Exception {
	  
	  driver.findElement(By.id("alertButton")).click();
	  
	  Thread.sleep(3000);
	 
	  
	String str = driver.switchTo().alert().getText();
	System.out.println(str);
	 
	
	 driver.switchTo().alert().accept();
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
