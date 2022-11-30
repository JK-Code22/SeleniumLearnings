package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// driver will get the html id,name, xpath etc directly but not with frame
		driver.get("https://leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.id("form:drag"));
		WebElement to = driver.findElement(By.id("form:drop"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		actions.dragAndDrop(from, to).build().perform();
		
		
	}

}
