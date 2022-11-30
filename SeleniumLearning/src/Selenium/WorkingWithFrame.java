package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// driver will get the html id,name, xpath etc directly but not with frame
		driver.get("https://leafground.com/frame.xhtml");
		
		//frame or iframe are like external html (frame is nested inside html)
		//Switch to used only for 
		//Switch to alert
		//Switch to frame
		//Switch to window

		driver.switchTo().frame(0);
		WebElement clickMe1 = driver.findElement(By.id("Click"));
		clickMe1.click();
		String text = clickMe1.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();// Used only for frame handling
		
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		int size = totalframe.size();
		System.out.println(size);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement clickMe2 = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		clickMe2.click();
		String text2 = clickMe2.getText();
		System.out.println(text2);
		}

}
