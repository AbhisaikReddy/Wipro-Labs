package pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC009_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/window");
		driver.findElement(By.id("home")).click();
		String w=driver.getWindowHandle();
		System.out.println("Parent window "+w);
		System.out.println("url is "+driver.getCurrentUrl());
		driver.findElement(By.id("multi")).click();
		Set<String> m=driver.getWindowHandles();
		for(String c:m) {
			driver.switchTo().window(c);
			System.out.println("url is "+driver.getCurrentUrl());
			
		}
		driver.close();
		driver.quit();
				
	}

}
