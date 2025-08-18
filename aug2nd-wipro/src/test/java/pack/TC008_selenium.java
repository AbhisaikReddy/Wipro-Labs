package pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC008_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		Alert a=driver.switchTo().alert();
		System.out.println("The msg is "+a.getText());
		a.accept();
		driver.findElement(By.id("confirm")).click();
		Alert c=driver.switchTo().alert();
		System.out.println("The msg is "+c.getText());
		c.accept();
		driver.findElement(By.id("prompt")).click();
		Alert p=driver.switchTo().alert();
		System.out.println("The msg is "+p.getText());
		p.sendKeys("Hey");
		p.accept();
	}

}
