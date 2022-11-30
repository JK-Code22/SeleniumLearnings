package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		//Switch to used only for 
		//Switch to alert
		//Switch to frame
		//Switch to window

		WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert(); //Alert is an Interface can't create object
		alert.accept();
		
		WebElement confirmAlertBox = driver.findElement(By.id("j_idt88:j_idt93"));
		confirmAlertBox.click();
		Thread.sleep(3000);
		Alert confirmAlert =  driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement promptAlertBox = driver.findElement(By.id("j_idt88:j_idt104"));
		promptAlertBox.click();
		Thread.sleep(3000);
		Alert promptAlert =  driver.switchTo().alert();
		promptAlert.sendKeys("Jana");
		promptAlert.accept();
		}

}
