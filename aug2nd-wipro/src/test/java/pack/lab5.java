package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		String title=driver.getTitle();
		if(title.equals("nopCommerce demo store. Home page title")) {
			System.out.println("Title is matched");
		}
		else {
			System.out.println("Title is not matched");
		}
		driver.navigate().to("https://in.search.yahoo.com/");
		System.out.println("current url : "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("current url : "+driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("current url : "+driver.getCurrentUrl());
		System.out.println("page source : "+driver.getPageSource());
	}

}
