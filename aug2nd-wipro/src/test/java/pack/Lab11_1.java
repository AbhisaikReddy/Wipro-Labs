package pack;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab11_1 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String s) throws InterruptedException {
	  page_obj po=new page_obj(driver);
	  
	  po.Desktop();
	  po.Mac();
	  po.Sort();
	 
	  		
//		driver.findElement(By.linkText("Desktops")).click();
//		driver.findElement(By.linkText("Mac (1)")).click();		
		
//		WebElement sort = driver.findElement(By.id("input-sort"));
//	      sort.click();
//	      sort.findElement(By.xpath("//option[contains(text(),'Name (A - Z)')]")).click();
//	      driver.findElement(By.xpath("//button[contains(@onclick,'cart.add')]")).click();

	      Thread.sleep(2000);	
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  System.out.println("Browser closed.");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "mobile"},
      new Object[] { "monitor"},
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
