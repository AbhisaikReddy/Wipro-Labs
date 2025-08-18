package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("The Title is: "+driver.getTitle());
		
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Automation testing tools");
		search.submit();
		System.out.println("The Title is: "+driver.getTitle());
		
//		driver.findElement(By.name("btnK")).click();
	}

}
