package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FormStudent {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	   WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
