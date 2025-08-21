package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page_obj {
	WebDriver driver;
	WebElement sort ;
	WebElement search;
	WebElement c_search;
	
	public page_obj(WebDriver driver2) {
		this.driver=driver2;
		
	}
	By desktop=By.linkText("Desktops");
	By mac=By.linkText("Mac (1)");
	By s=By.xpath("//option[contains(text(),'Name (A - Z)')]");
	By btn=By.className("input-group-btn");
	By c=By.id("input-search");
	
	public void Desktop() {
		driver.findElement(desktop).click();
	}
	public void Mac() {
		driver.findElement(mac).click();
	}
	public void Sort() {
		sort =driver.findElement(By.id("input-sort"));
		sort.click();
		sort.findElement(s).click();
	}
	public void Search(String s1) {
		 search=driver.findElement(By.name("search"));
	      search.clear();
	      search.sendKeys(s1);
	      driver.findElement(btn).click();
	}
	public void C_search(String s1) {
		 c_search=driver.findElement(c);
		 c_search.clear();
		 c_search.sendKeys(s1);
	      driver.findElement(By.id("description")).click();
	      driver.findElement(By.id("button-search")).click();
	}
}
