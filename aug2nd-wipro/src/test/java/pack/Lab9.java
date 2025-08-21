package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab9 {
	WebDriver driver;
	@Parameters("browser")
  @Test
  public void f(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  driver.get("https://tutorialsninja.com/demo/index.php?");
		}
  }
}
