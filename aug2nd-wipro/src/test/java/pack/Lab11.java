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

public class Lab11 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String s) throws InterruptedException {
	  page_obj po=new page_obj(driver);
	  
	  po.Desktop();
	  po.Mac();
	  po.Sort();
	  po.Search(s);
	  Thread.sleep(2000);
	  po.C_search(s);
	  		
//		driver.findElement(By.linkText("Desktops")).click();
//		driver.findElement(By.linkText("Mac (1)")).click();		
		
//		WebElement sort = driver.findElement(By.id("input-sort"));
//	      sort.click();
//	      sort.findElement(By.xpath("//option[contains(text(),'Name (A - Z)')]")).click();
//	      driver.findElement(By.xpath("//button[contains(@onclick,'cart.add')]")).click();
//	      
//	      WebElement search=driver.findElement(By.name("search"));
//	      search.clear();
//	      search.sendKeys(s);
//	      driver.findElement(By.className("input-group-btn")).click();
	          
//	      WebElement c=driver.findElement(By.id("input-search"));
//	      c.clear();
//	      c.sendKeys(s);
//	      driver.findElement(By.id("description")).click();
//	      driver.findElement(By.id("button-search")).click();
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
