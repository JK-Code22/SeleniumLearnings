package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkinhWithSelectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this code wont work
		
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/selectable.xhtml");
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='selectable']/li")); 
		
		int listSize = selectable.size();
		System.out.println(listSize); //it will print list size as 7 
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();
	}

}
